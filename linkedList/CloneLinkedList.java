package linkedList;

import java.util.ArrayList;
import java.util.Scanner;

public class CloneLinkedList {
	
	public ArbitNode clone(ArbitNode head){
		
		if(head == null)
			return null;
		
		ArbitNode node = head;
		
		while(node != null){
			ArbitNode temp = node.next;
			node.next = new ArbitNode(node.val);
			node.next.next = temp;
			node = node.next.next;
		}
		
		ArbitNode clone = head.next;
		ArbitNode result = clone;
		
		node = head;
		while(node != null){
			node.next.arbit = node.arbit.next;
			node = node.next.next;
		}
		
		node = head;
		while(node != null){
			node.next = node.next.next;
			if(clone.next != null)
				clone.next = clone.next.next;
			node = node.next;
			clone = clone.next;
		}
		
		return result;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		ArrayList<ArbitNode> list = new ArrayList<ArbitNode>(); 
		ArbitNode head = new ArbitNode(Integer.parseInt(scanner.nextLine()));
		ArbitNode temp = head;
		list.add(temp);
		String input = scanner.nextLine();
		while(!input.equals("exit")){
			temp.next = new ArbitNode(Integer.parseInt(input));
			temp = temp.next;
			list.add(temp);
			input = scanner.nextLine();
		}
		scanner.close();
		temp.next = null;
		//for(ArbitNode node: list)
			//System.out.print(node.val);
		//System.out.println();
		//setting arbitrary pointers
		list.get(0).arbit = list.get(4);
		list.get(1).arbit = list.get(3);
		list.get(2).arbit = list.get(1);
		list.get(3).arbit = list.get(0);
		list.get(4).arbit = list.get(2);
		
		temp = head;
		while(temp != null){
			System.out.print(temp.val);
			System.out.print(temp.arbit.val);
			System.out.print(" ");
			temp = temp.next;
		}
		System.out.println();
		CloneLinkedList test = new CloneLinkedList();
		ArbitNode result = test.clone(head);
		temp = result;
		while(temp != null){
			System.out.print(temp.val);
			System.out.print(temp.arbit.val);
			System.out.print(" ");
			temp = temp.next;
		}
	}

}

class ArbitNode{
	int val;
	ArbitNode next;
	ArbitNode arbit;
	public ArbitNode(int val){
		this.val = val;
		next = null;
		arbit = null;
	}
}