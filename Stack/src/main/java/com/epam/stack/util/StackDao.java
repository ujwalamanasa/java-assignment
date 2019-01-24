package com.epam.stack.util;

import com.epam.stack.exception.StackUnderflowException;

/**
 * This interface contains all the abstract methods for stack implementation.
 * 
 * @author Manasa_Maddali
 *
 */
public interface StackDao {
	/**
	 * This method checks if the stack is empty or not.
	 * 
	 * @return true if empty.
	 */
	boolean isEmpty();

	/**
	 * This method is used to compute the size of stack.
	 * 
	 * @return no of elements in the stack.
	 */
	int getSize();

	/**
	 * This method inserts elements on to the stack.
	 * 
	 * @param data
	 *            it is a integer value.
	 */
	void push(final int data);

	/**
	 * This method removes elements from the stack.
	 * 
	 * @return removed element of the stack.
	 * @throws StackUnderflowException
	 *             when stack is empty.
	 */
	int pop() throws StackUnderflowException;

	/**
	 * This method returns the top element of the stack.
	 * 
	 * @return peek element.
	 * @throws StackUnderflowException
	 *             when stack is empty.
	 */
	int peek() throws StackUnderflowException;

	/**
	 * Displays all the elements of the stack.
	 */
	void display();
}
