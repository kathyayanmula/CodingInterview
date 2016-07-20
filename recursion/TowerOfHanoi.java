package recursion;
import java.util.HashMap;
import java.util.Scanner;

public class TowerOfHanoi {

	    HashMap<String, Integer> rods = new HashMap<String, Integer>();
	    
	    public void initializeHanoi(int numOfDisks, String from, String to, String use){
	        rods.put(from, numOfDisks);
	        rods.put(to, 0);
	        rods.put(use, 0);
	        hanoi(numOfDisks, from, to, use);
	    }
	    
	    public void hanoi(int numOfDisks, String from, String to, String use){
	        if(numOfDisks == 1){
	            System.out.println("moving disk " + numOfDisks + " from " + from + " to " + to);
	            rods.put(from, rods.get(from) - 1);rods.put(to, rods.get(to) + 1);
	            printRods(rods);
	            return;
	        }
	        hanoi(numOfDisks - 1, from, use, to);
	        System.out.println("moving disk " + numOfDisks + " from " + from + " to " + to);
	        rods.put(from, rods.get(from) - 1);rods.put(to, rods.get(to) + 1);
	        printRods(rods);
	        hanoi(numOfDisks - 1, use, to, from);
	    }
	    
	    public void printRods(HashMap<String, Integer> rods){
	        for(String rod: rods.keySet()){
	            System.out.print(rod + ":" + rods.get(rod) + " ");
	        }
	        System.out.println();
	    }
	    public static void main(String args[] ) throws Exception {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
	        TowerOfHanoi sol = new TowerOfHanoi();
	        Scanner sc = new Scanner(System.in);
	        int input = Integer.parseInt(sc.nextLine());
	        sc.close();
	        sol.initializeHanoi(input, "A", "C", "B");
	        
	        
	    }

}
