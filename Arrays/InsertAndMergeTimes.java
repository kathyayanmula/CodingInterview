package arrays;

import java.util.ArrayList;

public class InsertAndMergeTimes {
    public ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {
        ArrayList<Interval> result = new ArrayList<Interval>();
        
        int index = 0;
        
        for(int i = 0; i < intervals.size(); i++){
            if(newInterval.start > intervals.get(i).start)
                index = i;
            else
                break;
            
        }
        if(index == 0 )
        	intervals.add(index, newInterval);
        else	
        	intervals.add(index+1, newInterval);
        //System.out.println(intervals);
        
        int tempTime = 0;
        for(Interval interval:intervals){
            if(interval.start > interval.end){
                tempTime = interval.start;
                interval.start = interval.end;
                interval.end = tempTime;
            }
        }
        //System.out.println(intervals);
        
        Interval current = intervals.get(0);
        Interval resultInterval = new Interval(current.start, current.end);
        int objectsCreated = 1;
        for(int i = 1; i <intervals.size(); i++){
            if(objectsCreated == result.size()){
                resultInterval = new Interval(current.start, current.end);
                objectsCreated++;
                System.out.println(objectsCreated);
            }
            current = intervals.get(i);
            if(resultInterval.end >= current.start){
                resultInterval.end = Math.max(current.end, resultInterval.end);
            }
            else{
                result.add(resultInterval);
            }
        }
        //if(previousInterval.start != resultInterval.start)
        result.add(resultInterval);
        return result;
    }
    
    public static void main(String[] args){
    	Interval interval1 = new Interval(33950165, 36418956);
    	Interval interval2 = new Interval(40087908,41184444);
    	Interval interval3 = new Interval(36210193,61984219);
    	Interval interval4 = new Interval(1, 2);
    	Interval interval5 = new Interval(3,4);
    	Interval interval6 = new Interval(10,8);
    	ArrayList<Interval> intervals = new ArrayList<Interval>();
    	ArrayList<Interval> intervals1 = new ArrayList<Interval>();
    	intervals.add(interval1);intervals.add(interval2);
    	intervals.add(interval4);intervals.add(interval5);
    	ArrayList<Integer> yo = new ArrayList<Integer>();
    	InsertAndMergeTimes newTimes = new InsertAndMergeTimes();
    	InsertAndMergeTimes newTimes1 = new InsertAndMergeTimes();
    	
    	System.out.println(newTimes.insert(intervals, interval3));
    	System.out.println(newTimes1.insert(intervals1, interval6));
    }
}
