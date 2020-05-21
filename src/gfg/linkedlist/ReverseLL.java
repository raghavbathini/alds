package gfg.linkedlist;

public class ReverseLL {

	public static void main(String[] args) {
		int a[] = {34,78,29,45,55};
//		int a[] = {23,71};
		Node head = null;
		for(int i=0; i<a.length; i++)
			head = AddPrint.addAtEnding(head, a[i]);
		AddPrint.printLinkedList(head);	
//		nthNodeFromEnd_1(head, 5);
		reverseLL_2(head);
	}
	
	
	public static void reverseLL_2(Node head) {
		if(head == null)
			return;
		Node current = head;
		Node prev = null;
		Node next = null;
		while(current!=null) {
			next = current.next;
			current.next = prev;
			
			prev = current;
			current = next;
		}
		
		AddPrint.printLinkedList(prev);
		
	}
	
	
}

