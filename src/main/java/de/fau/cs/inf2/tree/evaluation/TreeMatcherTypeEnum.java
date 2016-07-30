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

public enum TreeMatcherTypeEnum {
  CD("CD"),
  CD_A("CD_A"),
  CD_AB("CD_AB"),
  CD_ABCDE("CD_ABCDE"),
  CD_ACDE("CD_ACDE"),
  CD_B("CD_B"),
  CD_BCDE("CD_BCDE"),
  CD_CDE("CD_CDE"),
  CD_SEQ("CD_SEQ"),
  CD_ABCDE_SEQ("CD_ABCDE_SEQ"),
  MTDIFF_GTAST("MTDIFF_GTAST"),
  MTDIFF_GTAST_SEQ("MTDIFF_GTAST_SEQ"),
  MTDIFF_CDAST("MTDIFF_CDAST"),
  MTDIFF_CDAST_SEQ("MTDIFF_CDAST_SEQ"),
  MTDIFF_JSYNCAST("MTDIFF_JSYNCAST"),
  MTDIFF_JSYNCAST_SEQ("MTDIFF_JSYNCAST_SEQ"),
  GT("GT"),
  GT_A("GT_A"),
  GT_AB("GT_AB"),
  GT_ABCDE("GT_ABCDE"),
  GT_ACDE("GT_ACDE"),
  GT_B("GT_B"),
  GT_BCDE("GT_BCDE"),
  GT_CDE("GT_CDE"),
  JSYNC("JSYNC"),
  JSYNC_A("JSYNC_A"),
  JSYNC_AB("JSYNC_AB"),
  JSYNC_ABCDE("JSYNC_ABCDE"),
  JSYNC_ACDE("JSYNC_ACDE"),
  JSYNC_B("JSYNC_B"),
  JSYNC_BCDE("JSYNC_BCDE"),
  JSYNC_CDE("JSYNC_CDE"),
  RTED("RTED"),
  RTED_A("RTED_A"),
  RTED_AB("RTED_AB"),
  RTED_ABCDE("RTED_ABCDE"),
  RTED_ACDE("RTED_ACDE"),
  RTED_B("RTED_B"),
  RTED_BCDE("RTED_BCDE"),
  RTED_CDE("RTED_CDE");

  public final String type;

  TreeMatcherTypeEnum(String type) {
    this.type = type;
  }
}
