package interview.persistent;


public class NthNodeFromLast_LL {

	public static void main(String[] args) {
		
		Node head = createLL();

		
		printAll(head);
		
		int n = 3;
		
		nthnodefromend(head, n);
		
		

	}
	
	 static Node createLL() {
		Node head = null;
		head = addAtBegin(head, 5);
		head = addAtEnd(head, 9);
		head = addAtBegin(head, 4);
		head = addAtEnd(head, 10);
		head = addAtEnd(head, 16);
		head = addAtEnd(head, 23);
		
		return head;
	}
	
	static Node addAtBegin(Node head, int data) {
		Node temp = new Node(data);
		if(head == null) {
			head = temp;
		}else {
			temp.next = head;
			head = temp;
		}
		return head;
	}
	
	static Node addAtEnd(Node head, int data) {
		Node temp = new Node(data);
		if(head == null) {
			head = temp;
		}else {
			Node current = null;
			for(current = head; current.next!=null; current = current.next);
			current.next = temp;
		}
		return head;
	}
	
	static void printAll(Node head) {
		Node current = null;
		for(current = head; current!=null; current = current.next)
			System.out.println(current.data);
	}
	
	static int nthnodefromend(Node head, int n) {
		Node current = null;
		Node temp = head;
		int count = 0;
		while(count < n) {
			temp = temp.next;
			count++;
		}
		for(current = temp; current!=null; current=current.next) {
			head = head.next;
			}
		System.out.println("nth node from end is: "+head.data);
		return head.data;
	}
	
}

class Node{
	int data;
	Node next;
	
	Node(int data){
		this.data = data;
	}
	
}


	

	

