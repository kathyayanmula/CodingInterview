package strings;

import java.util.ArrayList;

//Custom Input NX9AROO79WZSd 24

public class zigzag {
	public String convert(String a, int b) {
	    if(a.length() < 1)
	        return "";
	    if(a.length() == 1)
	        return a;
	    if(b < 2)
	        return a;
	    ArrayList<StringBuilder> result = new ArrayList<StringBuilder>(b);
	    StringBuilder resultString = new StringBuilder();
	    
	    for(int  i = 0; i < b; i++){
	    	StringBuilder test = new StringBuilder();
	        result.add(test);
	    }
	    int position = 0;
	    
	    while(position < a.length()){
	        for(int j = 0; j < b - 1 && position < a.length(); j++){
	            result.get(j).append(String.valueOf(a.charAt(position)));
	            position++;
	        }
	        for(int k = b - 1; k > 0 && position < a.length(); k--){
	            result.get(k).append(String.valueOf(a.charAt(position)));
	            position++;
	            
	        }
	    }
	    
	    for(StringBuilder row: result){
	        resultString.append(row);
	    }
	    
	    return resultString.toString();
	}
	
	public static void main(String[] args){
		zigzag test = new zigzag();
		System.out.println(test.convert("PAYPALISHIRING", 3));
		System.out.println(test.convert("NX9AROO79WZSd", 24));
	}
}

