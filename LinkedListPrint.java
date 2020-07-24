/*
     * Given for reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */

public class LinkedListPrint {
	//prints elements of linked list in order, one per line (practiced writing just the method, not entire class)  
	    static void printLinkedList(SinglyLinkedListNode head) {
	        if(head == null) return;
	        while(head != null){
	            System.out.println(head.data);
	            head = head.next;
	        }
	    }
	}
