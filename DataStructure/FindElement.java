package list.linkedlist;

public class FindElement {
	static Node head;
	static char[] chArr = new char[5];
	static int index = 0;

	static class Node {
		char[] data;
		Node next;

		Node(char[] data) {
			this.data = data;
			next = null;
		}
	}

	public void findIndexElement(Node node, int target) {
		while (node != null) {
			char[] ch = node.data;
			for (int i = 0; i < ch.length; i++) {
				chArr[index] = ch[i];
				index++;
			}
			node = node.next;
		}
		System.out.println(chArr[target-1]);
	}

	public static void main(String[] args) {
		FindElement code = new FindElement();
		char[] ch = { 'a', 'b', 'c' };
		code.head = new Node(ch);
		char[] ch1 = { 'd' };
		code.head.next = new Node(ch1);
		char[] ch2 = { 'e' };
		code.head.next.next = new Node(ch2);

		int k = 4;
		code.findIndexElement(head, k);
	}
}