class Node {
	int item;
	Node next = null;
	
	public Node(int item) {
		this.item = item;
	}
}

public class LinkedListAdd {
	Node head;
	
//appends node to linked list
	public void add(int item) {
		if(head == null) {
			head = new Node(item);		//creates head
			return;
		}
		Node current = head;
		while(current.next != null) {
			current = current.next;		//continues if not at end of linked list
		}
		current.next = new Node(item);	//creates new node
	}

}
