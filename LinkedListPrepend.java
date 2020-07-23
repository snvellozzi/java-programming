class Node {
	int item;
	Node next = null;
	
	public Node(int item) {
		this.item = item;
	}
}

public class LinkedListPrepend {
	Node head; 

//adds new node to beginning of linked list
	public void prepend(int item) {
		Node nHead = new Node(item);	//creates new node
		nHead.next = head;	//changes head pointer
		head = nHead;	//new head pointer
	}
}
