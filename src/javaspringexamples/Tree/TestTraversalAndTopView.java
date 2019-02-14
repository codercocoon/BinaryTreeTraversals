package javaspringexamples.Tree;

public class TestTraversalAndTopView {

	public static void main(String[] args) {

		// Create the binary tree
		Node root = new Node(10);
		Node node_9 = root.setLeft(6).setLeft(9);
		node_9.setLeft(1);
		node_9.setRight(8);
		Node node_30 = root.setRight(3).setRight(30);
		node_30.setLeft(19);
		node_30.setRight(20);

		BinaryTree bt = new BinaryTree();
		// Preorder : 10 6 9 1 8 3 30 19 20
		System.out.println("Preorder Traversal : (must be 10 6 9 1 8 3 30 19 20)");
		bt.preOrder(root);
		System.out.println();
		// Postorder : 1 8 9 6 19 20 30 3 10
		System.out.println("Postorder Traversal : (must be 1 8 9 6 19 20 30 3 10)");
		bt.postOrder(root);
		System.out.println();
		// Inorder : 1 9 8 6 10 3 19 30 20
		System.out.println("Inorder Traversal : (must be 1 9 8 6 10 3 19 30 20)");
		bt.inOrder(root);
		System.out.println();
		// Top view : 1 9 6 10 3 30 20
		System.out.println("Top view (recursively way) : (must be 1 9 6 10 3 30 20)");
		bt.topViewRecursive(root);
		System.out.println();
		System.out.println("Top view (iterative way) : (must be 1 9 6 10 3 30 20)");
		bt.topView(root);
		System.out.println();
		// Level Order Traversal : 10 6 3 9 30 1 8 19 20
		System.out.println("Level Order Traversal : (must be 10 6 3 9 30 1 8 19 20)");
		bt.levelOrderTraversal(root);
	}
}
