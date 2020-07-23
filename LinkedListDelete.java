class Node {
	int item;
	Node next = null;
	
	public Node(int item) {
		this.item = item;
	}
}

public class LinkedListDelete {
	Node head;

//deletes node with specified value
	public void deleteGivenValue(int item) {
		if(head == null) return;
		if(head.item == item) {	//if head is the value to be deleted
			head = head.next;
		}
		
		Node current = head;
		while(current.next != null) {
			if(current.next.item == item) {	//if value in node next to current is to be deleted
				current.next = current.next.next;
				return;
			}
			current = current.next;	//moves to next element
		}
	}
}
