package arrays;

import java.util.ArrayList;
import java.util.List;


public class FindDuplicatesConfinedArray {
	
	//This array will only have elements from 0 to n-1
	public List<Integer> duplicates(int[] nums){
		List<Integer> dups = new ArrayList<>();
		int n = nums.length;
		for(int i = 0; i < n; i++){
			int index = nums[i]%n; 
			nums[index] += n;
		}
		//This works because everytime you see the same number you increment the number at that index by n. So if see number 1
		//twice you will increment element at index 1 by length twice. I this case 6 element at index 1 becomes 20 since
		//1 is present twice in the array. 
		//Now when you check for dups in the second loop you check if num at i / length is > 1 (not equal). This returns true only if
		//num at i is >= 2*length. The reason num at i is >= 2*length is because we added length to num at i evertime we found i in the array. 
		//So i is the o/p not nums[i]. Remember we incremented num at a particular index for a reason
		for(int i = 0; i < n; i++){
			if(nums[i]/n > 1)
				dups.add(i);
		}
		
		return dups;
	}
	
	//This array will only have elements from 1 to n-1 and numbers are repeated atmost twice 
		public List<Integer> onlyTwoDuplicates(int[] nums){
			List<Integer> dups = new ArrayList<>();
			int n = nums.length;
			for(int i = 0; i < n; i++){
				int index = Math.abs(nums[i]);
				if(nums[index] > 0)
					nums[index] = -nums[index];
				else
					dups.add(index);
			}
			//This works because for every number you see in the array you mark element at that index negative if hasn't already been marked.
			//Initially all the elements are positive i.e. from 1 to n-1 so there shouldn't be any negative numbers to start with
			//when you see that the number at a particular index is negative it is because that number was already seen before. 
			//So add absolute value of num at i to the result. This method works only if the elements repeat atmost twice else the 
			//final result will have repeating elements. Also, this method doesn't handle if the i/p has 0. Prefer the first method to find duplicates.
			return dups;
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,6,3,1,6,6,5};
		FindDuplicatesConfinedArray test = new FindDuplicatesConfinedArray();
//		System.out.println(test.duplicates(nums));
		System.out.println(test.onlyTwoDuplicates(nums));
	}

}