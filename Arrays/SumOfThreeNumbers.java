package arrays;

public class SumOfThreeNumbers {
	
public int threeSumClosest(int[] a, int b) {
	    
	    if(a.length < 3)
	        return 0;
	    
	    long sum = 0;
	    long finalSum = Integer.MAX_VALUE;
	    for(int i = 0; i < a.length - 1; i++){
	        int j = (i + 2)%a.length;
	        while(j > i || j < i - 1){
	            sum = a[i] + a[i+1] + a[j];
	            int numberI = a[i];
	            int numberI1 = a[i+1];
	            int numberj = a[j];
	            if(Math.abs(sum-(long)b) == 0)
	            	return (int)sum;
	            if(Math.abs(sum-(long)b) < Math.abs(finalSum-(long)b)){
	                finalSum = sum;
	            }
	            j = (j+1)%a.length;
	        }
	    }
	    return (int)finalSum;
	    
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {4, 7, -4, 2, 2, 2, 3, -5, -3, 9, -4, 9, -7, 7, -1, 9, 9, 4, 1, -4, -2, 3, -3, -5, 4, -7, 7, 9, -4, 4, -8};
		SumOfThreeNumbers test = new SumOfThreeNumbers();
		System.out.println(test.threeSumClosest(a, -3));
	}

}
