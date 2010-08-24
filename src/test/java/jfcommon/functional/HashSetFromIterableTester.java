/**
 * HashSetFromIterableTester.java
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

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

/**
 * Test class for the HashSetFromIterable class.
 * 
 * @author Jeffrey Finkelstein
 * @since 0.1
 */
public class HashSetFromIterableTester {

  /**
   * Test method for
   * {@link jfcommon.functional.HashSetFromIterable#HashSetFromIterable(java.lang.Iterable)}
   * .
   */
  @Test
  public void testHashSetFromIterable() {
    final List<Integer> list = new ArrayList<Integer>();

    for (final int i : new Range(100)) {
      list.add(i);
    }

    final HashSetFromIterable<Integer> set = new HashSetFromIterable<Integer>(
        list);

    for (final int i : new Range(100)) {
      assertTrue(set.contains(i));
    }
  }

}
