package sorting;

import java.util.PriorityQueue;

public class TopK {
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PriorityQueue<Integer> heap = new PriorityQueue<Integer>(10);
		int limit = 1;
//		for(limit = 1; limit < 10; limit++){
//			heap.add(limit);
//		}
		
		for(int j = 9; j> 0; j--){
			heap.add(j);
		}
		
		System.out.println(heap.toString());
		System.out.println(heap.poll());
		System.out.println(heap.poll());
		System.out.println(heap.poll());
		System.out.println(heap.poll());
		System.out.println(heap.poll());
		System.out.println(heap.poll());
		System.out.println(heap.poll());
		
		while(limit < 100){
			if(limit > heap.peek()){
				heap.poll();
				heap.add(limit);
			}
			limit++;
		}
		
		
		System.out.println(heap);
		
		
	}

}
