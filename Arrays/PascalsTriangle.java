package arrays;

import java.util.ArrayList;

public class PascalsTriangle {
	
	public ArrayList<Integer> printPascals(int n){
		/*Using space O(2k)
		ArrayList<Integer> temp = new ArrayList<Integer>();
		ArrayList<Integer> result = new ArrayList<Integer>();
		temp.add(1);
		if(n < 1){
			return temp;
		}
		for(int i = 1 ; i <= n ; i++){
			result.add(1);
			for(int j = 1; j < temp .size(); j++){
				result.add(j,temp.get(j)+temp.get(j-1));
			}
			result.add(1);
			temp = result;
			result = new ArrayList<Integer>();
		}
		return temp;*/
		ArrayList<Integer> result = new ArrayList<Integer>();
		result.add(1);
		for(int i=0; i < n; i++){
			int val;
			int last=0;
			for(int j=0;j<i+1;j++){
				val=result.get(j);
				if(i - 1 >= 0)
					val += last;
				last = result.get(j);	
				result.set(j,val);
			}
			result.add(1);
			
		}
		return result;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PascalsTriangle test = new PascalsTriangle();
		for(int i = 0; i < 11; i++)
			System.out.println(i + " row " + test.printPascals(i));

	}

}
