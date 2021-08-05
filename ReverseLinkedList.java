package test;

public class ReverseLinkedList {
	static Node head;

	static class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	static void printList(Node node) {
		while (node != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
	}

	public static void main(String[] args) {
		ReverseLinkedList list = new ReverseLinkedList();
		list.head = new Node(85);
		list.head.next = new Node(15);
		list.head.next.next = new Node(4);
		list.head.next.next.next = new Node(20);

		printList(head);
		System.out.println("\n---reversing list now---\n");
		head = reverseList(head);
		printList(head);
	}

	private static Node reverseList(Node node) {
		Node prev = null;
		Node current = node;
		Node next = null;
		while(current != null){
			next = current.next;
			current.next=prev;
			prev = current;
			current = next;
		}
		return prev;
	}
}
