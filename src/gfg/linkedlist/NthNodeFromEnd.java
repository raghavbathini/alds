package gfg.linkedlist;

public class NthNodeFromEnd {

	public static void main(String[] args) {
		int a[] = {34,78,29,45,55};
//		int a[] = {23,71};
		Node head = null;
		for(int i=0; i<a.length; i++)
			head = AddPrint.addAtEnding(head, a[i]);
		AddPrint.printLinkedList(head);	
		nthNodeFromEnd_1(head, 5);
		nthNodeFromEnd_2(head, 5);
	}
	
	public static void nthNodeFromEnd_1(Node head, int n) {
		if(head == null)
			return;
		int length = AddPrint.getLength(head);
		if(length < n)
			return;
		Node current = head;
		for(int i=1; i<length-n+1; i++)
			current = current.next;
		System.out.println("node "+n+" from end of linkedlist is----> "+ current.data);
	}
	
	public static void nthNodeFromEnd_2(Node head, int n) {
		if(head == null)
			return;
		Node fast = head;
		Node slow = head;
		for(int i=1; i<n; i++) {
			if(fast.next == null)
				return;
			fast = fast.next;
		}
		while(fast.next!=null) {
			fast = fast.next;
			slow = slow.next;
		}
		System.out.println("node "+n+" from end of linkedlist is----> "+ slow.data);
	}
	
	
}

