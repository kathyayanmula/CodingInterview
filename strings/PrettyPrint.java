package strings;

import java.util.ArrayList;

public class PrettyPrint {
	public ArrayList<String> prettyJSON(String a) {
	    ArrayList<String> result = new ArrayList<String>();
	    if(a.length() < 2 || (!a.contains("[") && !a.contains("{"))){
	    	result.add(a);
	    	return result;
	    }
	    String input = a;
	    StringBuilder temp = new StringBuilder();
	    StringBuilder space = new StringBuilder();
	    int count = 0;
	    if(a.charAt(0) == '{'){
	        temp.append("{");
	        result.add(temp.toString());
	        space.append("\t");
	        temp = new StringBuilder();
	        temp.append(space);
	        input = a.substring(1);
	        count++;
	    }
	    for(char letter: input.toCharArray()){
	        if(letter == '[' || letter == '{'){
	           //if(!temp.toString().trim().isEmpty())
	           result.add(temp.toString());
	           temp = new StringBuilder();
	           temp.append(space);
	           temp.append(letter);
	           result.add(temp.toString());
	           space.append("\t");
	           temp = new StringBuilder();
	           temp.append(space);
	           count++;
	           continue;
	        }
	        
	        if(letter == ','){
	           temp.append(letter);
	           result.add(temp.toString());
	           temp = new StringBuilder();
	           temp.append(space);
	           continue;
	        }
	        
	        if(letter == ']' || letter == '}'){
	           if(!temp.toString().trim().isEmpty())
	               result.add(temp.toString());
	           if(space.length() > 0)
	                space.deleteCharAt(0);
	           temp = new StringBuilder();
	           temp.append(space);
	           temp.append(letter);
	           result.add(temp.toString());
	           temp = new StringBuilder();
	           //temp.append(space);
	           count--;
	           continue;
	        }
	        //System.out.println("count " + count);
	        temp.append(letter);
	            
	    }
	    
	    if(count!=0)
	        result.add(temp.toString());
	    
	    return result;
	}
	
	public static void main(String[] args) {
		PrettyPrint test = new PrettyPrint();
		ArrayList<String> output = test.prettyJSON("{\"id\":100,\"firstName\":\"Jack\",\"lastName\":\"Jones\",\"age\":12}");
		System.out.println(output);
		System.out.println(output.size());
		System.out.println(output.get(output.size() - 1).length());
	}
}
