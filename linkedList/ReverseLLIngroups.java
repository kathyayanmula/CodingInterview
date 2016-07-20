package linkedList;

public class ReverseLLIngroups {
	public Node reverse(Node node, int k){
        Node head = node;
        Node prev = null;
        Node next = null;
        int count = k;
        while( count > 0 && node != null){
            next = node.next;
            node.next = prev;
            prev = node;
            node = next;
            count--;
        }
        
        //recursive call to the same function
        if(next != null)
        	head.next = reverse(next,k);
        
        return prev;
    }
}
