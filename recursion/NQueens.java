package recursion;

public class NQueens {
	
	public void getPositions(int size){
		int[] input = new int[size];
		for(int i = 0; i < size; i++)
			input[i] = i;
		writePosition(input, 0);
		
	}
	
	public void writePosition(int[] input, int i){
		if(i == input.length){
			for(Object obj:input)
				System.out.print(obj + " ");
			System.out.println();
		}
		
		for(int j = i; j < input.length; j++){
			swap(input, i, j);
			if(!isDiagonal(input, i))
				writePosition(input, i+1);
			swap(input, j,i);
		}
		
	}
	
	public void swap(int[] input, int i, int j){
		int temp = input[i];
		input[i] = input[j];
		input[j]=temp;
	}
	
	public boolean isDiagonal(int[] input, int i){
		for(int j = 0; j < i; j++){
			if(input[i] - input[j] == i-j)
				return true;
			if(input[i] - input[j] == j-i)
				return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NQueens test =new NQueens();
		test.getPositions(5);
	}

}
