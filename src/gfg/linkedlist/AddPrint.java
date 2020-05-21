package gfg.linkedlist;

public class AddPrint {

	public static void main(String[] args) {
		Node head = null;
		head = addAtEnding(head, 48);
		head = addAtBegining(head, 23);
		head = addAtEnding(head, 62);
		head = addAtBegining(head, 45);
		head = addAtEnding(head, 89);
		head = addAtBegining(head, 99);
		head = addAtBegining(head, 74);
		printLinkedList(head);

	}
	
	
	public static Node addAtBegining(Node head, int data) {
		Node temp = new Node(data);
		if(head == null)
			head = temp;
		else{
			temp.next = head;
			head = temp;
		}
		return head;
	}
	
	
	public static Node addAtEnding(Node head, int data) {
		Node temp = new Node(data);
		if(head == null)
			head = temp;
		else{
			Node current = null;
			for(current = head; current.next!=null; current=current.next);
			current.next = temp;
		}
		return head;
	}
	
	
	public static void printLinkedList(Node head) {
		
		for(Node current = head; current!=null; current=current.next)
			System.out.print(current.data+ " --> ");
		System.out.println();
	}
	
	public static int getLength(Node head) {
		int count = 0;
		for(Node current = head; current!=null; current=current.next)
			count++;
		System.out.println("Length of linkedlist is----> "+ count);
		return count;
	}
	
	

}

class Node{
	int data;
	Node next;
	Node(int data){
		this.data = data;
	}
}



