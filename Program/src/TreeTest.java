
public class TreeTest {
	Node root;

	static class Node {
		int data;
		Node left, right;

		Node(int data) {
			this.data = data;
			left = right = null;
		}
	}

	public static void main(String[] args) {
		Node head = new Node(10);
		Node left = new Node(10);
		Node right = new Node(10);
	/*	head.right.data = 5;
		head.left.data = 15;
		head.left.right.data = 4;
		head.left.left.data = 2;*/

		int length = findTreeLength(head);
		System.out.println(length);
	}

	private static int findTreeLength(Node head) {
		int maxLeft = 0, maxRight = 0;
		if (head.left == null && head.right == null)
			return 1;
		else {
			if (head.left != null) {
				maxLeft += findTreeLength(head.left);
				maxLeft++;
			}

			if (head.right != null) {
				maxRight += findTreeLength(head.right);
				maxRight++;

			}

			return Math.max(maxLeft, maxRight);
		}
	}

}
