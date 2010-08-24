/**
 * IterableStringTester.java
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
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Iterator;
import java.util.NoSuchElementException;

import jfcommon.test.TestUtils;

import org.junit.Test;

/**
 * Test class for the {@link IterableString} class.
 * 
 * @author Jeffrey Finkelstein
 * @since 0.1
 */
public class IterableStringTester {
  /** The string to test. */
  public static final String STRING = "Hello, world!";

  /**
   * Test method for {@link jfcommon.functional.IterableString#iterator()}.
   */
  @Test
  public void testIterator() {
    final Iterator<Character> iterator = new IterableString(STRING).iterator();

    int i = 0;
    while (iterator.hasNext()) {
      assertEquals(STRING.charAt(i), iterator.next().charValue());
      i += 1;
    }

    assertFalse(iterator.hasNext());
    try {
      iterator.next();
      TestUtils.shouldHaveThrownException();
    } catch (final NoSuchElementException exception) {
      assertEquals(STRING.length(), i);
    }
  }

  /**
   * Test method for {@link jfcommon.functional.IterableString#hasNext()}.
   */
  @Test
  public void testHasNext() {
    assertFalse(new IterableString("").hasNext());
  }

  /**
   * Test method for {@link jfcommon.functional.IterableString#next()}.
   */
  @Test
  public void testNext() {
    try {
      new IterableString("").next();
      TestUtils.shouldHaveThrownException();
    } catch (final NoSuchElementException exception) {
      assertTrue(exception instanceof NoSuchElementException);
    }
  }

  /**
   * Test method for {@link jfcommon.functional.IterableString#remove()}.
   */
  @Test
  public void testRemove() {
    try {
      new IterableString(STRING).remove();
    } catch (final UnsupportedOperationException exception) {
      assertTrue(exception instanceof UnsupportedOperationException);
    }
  }

}
