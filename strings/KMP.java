package strings;

public class KMP {
	
	
	
	
	
	public int[] buildArray(String pattern){
		
		int len = pattern.length();
		int[] matching = new int[len];
		matching[0] = 0;
		int j = 0;
		
		for(int i = 1; i < len; i++){
			if(pattern.charAt(i) == pattern.charAt(j)){
				j++;
				matching[i] = j;
				i++;
			}
			else{
				
				if(j != 0){
					j = matching[j-1];
				}
				else{
					matching[i] = 0;
					i++;
				}
				
			}
		}
		
		
		return matching;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		KMP test = new KMP();
		int[] output = test.buildArray("AABAA");
		for(int i: output)
			System.out.print(i + " ");

	}

}
