package arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MergeIntervals {

	public ArrayList<Interval> merge(ArrayList<Interval> intervals) {

		if (intervals == null || intervals.size() < 2)
			return intervals;

		ArrayList<Interval> result = new ArrayList<Interval>();

		Collections.sort(intervals, new Comparator<Interval>() {
			public int compare(Interval i1, Interval i2) {
				return i1.start - i2.start;
			}
		});

		for (int i = 0; i < intervals.size(); i++) {

			Interval current = intervals.get(i);

			while (i + 1 < intervals.size() && current.end >= intervals.get(i + 1).start) {
				if (current.end < intervals.get(i + 1).end)
					current.end = intervals.get(i + 1).end;
				i++;
			}

			result.add(current);

		}

		return result;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Interval{
	int start;
	int end;
	public Interval(int start, int end){
		this.start = start;
		this.end = end;
	}
}
