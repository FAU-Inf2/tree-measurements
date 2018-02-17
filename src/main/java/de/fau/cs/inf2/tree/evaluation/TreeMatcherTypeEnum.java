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
  RTED_CDE("RTED_CDE"),
  CD_A_SEQ("CD_A_SEQ"),
  CD_ABC("CD_ABC"),
  CD_ABCD("CD_ABCD"),
  CD_ABCDEF("CD_ABCDEF"),
  CD_B_SEQ("CD_B_SEQ"),
  CD_C_SEQ("CD_C_SEQ"),
  CD_D_SEQ("CD_D_SEQ"),
  CD_E_SEQ("CD_E_SEQ"),
  CD_F_SEQ("CD_F_SEQ"),
  CD_C("CD_C"),
  CD_D("CD_D"),
  CD_E("CD_E"),
  CD_F("CD_F"),
  CD_ABCDEF_SEQ("CD_ABCDEF_SEQ"),
  MTDIFF_JDIME("MTDIFF_JDIME"),
  MTDIFF_JDIME_SEQ("MTDIFF_JDIME_SEQ"),
  GT_ABC("GT_ABC"),
  GT_ABCD("GT_ABCD"),
  GT_ABCDEF("GT_ABCDEF"),
  GT_C("GT_C"),
  GT_D("GT_D"),
  GT_E("GT_E"),
  GT_F("GT_F"),
  JSYNC_ABC("JSYNC_ABC"),
  JSYNC_ABCD("JSYNC_ABCD"),
  JSYNC_ABCDEF("JSYNC_ABCDEF"),
  JSYNC_C("JSYNC_C"),
  JSYNC_D("JSYNC_D"),
  JSYNC_E("JSYNC_E"),
  JSYNC_F("JSYNC_F"),
  RTED_ABC("RTED_ABC"),
  RTED_ABCD("RTED_ABCD"),
  RTED_ABCDEF("RTED_ABCDEF"),
  RTED_C("RTED_C"),
  RTED_D("RTED_D"),
  RTED_E("RTED_E"),
  RTED_F("RTED_F"),
  JDIME("JDIME"),
  JDIME_A("JDIME_A"),
  JDIME_B("JDIME_B"),
  JDIME_C("JDIME_C"),
  JDIME_D("JDIME_D"),
  JDIME_E("JDIME_E"),
  JDIME_F("JDIME_F"),
  JDIME_AB("JDIME_AB"),
  JDIME_ABC("JDIME_ABC"),
  JDIME_ABCD("JDIME_ABCD"),
  JDIME_ABCDE("JDIME_ABCDE"),
  JDIME_ABCDEF("JDIME_ABCDEF");
  public final String type;

  TreeMatcherTypeEnum(String type) {
    this.type = type;
  }
}
