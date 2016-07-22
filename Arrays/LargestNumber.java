package arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

public class LargestNumber {
	
	public String largestNumber(final List<Integer> a) {
	    //Collections.sort(a);
	    
	    StringBuilder result= new StringBuilder();
	    long sum=0;
	    for(Integer num:this.sortedList(a)){
	    	result.append(num.toString());
	    	sum += num;
	    }
	    if(sum==0)
	    	return "0";
	    return result.toString();
	}
	
	public ArrayList<Integer> sortedList(List<Integer> input){
		ArrayList<Integer> sorted = new ArrayList<Integer>(input);
		Collections.sort(sorted, new Comparator<Integer>() {
			public int compare(Integer x, Integer y){
				long a = Long.parseLong(x.toString()+y.toString());
				long b = Long.parseLong(y.toString()+x.toString());
				if(a-b < 0)
					return 1;
				else if(a-b > 0)
					return -1;
				else
					return 0;
			}
		});
		System.out.println(sorted);
		return sorted;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> input = new ArrayList<Integer>();
		//input.add(3);input.add(30);input.add(34);input.add(5);input.add(9);
		input.add(0);input.add(0);input.add(0);input.add(0);input.add(0);input.add(0);
		LargestNumber test = new LargestNumber();
		System.out.println(test.largestNumber(input));

	}

}
