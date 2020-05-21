package gfg.linkedlist;

public class FindMiddle {

	public static void main(String[] args) {
		int a[] = {34,78,29,45,55};
//		int a[] = {23,71};
		Node head = null;
		for(int i=0; i<a.length; i++)
			head = AddPrint.addAtEnding(head, a[i]);
		AddPrint.printLinkedList(head);	
		findMiddle_1(head);
		findMiddle_2(head);
	}
	
	public static void findMiddle_1(Node head) {
		if(head == null)
			return;
		int length = AddPrint.getLength(head);
		Node current = head;
		for(int i=0; i<length/2; i++)
			current = current.next;
		System.out.println("Middle of linkedlist is----> "+ current.data);
	}
	
	public static void findMiddle_2(Node head) {
		if(head == null)
			return;
		Node fast = head;
		Node slow = head;
		while(fast!=null && fast.next!=null) {
			fast = fast.next.next;
			slow = slow.next;
		}
		System.out.println("Middle of linkedlist is----> "+ slow.data);
	}
	
	
}

