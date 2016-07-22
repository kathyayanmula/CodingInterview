package linkedList;

import java.util.Stack;

//Use Write a function that checks if the given input string has matching opening and closing parentheses. Valid parentheses are (){}[].
public class MatchingParentheses {

	static boolean hasMatchingParantheses(String strExpression) {
		if(strExpression.length() < 2)
	        return false;
		
	    Stack<Character> chars = new Stack<Character>();
	    
	    for(char c: strExpression.toCharArray()){
	        if(!chars.empty()){
	            if(c == ')' && chars.pop() != '(')
	                return false;
	            if(c == '}' && chars.pop() != '{')
	                return false;
	            if(c == ']' && chars.pop() != '[')
	                return false;
	            if(c == '(' || c == '{' || c == '[')
	                chars.push(c);                                                
	        }
	        else{
	            if(c == ')' || c == '}' || c == ']')
	                return false;
	            if(c == '(' || c == '{' || c == '[')
	                chars.push(c);
	        }                                                  
	    }
	    if(!chars.empty())
	    	return false;
	    return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(MatchingParentheses.hasMatchingParantheses("((("));

	}

}
