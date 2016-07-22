package arrays;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;


public class MissingAndDuplicate {
	// DO NOT MODIFY THE LIST
	public ArrayList<Integer> repeatedNumber(final List<Integer> a) {
	    ArrayList<Integer> result = new ArrayList<Integer>();
	    long size = a.size();
	    System.out.println("size " + size);
	    long sum = size*(size+1)/2;
	    System.out.println("sum " + sum);
	    //System.out.println((double)(size*size*size/3 + size*size/2 + size/6));
	    long sumOfSquares = (long)(Math.ceil((double)size*size*size/3 + (double)size*size/2 + (double)size/6));
	    System.out.println("sumOfSquares " + sumOfSquares);
	    long actualSum = 0;
	    long actualSumOfSquares = 0;
	    int missing = 0;
	    int dup = 0;
	    for(int num:a){
	        actualSum += num;
	        actualSumOfSquares += num*num;
	    }
	    System.out.println("actualSum " + actualSum);
	    System.out.println("actualSumOfSquares " + actualSumOfSquares);
	    long sumDiff = actualSum - sum;
	    System.out.println("sumDiff " + sumDiff);
	    long squareSumdiff = actualSumOfSquares - sumOfSquares;
	    dup = (int)(sumDiff + squareSumdiff/sumDiff)/2;
	    missing  = (int) (squareSumdiff/sumDiff - sumDiff)/2;
	    
	    result.add(dup);
	    result.add(missing);
	    String an = "10";
	    ArrayList<Integer> list = new ArrayList<Integer>();
        
        for(char c: an.toCharArray()){
            if(c == '0')
                list.add(-1);
            else
                list.add(1);
        }
	    System.out.println(list);
	    System.out.println(an.charAt(0) == '0');
	    System.out.println(an.contains("0"));
	    return result;
	    
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MissingAndDuplicate yo  = new MissingAndDuplicate();
		List<Integer> newList = new ArrayList<Integer>();
		newList.add(5);newList.add(1);newList.add(3);newList.add(5);newList.add(4);newList.add(7);newList.add(2);
		System.out.println(newList);
		System.out.println(yo.repeatedNumber(newList).toString());
		
	}
}
