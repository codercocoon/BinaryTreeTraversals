package javaspringexamples.Tree;

public class Node {
	int data;
	Node left;
	Node right;

	Node(int _data) {
		data = _data;
	}

	/**
	 * Creates a node and affects it to the right child.
	 * 
	 * @param _data
	 * @return the right child node created.
	 */
	public Node setRight(int _data) {
		right = new Node(_data);
		return right;
	}

	/**
	 * Creates a node and affects it to the left child.
	 * 
	 * @param _data
	 * @return the left child node created.
	 */
	public Node setLeft(int _data) {
		left = new Node(_data);
		return left;
	}
}
