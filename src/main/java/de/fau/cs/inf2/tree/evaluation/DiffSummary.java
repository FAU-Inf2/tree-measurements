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

public class DiffSummary {

	public String branch;
	public String commitAfter;
	public String commitBefore;
	public Date date;
	public int deletes = 0;
	public String file;
	public int inserts = 0;
	public int matches;
	public int moves = 0;
	public TreeMatcherTypeEnum type;
	public int updates = 0;
	public String uri;

	public DiffSummary(TreeMatcherTypeEnum type, int matches, int inserts, int moves, int deletes, int updates,
			String uri, String branch, String commitBefore, String commitAfter, String file, Date date) {
		this.type = type;
		this.matches = matches;
		this.inserts = inserts;
		this.moves = moves;
		this.deletes = deletes;
		this.updates = updates;
		this.uri = uri;
		this.branch = branch;
		this.commitBefore = commitBefore;
		this.commitAfter = commitAfter;
		this.file = file;
		this.date = date;

	}

}
