package arrays;

public class MaximSumSubArray {
	
	public int maxSum(int[] input){
		
		int maxSum = Integer.MIN_VALUE;
		int sum = 0;
		
		for(int num: input){
			sum += num;
			
			if(sum > maxSum){
				maxSum = sum;
			}
			
			if(sum < 0)
				sum = 0;
		}
		
		return 0;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
