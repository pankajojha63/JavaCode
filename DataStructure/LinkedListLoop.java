package list.linkedlist;

public class LinkedListLoop {
	static Node head;

	class Node {
		int data;
		Node next;

		Node(int value) {
			this.data = value;
			next = null;
		}
	}

	public void push(int new_data) {
		Node new_node = new Node(new_data);
		new_node.next = head;
		head = new_node;
	}

	public static void main(String[] args) {
		LinkedListLoop llist = new LinkedListLoop();
		llist.push(20);
		llist.push(4);
		llist.push(15);
		llist.push(10);

		llist.head.next.next.next.next = llist.head;
		llist.detectLoop(head);
	}

	private void detectLoop(Node head) {
		Node pointerA = head, pointerB = head;
		int flag = 0;
		while (pointerA != null && pointerB != null && pointerB.next != null) {
			pointerA = pointerA.next;
			pointerB = pointerB.next.next;
			if (pointerA == pointerB) {
				flag = 1;
				break;
			}
		}
		if (flag == 1) {
			System.out.println("Loop Detected");
		} else {
			System.out.println("No loop found");
		}
	}
}
