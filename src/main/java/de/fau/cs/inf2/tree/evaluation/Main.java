/*
 * Copyright (c) 2015-2016 Programming Systems Group, CS Department, FAU
 *
 * Permission is hereby granted, free of charge, to any person obtaining a
 * copy of this software and associated documentation files (the "Software"),
 * to deal in the Software without restriction, including without limitation
 * the rights to use, copy, modify, merge, publish, distribute, sublicense,
 * and/or sell copies of the Software, and to permit persons to whom the
 * Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING
 * FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER
 * DEALINGS IN THE SOFTWARE.
 *
 */

package de.fau.cs.inf2.tree.evaluation;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;



/**
 * A simple program that demonstrates the use of the Java interface to the
 * json files used for the evaluation.
 */
public final class Main {

  private static final File DIR_EXAMPLES = new File("examples");
	private static final File DIR_DATA    = new File("data");



	private Main() {
	}

	/**
	 * Parses data/validation/validation.json and prints the total number of
	 * votes.
	 */
	private static void readValidationDataAndPrint(File path) {
	  File validationDir = new File (path, "/validation/");
		File validationInputFile = new File(validationDir, "val_input.json");
		ObjectMapper mapper = TreeEvalIO.createJSONMapper();
		try {
			ValidationInputSummary summary = mapper.readValue(validationInputFile, ValidationInputSummary.class);
			int sum = -1;
			if (summary != null && summary.validations != null) {
			  sum = summary.validations.size();
			}
			System.out.println("Validation input size: "+sum);
			File[] files = validationDir.listFiles();
			int votes = 0;
			if (files != null) {
			  for (File raterDir : files) {
			    if (raterDir.isDirectory()) {
			      File rating = new File(raterDir.getAbsolutePath() + "/voting.json");
            ValidationDecisionList list = mapper.readValue(rating, ValidationDecisionList.class);
            if (list != null && list.decisions != null) {
              votes += list.decisions.size();
            }
			    }
			  }
			}
			System.out.println("Validation votes: "+votes);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * Parses data/pso and prints the total number of
	 * pso runs.
	 */
	private static void readPSODataAndPrint() {
		File psoDir = new File(DIR_DATA,"/pso/");
		ObjectMapper mapper = TreeEvalIO.createJSONMapper();
		int sum = 0;
		for (final File folder : psoDir.listFiles((f) -> f.isDirectory())) {
			for (final File psoFile : folder.listFiles((f) -> f.getName().endsWith(".json"))) {
				try {
				  PsoResult result = mapper.readValue(psoFile, PsoResult.class);
					if (result != null) {
						sum++;
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		System.out.println("PSO runs: "+sum);

	}
	
	/**
	 * Parses path/repositories and prints the total number of
	 * edit script results.
	 */
	private static void readEditScriptsAndPrint(File path) {
		File repositories = new File(path,"/repositories/");
		ObjectMapper mapper = TreeEvalIO.createJSONMapper();
		int sum = 0;
		for (final File repository : repositories.listFiles((f) -> f.isDirectory())) {
			for (final File commitOld : repository.listFiles((f) -> f.isDirectory())) {
				for (final File commitNew : commitOld.listFiles((f) -> f.isDirectory())) {
					for (final File changedFile : commitNew.listFiles((f) -> f.isDirectory())) {
            int numberOfFiles = changedFile.listFiles((f) -> f.getName().endsWith(".json")).length;
						for (final File resultFile : changedFile.listFiles((f) -> f.getName().endsWith(".json"))) {
							try {
								DiffSummary result = mapper.readValue(resultFile, DiffSummary.class);
								if (numberOfFiles >= 23) { // only count file revision if all necessery tree differencing versions produced results
  								if (result != null && result.type == TreeMatcherTypeEnum.MTDIFF_GTAST) {
  								  if (result.deletes + result.inserts + result.updates + result.moves > 0) { // only count files with changes
  								    sum++;
  								  }
  								}
								}
							} catch (IOException e) {
								e.printStackTrace();
							}
						}
					}
				}
			}
		}
		System.out.println("Edit script results found: "+sum);
	}
	
	/**
	 * Parses path/time and prints the total number of
	 * time measurements.
	 */
	private static void readTimeAndPrint(File path) {
		File repositories = new File(path,"/time/");
		ObjectMapper mapper = TreeEvalIO.createJSONMapper();
		int sum = 0;
		for (final File repository : repositories.listFiles((f) -> f.isDirectory())) {
			for (final File commitOld : repository.listFiles((f) -> f.isDirectory())) {
				for (final File commitNew : commitOld.listFiles((f) -> f.isDirectory())) {
					for (final File changedFile : commitNew.listFiles((f) -> f.isDirectory())) {
						for (final File measurementFile : changedFile.listFiles((f) -> f.getName().endsWith(".json"))) {
							try {
								TimeSummary result = mapper.readValue(measurementFile, TimeSummary.class);
								if (result != null) {
									sum++;
								}
							} catch (IOException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						}
					}
				}
			}
		}
		System.out.println("Time measurements found: "+sum);
	}

	public static void main(final String[] args) {
		readValidationDataAndPrint(DIR_EXAMPLES);
		readPSODataAndPrint();
		readEditScriptsAndPrint(DIR_EXAMPLES);
		readTimeAndPrint(DIR_EXAMPLES);
	}
}

