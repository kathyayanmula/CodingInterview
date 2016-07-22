package arrays;

import java.util.ArrayList;

public class AddOneToArray {
	public ArrayList<Integer> plusOne(ArrayList<Integer> a) {
	    ArrayList<Integer> result = new ArrayList<Integer>();
	    int carry = 1;
	    for(int i = a.size() - 1; i >= 0 ; i--){
	        result.add(0,(a.get(i) + carry) % 10);
	        if(a.get(i) != 0 && (a.get(i) + carry) % 10 == 0)
	            carry = 1;
	        else
	            carry = 0;
	        
	    }
	    if(carry == 1){
	        result.add(0,1);
	    }
	    int i = 0;
	    while(true){
	    	System.out.println("first " + result.get(i));
	        if(result.get(i) != 0)
	            break;         
	        System.out.println("i " + i);
	        System.out.println("size1: " + result.size());
	        System.out.println(result.toString());
	        result.remove(i);
	        System.out.println(result.toString());
	        System.out.println("size: " + result.size());
	    }
	    return result;
	}
	
	public static void main(String[] args){
	    ArrayList<Integer> input = new ArrayList<Integer>();
	    input.add(0);
	    input.add(6);
	    input.add(0);
	    input.add(6);
	    input.add(4);
	    input.add(8);
	    input.add(8);
	    input.add(1);
	    AddOneToArray sol = new AddOneToArray();
	    System.out.println(sol.plusOne(input).toString());
	    System.out.println(input.toString());
	}
}
