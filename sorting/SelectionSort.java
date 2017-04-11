package sorting;

import java.util.Arrays;

public class SelectionSort {
	
	public void sort(int[] a){
		for(int i = 1; i < a.length; i++){
			for(int j = i; j > 0; j--){
				if(a[j] < a[j-1]){
					int temp = a[j];
					a[j] = a[j-1];
					a[j-1] = temp;
				}
				else
					break;
			}
		}
	}
	
	public static void main(String[] args) {
        // TODO Auto-generated method stub
		SelectionSort test = new SelectionSort();

//       int[] input = {7,6,5,4,3,2,1};
       int[] input = {3,2,1,1,5,6,4,2,7};
        System.out.println(Arrays.toString(input));
        test.sort(input);
        System.out.println(Arrays.toString(input));
    }
	
}
