package arrays;

import java.util.ArrayList;
import java.util.List;

public class PrintSpirally {
	// DO NOT MODIFY THE LIST
	public ArrayList<Integer> spiralOrder(final List<ArrayList<Integer>> a) {
		 ArrayList<Integer> result = new ArrayList<Integer>();
		 // Populate result;
		 int top = 0;
		 int left = 0;
		 int right = a.get(0).size() - 1;
		 int down = a.size() - 1;
		 while(true){
		     for(int i = top; i <= right; i++){
		         result.add(a.get(left).get(i));
		     }
		     top++;
		     if(left > right || top > down)
		        break;
		      for(int i = top; i <= down; i++){
		         result.add(a.get(i).get(right));
		     }
		     right--;
		     if(left > right || top > down)
		        break;
		     for(int i = right; i >= left; i--){
		         result.add(a.get(down).get(i));
		     }
		     down--;
		     if(left > right || top > down)
		        break;
		     for(int i = down; i >= top; i--){
		         result.add(a.get(i).get(left));
		     }
		     left++;
		     if(left > right || top > down)
		        break;
		 }
		 
		 return result;
	}
}
