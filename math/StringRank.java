package math;

import java.util.ArrayList;
import java.util.Collections;

public class StringRank {
	public int findRank(String a) {
	    
	    if(a.length() < 1)
	        return 0;
	    if(a.length() == 1)
	        return 1;
	        
	    long rank = 0;
	    
	    while(a.length() > 0){
	        //System.out.println(findPartialRank(a));
	        rank += findPartialRank(a);
	        //System.out.println("partial " + findPartialRank(a));
	        //System.out.println("rank " + rank);
	        a = a.substring(1);
	    }
	    
	    return (int)((rank+1L)%(long)1000003);
	}
	
	public long findPartialRank(String a){
	    ArrayList<Character> splitString = new ArrayList<Character>();
	    long rank = 0;
	    for(char c: a.toCharArray())
	        splitString.add(c);
	    Collections.sort(splitString);
	    //System.out.println(a);
	    //System.out.println(splitString);
	    rank = (long)splitString.indexOf(a.charAt(0))*fact(a.length() - 1);
	    //System.out.println("partial " + rank);
	    return rank;
	    
	}
	
	public long fact(int n){
	    if(n ==0)
	        return 1;
	    return (long)n*fact(n-1);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringRank rank = new StringRank();
		System.out.println(rank.findRank("ZCSFLVHXRYJQKWABGT"));
		

	}
	
}
