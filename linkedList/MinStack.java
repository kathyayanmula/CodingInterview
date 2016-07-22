package linkedList;

import java.util.Stack;

public class MinStack {
	
		Stack<Integer> stack = new Stack<Integer>();
	    Stack<Integer> min = new Stack<Integer>();
	void push(int val){
	    stack.push(val);
	    if(val <= min.peek())
	        min.push(val);
	}
	void pop(){
	    if(!stack.empty()){
	    int compare = stack.pop();
	    if(compare == min.peek())
	        min.pop();
	    }
	}
	
	int getMinimum(){
	    if(!stack.empty())
	        return min.peek();
	    return 0;
	}
	
}
