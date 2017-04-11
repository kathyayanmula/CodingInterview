package heaps;

import java.util.PriorityQueue;

public class MergeKSortedLists {
	public ListNode mergeKLists(ListNode[] lists) {
		ListNode fakeHead = new ListNode(-1);
		ListNode temp = fakeHead;
		if (lists == null || lists.length == 0)
			return fakeHead.next;
		// PriorityQueue<ListNode> q = new PriorityQueue<ListNode>(size, new
		// Comparator<ListNode>(){
		// @Override
		// public int compare(ListNode a, ListNode b){
		// return (a.val - b.val);
		// }
		// });

		PriorityQueue<ListNode> q = new PriorityQueue<>(lists.length, (a, b) -> a.val - b.val);

		for (ListNode node : lists)
			if (node != null)
				q.add(node);

		while (!q.isEmpty()) {

			temp.next = q.poll();
			temp = temp.next;
			//you add the next node of the just popped node because rest of the nodes are already nodes with lowest values 
			if (temp.next != null)
				q.add(temp.next);
		}

		return fakeHead.next;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ListNode l1 = new ListNode(0);
		ListNode l2 = new ListNode(1);
		ListNode temp = l1;
		for (int i = 2; i < 50; i += 2) {
			temp.next = new ListNode(i);
			temp = temp.next;
		}
		temp = l2;
		for (int i = 3; i < 50; i += 2) {
			temp.next = new ListNode(i);
			temp = temp.next;
		}

		MergeKSortedLists mk = new MergeKSortedLists();
		ListNode[] lists = { l2, l1 };
		ListNode result = mk.mergeKLists(lists);
		temp = result;
		while (temp != null) {
			System.out.print(temp.val + " ");
			temp = temp.next;
		}
	}

}

class ListNode {
	int val;
	ListNode next;

	public ListNode(int val) {
		this.val = val;
		next = null;
	}
}