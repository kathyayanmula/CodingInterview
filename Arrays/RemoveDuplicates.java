package arrays;

import java.util.ArrayList;

public class RemoveDuplicates {
	
	public int removeDuplicates(ArrayList<Integer> a) {
	    
	    if(a == null || a.size() == 0)
	        return 0;
	    if(a.size() == 1)
	        return 1;
	    
	    int ptr1 = 0; int ptr2 = 1;
	    
	    while(ptr2 < a.size()){
	        if(a.get(ptr2).equals(a.get(ptr1))){
	            a.remove(ptr2);
	            //System.out.println(a.size());
	        }
	        else{
	            ptr1++;
	            ptr2++;
	        }
	    }
	    //System.out.println(a.size());
	    return a.size();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> input = new ArrayList<Integer>();
		input.add(5000);input.add(5000);input.add(5000);
		RemoveDuplicates test = new RemoveDuplicates();
		System.out.println(test.removeDuplicates(input));
	}

}
