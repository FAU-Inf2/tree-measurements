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

import java.util.Date;

public class PSOResult {
	public static final int VERSION = 1;
	public double bestSolution;
	boolean boundVelocity;
	double convergenceThreshold;

	int maxNumberOfIterations;

	int numberOfParticles;
	double paramA;

	double paramBGlob;
	double paramBLoc;
	public Date time;

	public String uri;
	public double[] values;
	int version;

	public PSOResult(double[] values, String uri, Date time, double convergenceThreshold, int numberOfParticles,
			int maxNumberOfIterations, double paramA, double paramBLoc, double paramBGlob, boolean boundVelocity,
			double bestSolution, int version) {
		this.values = values;
		this.uri = uri;
		this.time = time;
		this.convergenceThreshold = convergenceThreshold;
		this.numberOfParticles = numberOfParticles;
		this.maxNumberOfIterations = maxNumberOfIterations;
		this.paramA = paramA;
		this.paramBLoc = paramBLoc;
		this.paramBGlob = paramBGlob;
		this.boundVelocity = boundVelocity;
		this.bestSolution = bestSolution;
		this.version = version;
	}

	public PSOResult(double[] values, String uri, double convergenceThreshold, int numberOfParticles,
			int maxNumberOfIterations, double paramA, double paramBLoc, double paramBGlob, boolean boundVelocity,
			double bestSolution) {
		this(values, uri, convergenceThreshold, numberOfParticles, maxNumberOfIterations, paramA, paramBLoc, paramBGlob,
				boundVelocity, bestSolution, VERSION);
	}

	public PSOResult(double[] values, String uri, double convergenceThreshold, int numberOfParticles,
			int maxNumberOfIterations, double paramA, double paramBLoc, double paramBGlob, boolean boundVelocity,
			double bestSolution, int version) {
		this(values, uri, new Date(), convergenceThreshold, numberOfParticles, maxNumberOfIterations, paramA, paramBLoc,
				paramBGlob, boundVelocity, bestSolution, version);
	}

}
