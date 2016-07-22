package linkedList;

import java.util.Stack;

public class LongestMatchingParentheses {
	
	static int maxLenMatchingParen(String strParenExpression) {
        if(strParenExpression.length() < 2)
            return 0;
        
        int count = 0;
        int tempCount = 0;
        char prev = '.';
        Stack<Character> chars = new Stack<Character>();
        for(char c:strParenExpression.toCharArray()){
            if(c == '('){
                if(chars.empty() || prev == '(')
                    chars.push('(');
                else if(prev == ')'){
                    tempCount = 0;
                    while(!chars.empty())
                        chars.pop();
                    }
                 prev = '(';       
                }
            if(c == ')' && !chars.empty() && chars.peek() == '('){
                tempCount += 2;
                chars.pop();
                prev = ')';
            }
            if(tempCount > count)
                count = tempCount;
        }
        
        return count;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
