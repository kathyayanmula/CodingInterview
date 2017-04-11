package recursion;

import java.util.ArrayList;
import java.util.List;

public class CombinationsBetterVersion <T> {
	List<List<T>> subsets(List<T> items){
		List<List<T>> result = new ArrayList<>();
//		items.sort((a,b) -> a > b);  //needed to remove duplicates
		backtrack(items, result, new ArrayList<T>(), 0);
		return result;
	}
	
	void backtrack(List<T> items, List<List<T>> result, ArrayList<T> temp, int start){
		
		result.add(new ArrayList<T>(temp));
		
		for(int i = start; i < items.size(); i++){
//			if( i > start && (items.get(i).equals(items.get(i-1))))	continue; //to avoid duplicates
			temp.add(items.get(i));
			backtrack(items, result, temp, i+1);
			temp.remove(temp.size() - 1);
		}
	}
	
	public static void main(String[] args) {
		List<Integer> items = new ArrayList<>();
//		items.add(1);items.add(2);
		items.add(1);items.add(2);items.add(3);items.add(4);items.add(5);
//		Integer[] items = {1,2};
		CombinationsBetterVersion<Integer> sb = new CombinationsBetterVersion<>();
		System.out.println(sb.subsets(items));
		System.out.println(sb.subsets(items).size());
	}
	
}
