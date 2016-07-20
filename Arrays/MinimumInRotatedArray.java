package Arrays;

public class MinimumInRotatedArray {
	
	public int findMinimum(int[] input){
		if(input == null)
			return -1;
		if(input.length == 1)
			return input[0];
		
		int start = 0;
		int end = input.length - 1;
		int middle = 0;
		int len = input.length - 1;
		
		if(input[start] < input[end])
			return input[0];
		
		while(start < end){
			middle = (start + end)/2;
			if(input[middle] > input[middle-1] && input[middle] < input[middle+1] && input[middle] > input[len])
				start = middle;
			else if(input[middle] > input[middle-1] && input[middle] < input[middle+1] && input[middle] < input[len])
				end = middle;
			else if(input[middle] < input[middle - 1])
				return input[middle];
			else if(input[middle] > input[middle+1])
				return input[middle+1];		
			
				
		}
		
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] input = {1,2,3,4,5,6};
		int[] input1 = {6,1,2,3,4,5};
		int[] input2 = {5,6,1,2,3,4};
		int[] input3 = {4,5,6,1,2,3};
		int[] input4 = {3,4,5,6,1,2};
		int[] input5 = {2,3,4,5,6,1};
		
		MinimumInRotatedArray test =new MinimumInRotatedArray();
		System.out.println(test.findMinimum(input));
		System.out.println(test.findMinimum(input1));
		System.out.println(test.findMinimum(input2));
		System.out.println(test.findMinimum(input3));
		System.out.println(test.findMinimum(input4));
		System.out.println(test.findMinimum(input5));

	}

}
