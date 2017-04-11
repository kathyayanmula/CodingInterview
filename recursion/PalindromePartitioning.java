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
			result.add(new ArrayList<String>(temp));
			return;
		}
		
		for(int i = start; i < str.length(); i++){
			if(isPalindrome(str, start, i)){
				temp.add(str.substring(start, i+1));
				palindromeList(str, i+1, result, temp);
				temp.remove(temp.size() - 1);
			}
		}
	}
	
	public boolean isPalindrome(String str, int start, int end){
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
