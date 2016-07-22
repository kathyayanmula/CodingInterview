package Arrays;

public class AlternatePositiveNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] input = {1,2,3,4,5,-1,-2,-3,-4,-5};
	    
	    for(int num : input){
	    	int j = 0;
	    	
	    	while(j+2 < input.length){
	    		int first = input[j] >= 0 ? 1 : 0;
	    		int second = input[j+1] >= 0 ? 1 : 0;
	    		int third = input[j+2] >= 0 ? 1 : 0;
	    		
	    		if(first == second && second != third){
	    			int temp = input[j+1];
	    			input[j+1] = input[j+2];
	    			input[j+2] = temp;
	    		}
	    		j++;
	    		
	    	}
	    }
	    
	    for(int num: input)
	    	System.out.print(num);

	}

}
