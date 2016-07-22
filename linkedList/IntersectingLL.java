package linkedList;

public class IntersectingLL {
	
	static int LinkedListIntersection(Node a, Node b) {
	    
	    if(a == null || b == null)
	        return -1;
	    
	    int result = -1;
	    
	    while(a != null && b != null){
	        if(a == b){
	            result = a.val;
	            break;
	        }
	        a = a.next;
	        b = b.next;
	    }
	    
	    return result;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
