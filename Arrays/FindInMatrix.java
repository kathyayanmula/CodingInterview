package Arrays;

public class FindInMatrix {
	
	public void findIndex(int[][] input, int num){
		
		int rowIndex = findRow(input, num);
		if(rowIndex == -1)
			System.out.println("Number not found");
		int start = 0;
		int end = input[0].length - 1;
		int middle = 0;
		
		while(start < end){
			middle = (start + end)/2;
			if(num > input[rowIndex][middle])
				start = middle+1;
			else if(num < input[rowIndex][middle])
				end = middle - 1;
			else{
				System.out.println(" number found in row " + rowIndex + " at index " + middle);
				break;
			}
		}
	}
	
	public int findRow(int[][] input, int num){
		
		int rowLength = input[0].length;
		int start = 0;
		int end = input.length - 1;
		int middle = 0;
		
		while(start < end){
			middle = (start+end)/2;
			if(num > input[middle][rowLength - 1])
				start = middle+1;
			else if(num < input[middle][0])
				end = middle - 1;
			else if(num >= input[middle][0] && num <= input[middle][rowLength - 1])
				return middle;
		}
		
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[][] input = {{1,2,3,4,5}, {6,7,8,9,10}, {11, 12, 13, 14, 15}}; 
		FindInMatrix test = new FindInMatrix();
		test.findIndex(input, 2);
	}

}
