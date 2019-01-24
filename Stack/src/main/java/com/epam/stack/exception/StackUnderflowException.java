package com.epam.stack.exception;

/**
 * If the stack is empty and if we try to access the elements of the stack.
 * 
 * @author Manasa_Maddali
 *
 */
public class StackUnderflowException extends Exception {

	/**
		 * 
		 */
	private static final long serialVersionUID = 1L;

	/**
	 * return a string if the stack is empty and if we pop elements of the stack.
	 * 
	 * @return string.
	 */
	public String toString() {
		return "Stack is empty";
	}
}
