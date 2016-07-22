package strings;

public class SearchPattern {
	
	public void isPatternPresent(String input, String pattern){
		
		int len = input.length() - pattern.length();
		
		for(int i = 0; i <= len; i++){
			
			int j = 0;
			
			while(j < pattern.length() && input.charAt(i+j) == pattern.charAt(j)){
				if(j == pattern.length() - 1){
					System.out.println("Pattern found at index " + i);
					return;
				}
				j++;
			}
			
		}
		
		System.out.println("Pattern not found");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SearchPattern test= new SearchPattern();
		
		test.isPatternPresent("THIS IS A TEST", "TEST");
		test.isPatternPresent("AABAACAADAABAAABAA", "AABA");

	}

}
