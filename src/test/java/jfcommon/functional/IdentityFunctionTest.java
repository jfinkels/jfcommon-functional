/**
 * IdentityFunctionTest.java
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

import static org.junit.Assert.assertSame;

import org.junit.Test;

/**
 * Test class for the {@link IdentityFunction} class.
 * 
 * @author Jeffrey Finkelstein
 * @since 0.1
 */
public class IdentityFunctionTest {

  /**
   * Test method for
   * {@link jfcommon.functional.IdentityFunction#execute(java.lang.Object)} .
   */
  @Test
  public void testExecute() {
    final IdentityFunction<Object> function = new IdentityFunction<Object>();

    final Object input1 = new Object();
    final Object input2 = new Object();
    final Object input3 = new Object();

    assertSame(input1, function.execute(input1));
    assertSame(input2, function.execute(input2));
    assertSame(input3, function.execute(input3));
  }

}
