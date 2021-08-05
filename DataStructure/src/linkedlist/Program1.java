package linkedlist;

public class Program1 {
	static Node head;

	static class Node {
		int value;
		Node next;

		Node(int data) {
			this.value = data;
			next = null;
		}
	}

	void print(Node node) {
		while (node != null) {
			System.out.println(node.value);
			if (node.next == null)
				break;
			else
				node = node.next.next;
		}
	}

	Node reverseList(Node node) {
		Node prev = null;
		Node current = head;
		Node next = null;

		while (current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		return prev;
	}

	public static void main(String[] args) {
		Program1 list = new Program1();
		list.head = new Node(85);
		list.head.next = new Node(15);
		list.head.next.next = new Node(4);
		list.head.next.next.next = new Node(20);
		list.head.next.next.next.next = new Node(35);

		list.print(head);
		head = list.reverseList(head);
		list.print(head);
	}
}