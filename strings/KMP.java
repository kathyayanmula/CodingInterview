package strings;

public class KMP {
	
	
	public void findOccurence(String input, String pattern){
		
		int i = 0;
		int j = 0;
		int[] prefixCounts = prefixCounts(pattern);
		while(i < input.length()){
			if(input.charAt(i) == pattern.charAt(j)){
				i++;
				j++;
			}
			if(j == pattern.length()){
				System.out.println("Pattern found at " + (i - j));
				j = prefixCounts[j-1];
			}
			else if(i < input.length() && input.charAt(i) != pattern.charAt(j)){
				if(j != 0)
					j = prefixCounts[j-1];
				else
					i++;
			}
		}
		
	}
	
	//let AABAA be the pattern
	//prefixes of AABAA at index 1(forget about the chars after index 1) are A
	//suffixes of AABAA at index 1(forget about the chars after index 1) are A
	//prefixes of AABAA at index 2(forget about the chars after index 2) are A AA
	//suffixes of AABAA at index 2 which is the last index are B AB 
	//prefixes of AABAA at index 3 which is the last index are A AA AAB
	//suffixes of AABAA at index 3 which is the last index are A BA ABA
	//prefixes of AABAA at index 4 which is the last index are A AA AAB AABA - all except the last char
	//suffixes of AABAA at index 4 which is the last index are A AA BAA ABAA - all except the first char

	//the prefix count array (see below) will always have 0 at index 0 since index 0 has only one element, thus no suffixes or prefixes
	//at index 1 longest prefix is A (char at 0) longest suffix is A. So longest matching suffix and prefix is A. So the length 1 goes into index 1 of prefix counts array
	//at index 2 there are no matching prefixes or suffixes. So 0 goes in to index 2
	//at index 3 longest matching prefix and suffix is still A. So 1 goes in to index 3
	//at index 4 longest matching prefix and suffix is AA. So 2 goes in to index 4
	//final prefix count array will be [0,1,0,1,2]
	//this function is used to populate the prefix counts array
	public int[] prefixCounts(String pattern){
		
		int[] prefixCount = new int[pattern.length()];
		
		prefixCount[0] = 0;
		int len = pattern.length();
		int j = 0;
		int i = 1;
		while(i < len){
			
			if(pattern.charAt(i) == pattern.charAt(j)){
				j++;
				prefixCount[i]=j;
				i++;
			}
			else{
				
				if(j != 0)
					j = prefixCount[j-1];
				else{
					prefixCount[i]=0;
					i++;
				}
			}
		}
		return prefixCount;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		KMP test = new KMP();
		test.findOccurence("AABAACAADAABAAABAA", "AABA");
		test.findOccurence("THIS IS A TEST TEXT", "TEST");

	}

}
