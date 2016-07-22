package linkedList;

import java.io.*;
import java.util.Scanner;

public class ReverseInGroups {
    
    public Node reverse(Node node, int k){
    	Node head = node;
        Node prev = null;
        Node next = null;
        int count = k;
        while( count > 0 && node != null){
            next = node.next;
            node.next = prev;
            prev = node;
            node = next;
            count--;
        }
        
        //recursive call to the same function
        if(next != null)
        	head.next = reverse(next,k);
        
        return prev;
    }
    
    /*Iterative solution
     * public Node reverseInGroups(Node head, int n){
        if(head == null || head.next == null)
            return head;
        int i = 0;
        Node node1 = head;
        Node prev1 = null;
        Node node2 = head;
        Node next2 = null;
        
        while(node2 != null){
            i = 0;
            while(node2.next != null && i < n - 1){
                node2 = node2.next;
                i++;
            }
            next2 = node2.next;
            node2.next = null;
        Node temp = reverse(node1);
        if(prev1 != null)
            prev1.next = temp;
        else
            head = temp;
        
        node1.next = next2;
        prev1 = node1;
        node1 = next2;
        node2 = next2;
        }
        return head;
    }
     */
    
    
public static void main(String args[] ) throws Exception {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */
    Scanner sc = new Scanner(System.in);
    String input = sc.nextLine();
    Node head = new Node(Integer.parseInt(input));
    Node temp = head;
    input = sc.nextLine();
    while(!input.equals("exit")){
        temp.next = new Node(Integer.parseInt(input));
        temp = temp.next;
        input = sc.nextLine();
    }
    
    ReverseInGroups test = new ReverseInGroups();
    temp = test.reverse(head, 5);
    while(temp != null){
        System.out.println(temp.val);
        temp = temp.next;
    }
}
}