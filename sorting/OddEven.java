package sorting;

import java.util.Arrays;

public class OddEven {

	
	public void oddEven(int[] input){
		int i = 0;
		int j = 1;
		
		for(;j<input.length;j++){
			if(input[j]%2 ==0){
				int temp = input[i];
				input[i] = input[j];
				input[j] = temp;
				i++;
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = {1,2,3,4,5};
		OddEven test = new OddEven();
		test.oddEven(input);
		System.out.println(Arrays.toString(input));
	}

}
