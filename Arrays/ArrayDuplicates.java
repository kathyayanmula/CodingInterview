package Arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArrayDuplicates {

	public static void main(String[] args) {
		int array[] = {4, 8, 4, 1, 1, 2, 9,8,9};
		Set<Integer> findDup = new HashSet<Integer>();

		/* new length of modified array */
		for(int i=0; i< array.length; i++){

		   /*for(int j=i+1; j< array.length ; j++)
		   {

		      if(array[i] == array[j])
		    	  System.out.println(array[i] + " ");;
		   }*/
			
			if(!findDup.add(array[i])){
				System.out.println(array[i] + " ");;
			}
		}
		//System.out.println(Arrays.toString(array));
	}

}
