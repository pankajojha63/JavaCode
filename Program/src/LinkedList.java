
public class LinkedList {
	static Node head;

	static class Node {
		char data;
		Node next;

		Node(char c) {
			this.data = c;
			next = null;
		}

	}

	public Node reverse(Node node) {
		while (node != null) {
			char c = node.data;
			Node next;
			Node prev;
			if (c == (' ')) {
				next = node.next;
				
			}
		}

		return node;
	}

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.reverse(head);
	}
}
//O->N->E-> ->T->W->O
//T->W->O-> ->O->N->E
//-------------------------------------
// O->N->E-> ->T->W->O-> ->F->O->U->R-> ->S->I->X-> ->T->E->N
// T->W->O-> ->O->N->E-> ->F->O->U->R-> ->S->I->X-> ->T->E->N
// F->O->U->R-> ->T->W->O-> ->O->N->E-> ->S->I->X-> ->T->E->N
// S->I->X-> ->F->O->U->R-> ->T->W->O-> ->O->N->E-> ->T->E->N
// T->E->N-> ->S->I->X-> ->F->O->U->R-> ->T->W->O-> ->O->N->E