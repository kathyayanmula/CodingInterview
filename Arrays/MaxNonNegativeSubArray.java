package arrays;

import java.util.ArrayList;

public class MaxNonNegativeSubArray {
	public ArrayList<Integer> maxset(ArrayList<Integer> a) {
	    ArrayList<Integer> result = new ArrayList<Integer>();
	    long maxSum = Integer.MIN_VALUE;
	    long sum = 0;
	    int start = 0;
	    int maxStart = 0;
	    int length = 0;
	    int maxLength = -1;
	    for(int i = 0; i < a.size(); i++){
	        if(a.get(i) >= 0){
	           sum += a.get(i);
	           length++;
	           start = i+1 - length;
	           if(sum > maxSum || (sum == maxSum && length > maxLength)){
	            maxSum = sum;
	            maxStart = start;
	            maxLength = length;
	            System.out.println("index " + i);
	            System.out.println("num " + a.get(i));
	            System.out.println("length " + length);
	            System.out.println("maxLength " + maxLength);
	            System.out.println("sum " + sum);
	            System.out.println("maxSum " + maxSum);
	            System.out.println("maxStart " + maxStart);
	        }
	        }
	        else{
	            sum = 0;
	            length = 0;
	            }
	        }
	    for(int i = maxStart; i < maxStart+maxLength; i++){
	        result.add(a.get(i));
	    }
	    
	    return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> input = new ArrayList<Integer>();
		int[] a = {25150, 1412, 82797, 48381, 7065, -47699, -25129, -65483, -64607, -45322, -55176, 27224, 80366, 60444, 70285, -93898};
		int[] b = {0,0,-1,0};
		for(int i:b){
			input.add(i);
		}
		MaxNonNegativeSubArray test = new MaxNonNegativeSubArray();
		System.out.println(test.maxset(input));

	}
}
