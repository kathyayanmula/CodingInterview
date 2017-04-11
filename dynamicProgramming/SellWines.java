package dynamicProgramming;

public class SellWines {
	
	int[] wines = {2,3,5,1,4};
	int len;
	int[][] output;
	
	public SellWines(){
		len = wines.length;
		output = new int[len][len];
		
		for(int i = 0; i < output.length; i++){
			for(int j = 0; j < output[i].length; j++)
				output[i][j] = -1;
		}
	}
	
	public int getArray(int be, int en){
		
		if(be > en)
			return 0;
		
		if(output[be][en] != -1)
			return output[be][en];
		
		int year = len - (en - be + 1) +1;
		
//		output[be][en] = Math.max(getArray(be+1, en)+year*wines[be], getArray(be, en-1)+year*wines[en]);
		
		return output[be][en] = Math.max(getArray(be+1, en)+year*wines[be], getArray(be, en-1)+year*wines[en]);
		
	}
	
	public void printArray(){
		for(int[] row: output){
			for(int num: row){
				System.out.print(num + " ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SellWines test = new SellWines();
		
		test.printArray();
		System.out.println(test.getArray(0, test.len-1));
		test.printArray();
		
	}

}
