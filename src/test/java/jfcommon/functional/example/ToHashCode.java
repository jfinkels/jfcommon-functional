/**
 * ToHashCode.java
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
package jfcommon.functional.example;

import jfcommon.functional.Function;

/**
 * A function which maps objects to their hash codes.
 * 
 * @author Jeffrey Finkelstein
 * @since 0.1
 */
public class ToHashCode implements Function<Object, Integer> {

  /**
   * Returns the hash code of the specified object.
   * 
   * @param input
   *          An object.
   * @return The hash code of the specified object.
   * @see jfcommon.functional.Function#execute(java.lang.Object)
   */
  @Override
  public Integer execute(final Object input) {
    return input.hashCode();
  }

}
