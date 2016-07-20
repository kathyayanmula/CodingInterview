package linkedList;

public class MiddleElement {
	
	public Node middle(Node head){
		
		Node fast = head;
		Node slow = head;
		
		while(fast != null && fast.next != null){
			slow = slow.next;
			fast = fast.next.next;
		}
		slow.next = null;
		return slow;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

 

