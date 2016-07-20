package recursion;

import java.util.ArrayList;

public class Expression {
	
	public ArrayList<ArrayList<String>> expEvaluator(String digits, int n){
		ArrayList<ArrayList<String>> result = new ArrayList<ArrayList<String>>();
		ArrayList<String> temp = new ArrayList<String>();
		addExpressions(digits,0, n, result, temp);
		return result;
	}
	
	public void addExpressions(String digits, int start, int n, ArrayList<ArrayList<String>> result, ArrayList<String> temp){
//		if()
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
