package com.epam.stack.main;

import java.util.Scanner;
import com.epam.stack.exception.StackUnderflowException;
import com.epam.stack.util.StackUtility;

/**
 * This is a main class, which interact with the users, and calls respective
 * services.
 * 
 * @author Manasa_Maddali
 *
 */

public class StackMain {
	/**
	 * This is a main method.
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scannerObject = new Scanner(System.in);
		StackUtility utilityObject = new StackUtility();

		boolean status = true;
		while (status) {
			System.out.println("Stack operations");
			System.out.println("push  pop  peek  is_empty  size  display  stop");

			String choice = scannerObject.next();
			switch (choice) {
			case "push":
				System.out.println("Enter integer element to push");
				utilityObject.push(scannerObject.nextInt());
				break;
			case "pop":
				try {
					System.out.println("Popped Element = " + utilityObject.pop());
				} catch (StackUnderflowException e) {
					System.out.println("Error : " + e.getMessage());
				}
				break;
			case "peek":
				try {
					System.out.println("Peek Element = " + utilityObject.peek());
				} catch (StackUnderflowException e) {
					System.out.println("Error : " + e.getMessage());
				}
				break;
			case "is_empty": {
				System.out.println("Status = " + utilityObject.isEmpty());
				break;

			}
			case "size": {
				System.out.println("Size = " + utilityObject.getSize());
				break;
			}
			case "display": {
				utilityObject.display();
				break;
			}
			case "stop": {
				status = false;
				break;
			}
			default: {
				System.out.println("Wrong Entry \n ");
				break;
			}
			}
			utilityObject.display();

		}
	}
}
