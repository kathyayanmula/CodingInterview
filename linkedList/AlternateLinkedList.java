package linkedList;
public class AlternateLinkedList {

	static void alternativeSplit(Node pList) {
        
        if(pList == null)
           return;
        Node odd = pList;
        Node even = pList.next;
        
        while(odd != null){
            if(even != null)
                odd.next = even.next;
            else
                odd.next = null;
            odd = odd.next;
            if(even != null){
                if(odd != null)
                    even.next = odd.next;
                else
                    even.next = null;
                even = even.next;
            }
        }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head = new Node(1);
		Node temp = head;
		for(int i = 2; i < 3; i++){
			temp.next = new Node(i);
			temp = temp.next;
		}
		temp.next = null;
		temp = head;
		while(temp != null){
			System.out.print(temp.val);
			System.out.print(" ");
			temp = temp.next;
		}
		System.out.println();
		Node odd = head;
		Node even = head.next;
		alternativeSplit(head);
		while(odd != null){
			System.out.print(odd.val);
			System.out.print(" ");
			odd = odd.next;
		}
		System.out.println();
		while(even != null){
			System.out.print(even.val);
			System.out.print(" ");
			even = even.next;
		}
	}

}

class Node{
	int val;
	Node next;
	public Node(int val){
		this.val = val;
		next = null;
	}
}
