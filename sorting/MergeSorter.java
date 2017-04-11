package sorting;

import java.util.Arrays;

public class MergeSorter {
	
	public void mergerSorter(int[] input){
		int[] temp = new int[input.length];
		mergeSort(input, temp, 0, input.length - 1);
	}
	
	public void mergeSort(int[] input, int[] temp, int start, int end){
		if(start < end){
			int middle = (start+end)/2;
			mergeSort(input, temp, start, middle);
			mergeSort(input, temp, middle+1, end);
			merge(input,temp, start, middle+1, end);
		}
	}
	
	public void merge(int[] input, int[] temp ,int left, int right, int rightEnd){
		int leftEnd = right - 1;
//		int iterations = rightEnd - left + 1;
		int i = left;
		while(left <= leftEnd && right <= rightEnd){
			if(input[left] <= input[right])
				temp[i++]=input[left++];
			else
				temp[i++]=input[right++];
		}
		
		while(left <= leftEnd ){
			temp[i++]=input[left++];
		}
		
		while(right <= rightEnd ){
			temp[i++]=input[right++];
		}
		
//		for(i = 0; i < iterations; i++, rightEnd--){
//			input[rightEnd] = temp[rightEnd];
//		}
	
		for(i = 0; i <= rightEnd; i++){
			input[i] = temp[i];
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MergeSorter test = new MergeSorter();
//		int[] input = {7,5,4,3,3,2,1};
		int[] input = {3,2,1,1,5,6,4,2,7};
		test.mergerSorter(input);
		System.out.println(Arrays.toString(input));
	}

}
