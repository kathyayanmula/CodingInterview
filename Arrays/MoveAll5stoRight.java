package arrays;

import java.util.Arrays;

public class MoveAll5stoRight {

	public static void main(String[] args) {
		
		int[] a = {1,2,5,3,5,4,5};
		//Implementation 1 with space O(n) time O(n) and preserving the order of input elements
		int[] b = new int[a.length];
		int count = 0;
		int j =0;
		for (int i = 0; i < a.length; i++) {
		  if (a[i] != 5) {
		    b[j] = a[i]; 
		    j++;
		  }
		  else{
		  	count++;
		  }		  
		}
		for(int k = b.length - count ; k < b.length; k++){
			  b[k] =  5;
		  }

		//By tweaking the insertion sort implementation. Space complexity O(1), worst time complexity O(n2)
		/*int j;
		for(int i = 1; i < a.length; i++){
			int tmp = a[i];
			j = i - 1;
			while(j >= 0 && a[j] == 5){
				a[j+1] = a[j];
				j--;
			}
			a[j+1] = tmp;
		}*/
		// TODO Auto-generated method stub
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));

	}

}
