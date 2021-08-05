package tree.binaryTree;

public class BinaryTreeSum {
	static class Node {
		Node left, right;
		int data;
	}

	public static void main(String[] args) {
		Node root = newNode(10);
		root.left = newNode(2);
		root.right = newNode(3);
		root.left.left = newNode(4);
		root.left.right = newNode(5);
		root.right.left = newNode(6);
		root.right.right = newNode(7);
		root.right.left.right = newNode(8);

		int sum = addBT(root);
		System.out.println("Sum of all the elements is: " + sum);

	}

	private static int addBT(Node root) {
		if(root == null)
			return 0;
		else
			return root.data + (addBT(root.left))+ addBT(root.right);
	}

	private static Node newNode(int i) {
		Node node = new Node();
		node.data = i;
		node.left = node.right = null;
		return node;
	}
}
