/**
 * RangeTester.java
 * 
 * Copyright 2010 Jeffrey Finkelstein
 * 
 * This file is part of jfcommon-functional.
 * 
 * jfcommon-functional is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by the Free
 * Software Foundation, either version 3 of the License, or (at your option) any
 * later version.
 * 
 * jfcommon-functional is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for more
 * details.
 * 
 * You should have received a copy of the GNU General Public License along with
 * jfcommon-functional. If not, see <http://www.gnu.org/licenses/>.
 */
package jfcommon.functional;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Test class for the Range class.
 * 
 * @author Jeffrey Finkelstein
 * @since 0.1
 */
public class RangeTester {

  /**
   * Test method for {@link jfcommon.functional.Range#Range(int)}.
   */
  @Test
  public void testRangeInt() {
    int j = 0;
    for (final int i : new Range(10)) {
      assertEquals(j, i);
      j += 1;
    }

    assertEquals(10, j);
  }

  /**
   * Test method for {@link jfcommon.functional.Range#Range(int, int)}.
   */
  @Test
  public void testRangeIntInt() {
    int j = 5;
    for (final int i : new Range(5, 10)) {
      assertEquals(j, i);
      j += 1;
    }

    assertEquals(10, j);
  }

  /**
   * Test method for {@link jfcommon.functional.Range#Range(int, int, int)}.
   */
  @Test
  public void testRangeIntIntInt() {
    int j = 0;
    for (final int i : new Range(0, 10, 2)) {
      assertEquals(j, i);
      j += 2;
    }

    assertEquals(10, j);
  }

  /**
   * Test method for {@link jfcommon.functional.Range#getValue()}.
   */
  @Test
  public void testGetValue() {
    final Range range = new Range(10);
    for (int i = 0; i < 10; ++i) {
      range.next();
      assertEquals(i, range.getValue().intValue());
    }
  }

}
