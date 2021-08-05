package test;

//Floyd's cycle algorithm
public class LinkedListLoopImpl {
	public static void main(String[] args) {
		LinkedListLoop list = new LinkedListLoop();
		list.push(20);
		list.push(4);
		list.push(15);
		list.push(10);

		list.head.next.next.next.next = list.head;
		list.detectLoop();
	}
}

class LinkedListLoop {
	Node head;

	class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	public void push(int new_data) {
		Node new_node = new Node(new_data);

		new_node.next = head;

		head = new_node;
	}

	public void detectLoop() {
		Node slow = head;
		Node fast = head;

		boolean flag = false;
		while (slow != null && fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast) {
				flag = true;
				break;
			}
		}
		if (flag) {
			System.out.println("Loop Detected");
		} else {
			System.out.println("No Loop found");
		}
	}
}