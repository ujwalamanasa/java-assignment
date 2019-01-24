package com.epam.stack.util;

/**
 * This class contains a list Node.
 * 
 * @author Manasa_Maddali
 *
 */

public class Node {
	/**
	 * Integer data.
	 */
	int data;
	/**
	 * Reference variable of type node.
	 */
	Node link;

	/**
	 * This is a default constructor.
	 */
	public Node() {
		data = 0;
		link = null;
	}

	/**
	 * This constructor is called to create a node.
	 * 
	 * @param d
	 *            sets the data field.
	 * @param l
	 *            sets the link.
	 */

	public Node(final int d, final Node l) {
		data = d;
		link = l;
	}

	/**
	 * This method is used to get data from current node.
	 * 
	 * @return data of current node.
	 */
	public int getData() {
		return data;
	}

	/**
	 * This method is used to set data to the current node.
	 * 
	 * @param link
	 *            initialize current node.
	 */
	public void setData(final int data) {
		this.data = data;
	}

	/**
	 * This method is used to get link to next node.
	 * 
	 * @return link to next node.
	 */
	public Node getLink() {
		return link;
	}

	/**
	 * This method is used to set link to next node.
	 * 
	 * @param link
	 *            initialize the node link.
	 */
	public void setLink(final Node link) {
		this.link = link;
	}

}
