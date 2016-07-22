package sorting;

public class SortString {
	
	static String sortCharacters(String inString) {
        StringBuilder result = new StringBuilder();
        int[] charCount = new int[256];
        for(char c: inString.toCharArray()){
            int numericValue = Character.getNumericValue(c);
            System.out.println(numericValue);
            if(numericValue != -1)
                charCount[numericValue]  += 1;
        }
        
        for(int i = 0; i < charCount.length; i++){
            for(int j = 0; j < charCount[i]; j++){
                result.append(Character.toChars(i));
            }
        }
        return result.toString();

    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//char c = ' ';
		System.out.println((int)' ');

	}

}
