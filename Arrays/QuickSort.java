package Arrays;

public class QuickSort {

	
	public int select(int[] input, int start, int end){
		int pivot = input[start];
		int j = end;
		for(int i = start; i < end; i++){
			if(input[i] <= pivot){
				int temp = input[i];
				input[i] = input[j];
				input[j] = temp;
				i++;
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
