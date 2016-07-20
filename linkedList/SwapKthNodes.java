package linkedList;

public class SwapKthNodes {
	
	static Node swapNodes(Node head, int k) {
	    
        if(head == null || head.next == null)
            return head;
        Node temp = head;
        Node prev1 = null;
        Node prev2 = null;
        Node node1 = head;
        Node node2 = head;
        
        while(k > 1 && temp != null){
            prev1 = temp;
            temp = temp.next;
            k--;
        }
        node1 = temp;
        
        while(temp != null && temp.next != null){
            prev2 = node2;
            node2 = node2.next;
            temp = temp.next;
        }
        
        return swapNodes(head, prev1, node1, prev2, node2);
            
        }
    
    static Node swapNodes(Node head, Node prev1, Node node1, Node prev2, Node node2){
        if(node1 == null || node2 == null)
            return head;
        
        if(prev1 == null)
            head = node2;
        else
            prev1.next = node2;
        
        if(prev2 == null)
            head = node1;
        else
            prev2.next = node1;
        
        Node temp = node1.next;
        node1.next = node2.next;
        node2.next = temp;
        
        return head;        
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
