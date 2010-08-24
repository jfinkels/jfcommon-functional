/**
 * ToClassTester.java
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
package jfcommon.functional.operators;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Test class for the ToClass class.
 * 
 * @author Jeffrey Finkelstein
 * @since 0.1
 */
public class ToClassTester {

  /**
   * Test method for
   * {@link jfcommon.functional.operators.ToClass#execute(java.lang.Object)}.
   */
  @Test
  public void testExecute() {
    ToClass<Number> function = new ToClass<Number>();
    assertEquals(Integer.class, function.execute(new Integer(0)));
    assertEquals(Double.class, function.execute(new Double(0.0d)));
    assertEquals(Long.class, function.execute(new Long(0l)));
    assertEquals(Float.class, function.execute(new Float(0.0f)));
  }

}
