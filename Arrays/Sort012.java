package arrays;

public class Sort012 {
	
	public static void sort(int num, int[] input){
		try{
		int i = 0;
		int numPointer = 0;
		while(i < input.length){
			if(input[numPointer] == num){
				while(i < input.length - 1 && input[i] == num)
					i++;
				input[numPointer] = input[i];
				input[i] = num;
			}
			i++;
			numPointer++;
		}
		}
		catch (NullPointerException e) {
			// TODO: handle exception
			throw e;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] input = {0,1,2,1,2,1,2,0,0,0,0,1,2,0,1,2};
		int[] input1 = {3,3,3,3,3,3,3};
		
		sort(1,input1);
		sort(2,input1);
		//sort(2,null);
		
		for(int i: input1)
			System.out.print(i + " ");
		
		
		
	}

}
