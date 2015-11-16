/*
 * Copyright (c) 2015 Programming Systems Group, CS Department, FAU
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

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import de.fau.cs.inf2.tree.evaluation.DiffSummary;
import de.fau.cs.inf2.tree.evaluation.PSOResult;
import de.fau.cs.inf2.tree.evaluation.TimeSummary;
import de.fau.cs.inf2.tree.evaluation.TreeMatcherTypeEnum;
import de.fau.cs.inf2.tree.evaluation.ValidationDecision;
import de.fau.cs.inf2.tree.evaluation.ValidationDecisionList;
import de.fau.cs.inf2.tree.evaluation.ValidationEntry;
import de.fau.cs.inf2.tree.evaluation.ValidationEnum;
import de.fau.cs.inf2.tree.evaluation.ValidationRating;
import de.fau.cs.inf2.tree.evaluation.ValidationSummary;

public class TreeEvalIO {
	public static enum DataFormat {
		FORMAT_CBOR, FORMAT_JSON, FORMAT_SMILE
	}

	@JsonTypeInfo(use = JsonTypeInfo.Id.CLASS, include = JsonTypeInfo.As.PROPERTY, property = "@class")
	private abstract static class MixInDiffSummary {
		@JsonProperty("branch")
		public String branch;

		@JsonProperty("commitAfter")
		public String commitAfter;

		@JsonProperty("commitBefore")
		public String commitBefore;

		@JsonProperty("date")
		public Date date;

		@JsonProperty("deletes")
		public int deletes;

		@JsonProperty("file")
		public String file;

		@JsonProperty("inserts")
		public int inserts;

		@JsonProperty("matches")
		public int matches;

		@JsonProperty("moves")
		public int moves;

		@JsonProperty("type")
		public TreeMatcherTypeEnum type;

		@JsonProperty("updates")
		public int updates;

		@JsonProperty("uri")
		public String uri;

		MixInDiffSummary(@JsonProperty("type") TreeMatcherTypeEnum type,

				@JsonProperty("matches") int matches,

				@JsonProperty("inserts") int inserts,

				@JsonProperty("moves") int moves,

				@JsonProperty("deletes") int deletes,

				@JsonProperty("updates") int updates,

				@JsonProperty("uri") String uri,

				@JsonProperty("branch") String branch,

				@JsonProperty("commitBefore") String commitBefore,

				@JsonProperty("commitAfter") String commitAfter,

				@JsonProperty("file") String file,

				@JsonProperty("date") Date date) {
		}
	}

	@JsonTypeInfo(use = JsonTypeInfo.Id.CLASS, include = JsonTypeInfo.As.PROPERTY, property = "@class")
	private abstract static class MixInPSOResult {
		@JsonProperty("bestSolution")
		double bestSolution;

		@JsonProperty("boundVelocity")
		boolean boundVelocity;

		@JsonProperty("convergenceThreshold")
		double convergenceThreshold;

		@JsonProperty("maxNumberOfIterations")
		int maxNumberOfIterations;

		@JsonProperty("numberOfParticles")
		int numberOfParticles;

		@JsonProperty("paramA")
		double paramA;

		@JsonProperty("paramBGlob")
		double paramBGlob;

		@JsonProperty("paramBLoc")
		double paramBLoc;

		@JsonProperty("time")
		Date time;

		@JsonProperty("uri")
		String uri;

		@JsonProperty("values")
		double[] values;

		@JsonProperty("version")
		int version;

		MixInPSOResult(@JsonProperty("values") double[] values, @JsonProperty("uri") String uri,
				@JsonProperty("time") Date time, @JsonProperty("convergenceThreshold") double convergenceThreshold,
				@JsonProperty("numberOfParticles") int numberOfParticles,
				@JsonProperty("maxNumberOfIterations") int maxNumberOfIterations, @JsonProperty("paramA") double paramA,
				@JsonProperty("paramBLoc") double paramBLoc, @JsonProperty("paramBGlob") double paramBGlob,
				@JsonProperty("boundVelocity") boolean boundVelocity, @JsonProperty("bestSolution") double bestSolution,
				@JsonProperty("version") int version) {
		}

	}

	@JsonTypeInfo(use = JsonTypeInfo.Id.CLASS, include = JsonTypeInfo.As.PROPERTY, property = "@class")
	private abstract static class MixInTimeSummary {
		@JsonProperty("diffSummary")
		public DiffSummary diffSummary;

		@JsonProperty("nanoTimeList")
		public ArrayList<Long> nanoTimeList;

		MixInTimeSummary(@JsonProperty("diffSummary") DiffSummary node,
				@JsonProperty("nanoTimeList") ArrayList<Long> nanoTimeList) {
		}

	}

	@JsonTypeInfo(use = JsonTypeInfo.Id.CLASS, include = JsonTypeInfo.As.PROPERTY, property = "@class")
	private abstract static class MixInTreeMatcherTypeEnum {
		@JsonProperty("type")
		public String type;

		MixInTreeMatcherTypeEnum(@JsonProperty("type") String type) {
		}

	}

	@JsonTypeInfo(use = JsonTypeInfo.Id.CLASS, include = JsonTypeInfo.As.PROPERTY, property = "@class")
	private abstract static class MixInValidationDecision {

		@JsonProperty("answer")
		public ValidationEnum answer;
		@JsonProperty("entryID")
		public int entryID;

		MixInValidationDecision(@JsonProperty("entryID") int entryID, @JsonProperty("answer") ValidationEnum answer) {
		}

	}

	@JsonTypeInfo(use = JsonTypeInfo.Id.CLASS, include = JsonTypeInfo.As.PROPERTY, property = "@class")
	private abstract static class MixInValidationDecisionList {

		@JsonProperty("decisions")
		public List<ValidationDecision> decisions;

		MixInValidationDecisionList(@JsonProperty("decisions") List<ValidationDecision> decisions

		) {
		}

	}

	@JsonTypeInfo(use = JsonTypeInfo.Id.CLASS, include = JsonTypeInfo.As.PROPERTY, property = "@class")
	private abstract static class MixInValidationEntry {
		@JsonProperty("firstSummary")
		public DiffSummary firstSummary;
		@JsonProperty("id")
		public int id;
		@JsonProperty("ratings")
		public List<ValidationRating> ratings;
		@JsonProperty("secondSummary")
		public DiffSummary secondSummary;

		MixInValidationEntry(@JsonProperty("id") int id, @JsonProperty("firstSummary") DiffSummary firstSummary,
				@JsonProperty("secondSummary") DiffSummary secondSummary,
				@JsonProperty("ratings") List<ValidationRating> ratings) {
		}

	}

	@JsonTypeInfo(use = JsonTypeInfo.Id.CLASS, include = JsonTypeInfo.As.PROPERTY, property = "@class")
	private abstract static class MixInValidationEnum {
		@JsonProperty("answer")
		public String answer;

		MixInValidationEnum(@JsonProperty("answer") String answer) {
		}

	}

	@JsonTypeInfo(use = JsonTypeInfo.Id.CLASS, include = JsonTypeInfo.As.PROPERTY, property = "@class")
	private abstract static class MixInValidationRating {

		@JsonProperty("decision")
		public ValidationDecision decision;
		@JsonProperty("raterID")
		public int raterID;

		MixInValidationRating(@JsonProperty("raterID") int raterID,
				@JsonProperty("decision") ValidationDecision decision) {
		}

	}

	@JsonTypeInfo(use = JsonTypeInfo.Id.CLASS, include = JsonTypeInfo.As.PROPERTY, property = "@class")
	private abstract static class MixInValidationSummary {
		@JsonProperty("validations")
		public List<ValidationEntry> validations;

		MixInValidationSummary(@JsonProperty("validations") List<ValidationEntry> validations) {
		}

	}

	private static void addMixIns(ObjectMapper mapper, Class targetClass, Class mixInClass) {
		mapper.addMixIn(targetClass, mixInClass);
	}

	public static ObjectMapper createJSONMapper() {
		return createJSONMapper(DataFormat.FORMAT_JSON);
	}

	public static ObjectMapper createJSONMapper(final DataFormat format) {
		final ObjectMapper mapper;
		{
			switch (format) {
			case FORMAT_JSON: {
				mapper = new ObjectMapper();
				break;
			}
			default: {
				assert (false);
				return null;
			}
			}
		}

		// configure mapper
		{
			mapper.enable(SerializationFeature.INDENT_OUTPUT);
			mapper.setVisibilityChecker(mapper.getVisibilityChecker().with(JsonAutoDetect.Visibility.NONE));
			mapper.setSerializationInclusion(Include.NON_NULL);
			DateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.S");
			mapper.setDateFormat(df);
			addMixIns(mapper, TimeSummary.class, MixInTimeSummary.class);
			addMixIns(mapper, DiffSummary.class, MixInDiffSummary.class);
			addMixIns(mapper, TreeMatcherTypeEnum.class, MixInTreeMatcherTypeEnum.class);
			addMixIns(mapper, PSOResult.class, MixInPSOResult.class);
			addMixIns(mapper, ValidationDecision.class, MixInValidationDecision.class);
			addMixIns(mapper, ValidationDecisionList.class, MixInValidationDecisionList.class);
			addMixIns(mapper, ValidationEntry.class, MixInValidationEntry.class);
			addMixIns(mapper, ValidationEnum.class, MixInValidationEnum.class);
			addMixIns(mapper, ValidationRating.class, MixInValidationRating.class);
			addMixIns(mapper, ValidationSummary.class, MixInValidationSummary.class);
		}

		return mapper;
	}
}
