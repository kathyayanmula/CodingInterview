package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LargestSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,2,3,3,4,1,2,4,5};
		int[] b = {2,3,4,5,6,4,3,1};
		
		Map<Integer, Integer> values = new HashMap<Integer, Integer>();
		ArrayList<Integer> result = new ArrayList<Integer>();
		for(int e:a){
			if(values.containsKey(e)){
				values.put(e, values.get(e) +1);
			}
			else{
				values.put(e, 1);
			}
		}
		for(int e:b){
			if(values.containsKey(e) && values.get(e) > 0){
				result.add(e);
				values.put(e, values.get(e) - 1);
			}
		}
		System.out.println(result.toString());

	}

}
