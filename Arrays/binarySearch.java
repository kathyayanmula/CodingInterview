package Arrays;

public class binarySearch {
	
	public void search(int[] input, int val){
		int start = 0;
		int end = input.length;
		int middle = 0;
		while(start < end){
			middle = (start+end)/2;
			if(input[middle] == val){
				System.out.println(val);
				break;
			}
			else if(input[middle] < val)
				start = middle;
			else
				end = middle;
			//System.out.println("start " + start + " end " + end);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		binarySearch test = new binarySearch();
		int[] input = {1,2,3,4,5,6};
		test.search(input, 3);

	}

}
