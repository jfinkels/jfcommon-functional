/**
 * MappingException.java
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
 * This Exception is thrown when there is a problem executing a mapping
 * function.
 * 
 * @author Jeffrey Finkelstein
 * @since 0.1
 */
public class MappingException extends Exception {

  /** Default generated serial version UID. */
  private static final long serialVersionUID = -1932344069161736982L;

  /**
   * Instantiate this class by calling the default constructor of the
   * superclass.
   */
  public MappingException() {
    super();
  }

  /**
   * Instantiate this Exception with the specified human-readable message.
   * 
   * @param message
   *          A human-readable message explaining the problem.
   */
  public MappingException(final String message) {
    super(message);
  }

  /**
   * Instantiate this Exception with the specified human-readable message and
   * the specified cause.
   * 
   * @param message
   *          A human-readable message explaining the problem.
   * @param cause
   *          The cause of this Exception.
   */
  public MappingException(final String message, final Throwable cause) {
    super(message, cause);
  }

  /**
   * Instantiate this Exception with the specified cause.
   * 
   * @param cause
   *          The cause of this Exception.
   */
  public MappingException(final Throwable cause) {
    super(cause);
  }

}
