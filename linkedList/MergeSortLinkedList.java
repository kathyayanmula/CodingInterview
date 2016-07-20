package linkedList;

public class MergeSortLinkedList {
	
public Node mergeSorter(Node head){
		if(head == null || head.next == null)
			return head;
		
		Node first = head;
		Node second = null;
		
		Node fast = head;
		Node slow = head;
		Node slow_prev = null;
		
		while(fast != null && fast.next != null){
			slow_prev = slow;
			slow = slow.next;
			fast = fast.next.next;
		}
		if(slow_prev != null)
			slow_prev.next = null;
		second = slow;

		Node head1 = mergeSorter(first);
		Node head2 = mergeSorter(second);
		
		Node merged = merge(head1, head2);
		return merged;
	}
	
	public Node merge(Node left, Node right){
		
		Node fakeHead = new Node(10);
		Node temp = fakeHead;
		while(left != null || right != null){
			if(left == null){
				temp.next = right;
				break;
			}
			else if(right == null){
				temp.next = left;
				break;
			}
			if(left.val <= right.val){
				temp.next = left;
				left = left.next;
				temp = temp.next;
			}
			else if(left.val > right.val){
				temp.next = right;
				right = right.next;
				temp = temp.next;
			}
		}		
		
		return fakeHead.next;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MergeSortLinkedList test = new MergeSortLinkedList();
		Node head = new Node(7);
		Node temp = head;
		for(int i = 6; i > 0; i--){
			temp.next = new Node(i);
			temp = temp.next;
		}
		temp = head;
		while(temp != null){
			System.out.print(temp.val + " ");
			temp = temp.next;
		}
		System.out.println();
		temp = test.mergeSorter(head);
		
		while(temp != null){
			System.out.print(temp.val + " ");
			temp = temp.next;
		}
	}
}
