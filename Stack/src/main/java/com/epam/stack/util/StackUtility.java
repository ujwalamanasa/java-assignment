package com.epam.stack.util;

import com.epam.stack.exception.StackUnderflowException;

/**
 * This class performs all basic operations of the stack.
 *
 * @author Manasa_Maddali
 *
 */

public class StackUtility implements StackDao {
	Node top;
	int size;

	public StackUtility() {
		top = null;
		size = 0;
	}

	/**
	 * This method checks if the stack is empty or not.
	 * 
	 * @return true if empty.
	 */
	public boolean isEmpty() {
		if (top != null) {
			return false;
		} else {
			return true;
		}
	}

	/**
	 * This method is used to compute the size of stack.
	 * 
	 * @return no of elements in the stack.
	 */
	public int getSize() {
		return size;
	}

	/**
	 * This method inserts elements on to the stack.
	 * 
	 * @param data
	 *            it is a integer value.
	 */
	public void push(final int data) {
		Node nodePtr = new Node(data, null);
		if (top == null)
			top = nodePtr;
		else {
			nodePtr.setLink(top);
			top = nodePtr;
		}
		size++;
	}

	/**
	 * This method removes elements from the stack.
	 * 
	 * @return removed element of the stack.
	 * @throws StackUnderflowException
	 *             when stack is empty.
	 */
	public int pop() throws StackUnderflowException {
		if (isEmpty()) {
			throw new StackUnderflowException();
		}
		Node nodePtr = top;
		top = nodePtr.getLink();
		size--;
		return nodePtr.getData();
	}

	/**
	 * This method returns the top element of the stack.
	 * 
	 * @return peek element.
	 * @throws StackUnderflowException
	 *             when stack is empty.
	 */
	public int peek() throws StackUnderflowException {
		if (isEmpty()) {
			throw new StackUnderflowException();
		}
		return top.getData();
	}

	/**
	 * Displays all the elements of the stack.
	 */
	public void display() {
		System.out.println("Elements in stack: ");
		if (size == 0) {
			System.out.println("Stack is empty");
			return;
		}
		Node nodePtr = top;
		while (nodePtr != null) {
			System.out.print(nodePtr.getData() + " ");
			nodePtr = nodePtr.getLink();
		}
		System.out.println();
	}

}
