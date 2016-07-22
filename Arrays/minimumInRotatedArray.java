package Arrays;

public class minimumInRotatedArray {
	
	public int search(int[] input){
		int start = 0;
		int len = input.length - 1;
		int end = input.length - 1;
		int middle = 0;
		while(start < end){
			middle = (start+end)/2;
			if(middle == 0)
				return 0;
			if(input[middle] > input[middle - 1] && input[middle] > input[len])
				start = middle +1;
			else if(input[middle] > input[middle - 1] && input[middle] < input[len])
				end = end - 1;
			else if(input[middle] < input[middle - 1])
				return input[middle];
		}
		
		
		return input[0];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] input = {4,5,1,2,3};
		minimumInRotatedArray test = new minimumInRotatedArray();
		System.out.println(test.search(input));
		
	}

}
