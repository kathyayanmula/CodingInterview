package recursion;

import java.util.ArrayList;

public class PalindromePartitioning {
	
	public String[] palindromePartition(String str){
		if(str == null || str.isEmpty())
			return null;
	ArrayList<ArrayList<String>> result = new ArrayList<ArrayList<String>>();
	ArrayList<String> temp = new ArrayList<String>(str.length());
	palindromeList(str, 0, result, temp);
	String output[] = new String[result.size()];
//	for(ArrayList<String> list: result){
//		System.out.println(list);
//	}
	
	for(int i = 0; i < result.size(); i++){
		String partition = "";
		for(String letter: result.get(i)){
			partition += letter + "|";
		}
		output[i] = partition;
	}

	return output;
	}
	
	public void palindromeList(String str, int start, ArrayList<ArrayList<String>> result, ArrayList<String> temp ){
		if(start == str.length()){
			ArrayList<String> partition = new ArrayList<String>(temp);
			result.add(partition);
			return;
		}
		
		for(int i = start+1; i <= str.length(); i++){
			String subStr = str.substring(start, i);
			if(isPalindrome(subStr)){
				temp.add(subStr);
				palindromeList(str, i, result, temp);
				temp.remove(temp.size() - 1);
			}
		}
	}
	
	public boolean isPalindrome(String str){
		if(str.length() < 2)
			return true;
		int start = 0;
		int end = str.length() - 1;
		while(start < end){
			if(str.charAt(start) != str.charAt(end))
				return false;
			start++;
			end--;
		}
		return true;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PalindromePartitioning test = new PalindromePartitioning();
		for(String partition: test.palindromePartition("abba")){
			System.out.println(partition);
		}

	}

}
