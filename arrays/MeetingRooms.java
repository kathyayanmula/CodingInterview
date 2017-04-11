package arrays;

import java.util.Arrays;
import java.util.PriorityQueue;

public class MeetingRooms {
	
	public int minMeetingRooms(Interval[] intervals){
		if(intervals == null)
			return 0;
		if(intervals.length < 2)
			return intervals.length;
		int meetingRooms = 0;
		//Sort the input intervals according to the start time. The comparator below works only with Java 8
		Arrays.sort(intervals, (a, b) -> (a.start - b.start));
		
		//Now use a min heap to keep the track of the meeting end times
		//the earliest meeting to end i.e. the meeting with lowest end time will be the root
		//now if the current meeting starts or after or on the end time of root then remove that element. In a way you are  
		//using that meeting room with to host a new one
		//Remember that the list of intervals is sorted according to start time so the next meetings start time will always be higher 
		//if the current interval start time is >= root end time
		//Insert just the end time instead of the whole interval object, this way you can avoid implementing a custom comparator for the heap
		PriorityQueue<Integer> heap = new PriorityQueue<>(intervals.length);
		heap.offer(intervals[0].end);
		for(int i = 1; i < intervals.length; i++){
			if(intervals[i].start >= heap.peek())
				heap.poll();
			heap.offer(intervals[i].end);
//			meetingRooms = Math.max(meetingRooms, heap.size());
		}
		return heap.size();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
