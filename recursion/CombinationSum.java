package recursion;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
	
	List<List<Integer>> subsets(List<Integer> items, int sum){
		List<List<Integer>> result = new ArrayList<>();
		items.sort((a,b) -> a -b); //Need to sort to handle duplicates else not needed
		findSubsets(items, result, new ArrayList<Integer>(), 0, sum);
		return result;
	}
	
	void findSubsets(List<Integer> items, List<List<Integer>> result, ArrayList<Integer> temp, int start, int remain){
		if(remain < 0) return;
		else if(remain == 0)result.add(new ArrayList<Integer>(temp));
		else{
			for(int i = start; i < items.size(); i++){
//				if( i > start && (items.get(i).equals(items.get(i-1))))	continue; //to remove duplicates
				temp.add(items.get(i));
				findSubsets(items, result, temp, start+1 ,remain - items.get(i)); //use start instead of start+1 to reuse the same element
				temp.remove(temp.size() - 1);
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> items = new ArrayList<>();
		items.add(1);items.add(2);items.add(3);items.add(4);items.add(5);
		CombinationSum cs = new CombinationSum();
		System.out.println(cs.subsets(items, 6));
	}

}
