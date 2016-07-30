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

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;

public class ValidationEntry {
  public DiffSummary firstSummary;
  public String id;
  public List<ValidationRating> ratings;
  public DiffSummary secondSummary;
  public int validationInfoId;
  
  /**
   * Instantiates a new validation entry.
   *
   * @param id the id
   * @param firstSummary the first summary
   * @param secondSummary the second summary
   * @param ratings the ratings
   */
  public ValidationEntry(String id, DiffSummary firstSummary, DiffSummary secondSummary,
      List<ValidationRating> ratings, int validationInfoId) {
    this.id = id;
    this.firstSummary = firstSummary;
    this.secondSummary = secondSummary;
    this.ratings = ratings;
    this.validationInfoId = validationInfoId;
  }

  /**
   * Instantiates a new validation entry.
   *
   * @param firstSummary the first summary
   * @param secondSummary the second summary
   * @param ratings the ratings
   */
  public ValidationEntry(DiffSummary firstSummary, DiffSummary secondSummary,
      List<ValidationRating> ratings, int validationInfoId) {
    this.firstSummary = firstSummary;
    this.secondSummary = secondSummary;
    this.ratings = ratings;
    this.validationInfoId = validationInfoId;
    this.id = getHash(firstSummary, secondSummary);

    


  }

  private static String getHash(DiffSummary firstSummary, DiffSummary secondSummary) {
    StringBuilder builder = new StringBuilder();
    builder.append(firstSummary.commitBefore);
    builder.append(firstSummary.commitAfter);
    builder.append(firstSummary.file);
    builder.append(firstSummary.type.name());
    builder.append(secondSummary.commitBefore);
    builder.append(secondSummary.commitAfter);
    builder.append(secondSummary.file);
    builder.append(secondSummary.type.name());
    String beforeHash = firstSummary.commitBefore + firstSummary.commitAfter
        + firstSummary.file + firstSummary.type.name() 
        + secondSummary.commitBefore + secondSummary.commitAfter
        + secondSummary.file + secondSummary.type.name();
    byte[] bytesOfMessage;
    try {
      bytesOfMessage = beforeHash.getBytes("UTF-8");
      MessageDigest md = MessageDigest.getInstance("MD5");

      final byte[] theDigest = md.digest(bytesOfMessage);
      final StringBuffer sb = new StringBuffer();
      for (int i = 0; i < theDigest.length; ++i) {
        sb.append(Integer.toHexString((theDigest[i] & 0xFF) | 0x100).substring(1, 3));
      }
      return sb.toString();
    } catch (UnsupportedEncodingException e) {
      e.printStackTrace();
    } catch (NoSuchAlgorithmException e) {
      e.printStackTrace();
    }
    return null;
  }
  
}
