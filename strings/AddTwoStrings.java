package strings;

public class AddTwoStrings {
	
	public String addBinary(String a, String b) {
	    
	    String pattern = "-?\\d+";
	    
	    if(a.matches(pattern) && b.matches(pattern)){
	        return Long.toString(Long.parseLong(a) + Long.parseLong(b));
	    }
	    return "";
	    
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AddTwoStrings test = new AddTwoStrings();
		//System.out.println(test.addBinary("1010110111001101101000", "1000011011000000111100110"));
		System.out.println(Long.MAX_VALUE);
	}

}
