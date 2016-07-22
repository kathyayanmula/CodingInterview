package arrays;

import java.util.ArrayList;
import java.util.List;

public class MaxiumumSubArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> a = new ArrayList<Integer>();
		for(int i = 2; i <11; i++)
			a.add(i);
		for(int i = -10; i <0; i++)
			a.add(i);
		int sum = a.get(0);
		int lastSum= 0;
		for(int num:a){
			lastSum += num;				//add up the numbers in a row
			sum = Math.max(sum, lastSum);
			if(lastSum < 0){			//if the sum is less than 0 the set the last sum to 0, you don't need to add negative numbers it will only decrease the value not increase
				lastSum = 0;
			}
		}
		System.out.println(sum);
	}

}
