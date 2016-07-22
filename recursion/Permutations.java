package recursion;

public class Permutations {

	
	public void getPermuatations(Object[] input){
		writePermutation(input, 0);
		
	}
	
	public void writePermutation(Object[] input, int start){
		if(start == input.length){
			for(Object obj:input)
				System.out.print(obj + " ");
			System.out.println();
		}
		
		for(int j = start; j < input.length; j++){
			swap(input, start, j);
			writePermutation(input, start+1);
			swap(input, j,start);
		}
		
	}
	
	public void swap(Object[] input, int i, int j){
		Object temp = input[i];
		input[i] = input[j];
		input[j]=temp;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Permutations test = new Permutations();
		Character[] input = {'a', 'b', 'c', 'd'};
		test.getPermuatations(input);
	}

}
