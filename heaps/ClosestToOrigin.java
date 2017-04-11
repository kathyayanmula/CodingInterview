package heaps;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;

public class ClosestToOrigin {

	public List<Point> kClosestPoints(List<Point> points, int k) {

		List<Point> result = new ArrayList<>(k);
		if (points == null || points.size() == 0)
			return result;

		PriorityQueue<Point> kClosestPoints = new PriorityQueue<>(k, Collections.reverseOrder()); //max heap. Default priority queue is a min heap

		for (int i = 0; i < points.size(); i++) {
			Point temp = points.get(i);
			if (kClosestPoints.size() < k)
				kClosestPoints.add(temp);
			else if (kClosestPoints.peek().getDistance() > temp.getDistance()) {
				kClosestPoints.poll();
				kClosestPoints.add(temp);
			}
		}

		for (Point p : kClosestPoints)
			result.add(p);
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Point> points = new LinkedList<>();
		for (int i = 15; i >= 0; i--) 
			points.add(new Point(i, i + 1));
		ClosestToOrigin ct = new ClosestToOrigin();
		for(Point p: ct.kClosestPoints(points, 10))
			System.out.println(p);

	}
}

//class Point implements Comparable<Point> {
class Point implements Comparable<Point> {	
	double x;
	double y;

	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double getDistance() {
		return x * x + y * y;
	}
	
	@Override
	public int compareTo(Point a) {
		return (int) (this.getDistance() - a.getDistance());
	}
	
	@Override
	public String toString(){
		return "(" + this.x + ", " + this.y + ")";
	}
}
