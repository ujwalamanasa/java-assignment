package com.epam.stack.test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
import com.epam.stack.exception.StackUnderflowException;
import com.epam.stack.util.StackUtility;

public class StackTest {
	/**
	 * creates an instance of StackUtility class.
	 */

	StackUtility stack = new StackUtility();

	/**
	 * Test for removing elements from the stack.
	 * 
	 * @throws Exception
	 *             when removing from empty stack.
	 */
	@Test
	public void popTest() throws StackUnderflowException {
		stack.push(10);
		stack.push(20);
		assertEquals(20, stack.pop());
		assertEquals(10, stack.pop());
	}

	/**
	 * Test for size of the stack.
	 * 
	 * @throws Exception
	 *             when removing from empty stack.
	 */
	@Test
	public void stackSizeTest() throws StackUnderflowException {
		stack.push(10);
		assertEquals(1, stack.getSize());
		stack.pop();
		assertEquals(0, stack.getSize());
	}

	/**
	 * Test for the status of stack.
	 * 
	 * @throws StackUnderflowException
	 */
	@Test
	public void isStackEmptyTest() throws StackUnderflowException {
		assertTrue(stack.isEmpty());
		stack.push(10);
		assertFalse(stack.isEmpty());
		stack.pop();
		assertTrue(stack.isEmpty());

	}

	/**
	 * Test for the peek element.
	 * 
	 * @throws StackUnderflowException
	 */
	@Test()
	public void peekTest() throws StackUnderflowException {
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		assertEquals(40, stack.peek());
	}
}
