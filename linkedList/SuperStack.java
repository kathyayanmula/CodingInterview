package linkedList;

import java.io.*;
import java.util.HashMap;
public class SuperStack {
    
    DNode head;
	PrintWriter writer;
	HashMap<Integer, Integer> incrMap;
	int size;
	int incr;
	public SuperStack(){
		head = null;
		writer = new PrintWriter(System.out);
		incrMap = new HashMap<>();
		size = 0;
		incr = 0;
	}
	
	public void push(int val){
		if(head == null){
			head = new DNode(val);
		}
		else{
			DNode temp = new DNode(val);
			temp.next = head;
			head = temp;
		}
		size++;
		writer.println(head.val);
		writer.flush();
	}
	
	public void pop(){
		if(head == null || head.next == null){
			incr = 0;
			writer.println("EMPTY");
			writer.flush();
			if(head == null)
				return;
		}
		DNode temp = head.next;
		head.next = null;
		head = temp;
		size--;
		if(incrMap.containsKey(size)){
			incr += incrMap.get(size);
		}
		if(head != null){
			writer.println(head.val+incr);
			writer.flush();
		}
		incr = 0;
	}
	
	public void incr(int x, int d){//add value d to the bottom x elements of the list
		if(!incrMap.containsKey(x))
			incrMap.put(x, d);
		else
			incrMap.put(x, incrMap.get(x)+d);
		if(x >= size)
			writer.println(head.val+d);
		else
			writer.println(head.val);
		writer.flush();
	}
	
	public void print(){
		DNode temp = head;
		while(temp != null){
			System.out.print(temp.val + " ");
			temp = temp.next;
		}
		System.out.println();
	}
    
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
    	SuperStack test = new SuperStack();
		//System.out.println("push 4 ");
		test.push(4);
		
		//("pop ");
		test.pop();
		
		//("push 3 ");
		test.push(3);
		//("push 5 ");
		test.push(5);
		//("push 2 ");
		test.push(2);
		
		//("incr 3, 1 ");
		test.incr(3, 1);
		
		//("pop ");
		test.pop();
		
		//("push 1 ");
		test.push(1);
		
		//("incr 2 2 ");
		test.incr(2, 2);
		
		//("push 4 ");
		test.push(4);
		
		//("pop ");
		test.pop();
		
		//("pop ");
		test.pop();
    }
}

class DNode{
	int val;
	DNode next;
	
	public DNode(int val){
		this.val = val;
		next = null;
	}
}
