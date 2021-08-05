package list.linkedlist;

public class LinkedList {
	static Node head;
	static class Node {
		int data;
		Node next;
		Node(int value) {
			this.data = value;
			next = null;
		}
	}
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.head = new Node(12);
		list.head.next = new Node(15);
		list.head.next.next = new Node(5);
		list.head.next.next.next = new Node(55);
		list.head.next.next.next.next = new Node(30);

		list.print(head);
		head = list.reverse(head);
		System.out.print("\nreverse List--->");
		list.print(head);
	}
	void print(Node node) {
		while (node != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
	}

	Node reverse(Node node) {
		Node prev = null;
		Node current = node;
		Node next = null;

		while (current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		node = prev;
		return prev;
	}
}
