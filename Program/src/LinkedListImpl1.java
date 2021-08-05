
public class LinkedListImpl1 {
	static Node head;

	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			next = null;
		}
	}

	private void insertNode(int value) {
		if (head == null) {
			head = new Node(value);
		} else {
			Node node = new Node(value);
			Node prev = head.next;
			while (prev == null) {
				node = prev;
			}
			prev = prev.next;
			
		}

	}

	private void printNode(Node node) {
		while (node.next != null) {
			System.out.println(node.data);
		}
		node = node.next;
	}
	
	private void deleteNode(Node node, int data) {
		Node next = null, prev =null;
		while (node.next != null) {
			prev = node.next;
			if(node.data == data){
				next =node.next; 
			}
		}
		node = node.next;
	}

	public static void main(String[] args) {
		LinkedListImpl1 list = new LinkedListImpl1();
		list.insertNode(10);
		list.insertNode(20);
		list.insertNode(30);
		list.insertNode(40);
		
		
		list.deleteNode(head , 30);

		list.printNode(head);
	}
}
