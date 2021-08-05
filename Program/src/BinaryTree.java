
public class BinaryTree {
	static Node root;

	class Node {
		int data;
		Node right, left;

		Node(int data) {
			this.data = data;
			left = right = null;
		}
	}

	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		Node root = null;
		root = tree.insert(root, 4);
		tree.insert(root, 2);
		tree.insert(root, 1);
		tree.insert(root, 3);
		tree.insert(root, 6);
		tree.insert(root, 5);

		printNode(root);
	}

	private static void printNode(Node node) {
		System.out.println(node.data);
	}

	private Node insert(Node node, int data) {
		if (node == null) {
			return (new Node(data));
		} else {

			/* 2. Otherwise, recur down the tree */
			if (data <= node.data) {
				node.left = insert(node.left, data);
			} else {
				node.right = insert(node.right, data);
			}

			/* return the (unchanged) node pointer */
			return node;
		}
	}

}