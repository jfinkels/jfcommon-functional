/**
 * IdentityFunction.java
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

/**
 * The identity function on the domain of type T.
 * 
 * @param <T>
 *          The type of the domain of this function.
 * @author Jeffrey Finkelstein
 * @since 0.1
 */
public class IdentityFunction<T> implements Function<T, T> {

  /**
   * Return exactly the specified input.
   * 
   * @param input
   *          The input.
   * @return Exactly the specified input.
   * @see jfcommon.functional.Function#execute(java.lang.Object)
   */
  @Override
  public T execute(final T input) {
    return input;
  }

}
