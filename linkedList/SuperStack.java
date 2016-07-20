package linkedList;

import java.io.*;
public class SuperStack {
    
    DNode head;
	DNode tail;
	PrintWriter writer = new PrintWriter(System.out);
	public SuperStack(){
		head = null;
		tail = null;
	}
	
	public void push(int val){
		if(head == null){
			head = new DNode(val);
			head.next = null;
			head.prev = null;
			tail = head;
		}
		else{
			DNode temp = new DNode(val);
			temp.next = head;
			head.prev = temp;
			head = head.prev;
		}
		writer.println(head.val);
		writer.flush();
	}
	
	public void pop(){
		if(head == null){
			writer.println("EMPTY");
			writer.flush();
			return;
		}
		DNode temp = head.next;
		head.next = null;
		head = temp;
		if(head == null){
			writer.println("EMPTY");
			writer.flush();
			return;
		}
		head.prev = null;
		writer.println(head.val);
		writer.flush();
	}
	
	public void incr(int x, int d){//add value d to the bottom x elements of the list
		DNode temp = tail;
		while(temp != null && x > 0){
			temp.val = temp.val + d;
			temp = temp.prev;
			x--;
		}
		
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
	DNode prev;
	
	public DNode(int val){
		this.val = val;
		next = null;
		prev = null;
	}
}
