package javaspringexamples.Tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * This class represents some operations about Trees, especially how to
 * traversal a tree in different ways : preOrder, postOrder, inOrder, top view
 * and level order.
 * 
 * @author mounir.sahrani@gmail.com
 *
 */
public class BinaryTree {

	/**
	 * Preorder traversal.
	 * 
	 * @param root
	 *            : root of the tree.
	 */
	public void preOrder(Node root) {
		if (root == null)
			return;
		System.out.print(root.data + " ");
		preOrder(root.left);
		preOrder(root.right);
	}

	/**
	 * Postorder traversal.
	 * 
	 * @param root
	 *            : root of the tree.
	 */
	public void postOrder(Node root) {
		if (root == null)
			return;
		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.data + " ");
	}

	/**
	 * Inorder traversal.
	 * 
	 * @param root
	 *            : root of the tree.
	 */
	public void inOrder(Node root) {
		if (root == null)
			return;
		inOrder(root.left);
		System.out.print(root.data + " ");
		inOrder(root.right);
	}

	/**
	 * Top view in iterative way.
	 * 
	 * @param root
	 *            : root of the tree.
	 */
	public void topView(Node root) {
		Node current = root;

		Stack<Node> s = new Stack<>();
		while (current != null) {
			s.push(current);
			current = current.left;
		}
		while (!s.isEmpty()) {
			System.out.print(s.pop().data + " ");
		}

		current = root.right;
		while (current != null) {
			System.out.print(current.data + " ");
			current = current.right;
		}
	}

	/**
	 * Top view recursively way.
	 * 
	 * @param root
	 *            : root of the tree.
	 */
	public void topViewRecursive(Node root) {
		topViewLeft(root);
		topViewRight(root.right);
	}

	private void topViewLeft(Node root) {
		if (root != null) {
			topViewLeft(root.left);
			System.out.print(root.data + " ");
		}
	}

	private void topViewRight(Node root) {
		if (root != null) {
			System.out.print(root.data + " ");
			topViewRight(root.right);
		}
	}

	/**
	 * Level order traversal.
	 * 
	 * @param root
	 *            : root of the tree.
	 */
	public void levelOrderTraversal(Node root) {
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		while (!q.isEmpty()) {
			Node n = q.poll();
			System.out.print(n.data + " ");
			if (n.left != null)
				q.add(n.left);
			if (n.right != null)
				q.add(n.right);
		}
	}
}