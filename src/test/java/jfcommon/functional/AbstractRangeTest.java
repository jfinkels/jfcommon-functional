/**
 * AbstractRangeTest.java
 * 
 * Copyright 2009, 2010 Jeffrey Finkelstein
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
 * Test class for the {@link AbstractRange} class.
 * 
 * @author Jeffrey Finkelstein
 * @since 0.1
 */
public class AbstractRangeTest {
  /** The maximum + 1 number in the range. */
  public static final int MAX = 17;
  /** The minimum number in the range. */
  public static final int MIN = 4;
  /** The increment by which the iterator steps over the range. */
  public static final int STEP = 3;

  /**
   * Test method for
   * {@link jfcommon.functional.AbstractRange#AbstractRange(int)}.
   */
  @Test
  public void testAbstractRangeInt() {
    int j = 0;
    for (final int i : new Range(MAX)) {
      assertEquals(j, i);
      j += 1;
    }

    assertEquals(j, MAX);
  }

  /**
   * Test method for
   * {@link jfcommon.functional.AbstractRange#AbstractRange(int, int)}.
   */
  @Test
  public void testAbstractRangeIntInt() {
    int j = MIN;
    for (final int i : new Range(MIN, MAX)) {
      assertEquals(j, i);
      j += 1;
    }

    assertEquals(j, MAX);
  }

  /**
   * Test method for
   * {@link jfcommon.functional.AbstractRange#AbstractRange(int, int, int)}.
   */
  @Test
  public void testAbstractRangeIntIntInt() {
    int j = MIN;
    for (final int i : new Range(MIN, MAX, STEP)) {
      assertEquals(j, i);
      j += STEP;
    }
  }

  /** Test method for {@link jfcommon.functional.AbstractRange#current()}. */
  @Test
  public void testCurrent() {
    final AbstractRange<Integer> range = new Range(MAX);
    assertEquals(-1, range.current());
    range.next();
    assertEquals(0, range.current());
  }

  /** Test method for {@link jfcommon.functional.AbstractRange#end()}. */
/*  @Test
  public void testEnd() {
    final AbstractRange<Integer> range = new Range(MAX);
    assertEquals(MAX, range.end());
  }*/

  /**
   * Test method for {@link jfcommon.functional.AbstractRange#hasNext()}.
   */
  @Test
  public void testHasNext() {
    final AbstractRange<Integer> range = new Range(1);

    assertTrue(range.hasNext());

    assertEquals(0, range.next().intValue());

    assertFalse(range.hasNext());

  }

  /**
   * Test method for {@link jfcommon.functional.AbstractRange#increment()}.
   */
/*  @Test
  public void testIncrement() {
    final AbstractRange<Integer> range = new Range(MIN, MAX, STEP);
    assertEquals(STEP, range.increment());
  }*/

  /**
   * Test method for {@link jfcommon.functional.AbstractRange#iterator()}.
   */
  @Test
  public void testIterator() {
    final AbstractRange<Integer> range = new Range(MIN, MAX, STEP);

    int i = MIN;
    final Iterator<Integer> iterator = range.iterator();
    while (iterator.hasNext()) {
      assertEquals(i, iterator.next().intValue());
      i += STEP;
    }

    assertFalse(iterator.hasNext());
  }

  /**
   * Test method for {@link jfcommon.functional.AbstractRange#next()}.
   */
  @Test
  public void testNext() {
    AbstractRange<Integer> range = new Range(MAX);

    for (int i = 0; i < MAX; ++i) {
      assertEquals(i, range.next().intValue());
    }

    try {
      range.next();
    } catch (final NoSuchElementException exception) {
      assertTrue(exception instanceof NoSuchElementException);
    }

    range = new Range(MIN, MAX);

    for (int i = MIN; i < MAX; ++i) {
      assertEquals(i, range.next().intValue());
    }

    try {
      range.next();
    } catch (final NoSuchElementException exception) {
      assertTrue(exception instanceof NoSuchElementException);
    }

    range = new Range(MIN, MAX, STEP);

    for (int i = MIN; i < MAX; i += STEP) {
      assertEquals(i, range.next().intValue());
    }

    try {
      range.next();
    } catch (final NoSuchElementException exception) {
      assertTrue(exception instanceof NoSuchElementException);
    }
  }

  /**
   * Test method for {@link jfcommon.functional.AbstractRange#remove()}.
   */
  @Test
  public void testRemove() {
    final AbstractRange<Integer> range = new Range(MAX);
    try {
      range.remove();
      TestUtils.shouldHaveThrownException();
    } catch (final UnsupportedOperationException exception) {
      assertTrue(exception instanceof UnsupportedOperationException);
    }
  }

  /**
   * Test method for {@link jfcommon.functional.AbstractRange#setCurrent(int)}.
   */
/*  @Test
  public void testSetCurrent() {
    final AbstractRange<Integer> range = new Range(MAX);
    range.setCurrent(MIN);
    assertEquals(MIN, range.current());
  }*/

  /**
   * Test method for {@link jfcommon.functional.AbstractRange#start()}.
   */
/*  @Test
  public void testStart() {
    final AbstractRange<Integer> range = new Range(MIN, MAX);
    assertEquals(MIN, range.start());
  }*/

}
