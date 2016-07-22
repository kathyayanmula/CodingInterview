package recursion;

public class NumOfTrees {
	
	public int countTrees(int nodes){
		//int[] treeCount = [0]*nodes;
		if(nodes == 0 || nodes == 1)
			return 1;
		int sum = 0;
		int left = 0;
		int right = 0;
		//For number of elements greater than 1 we iterate through each element of the 
		//array and for each element k as root we find the number of trees possible for 
		//k-1 elements in the left and the number of trees possible for n-k elements in 
		//the right. Now, these two are independent of each other so to find the total 
		//trees for a given root, we multiply the number of trees in left and right and add it to the sum.
		for(int i = 1; i <= nodes; i++){
			left = countTrees(i - 1);  //number of trees possible on the right side
			right = countTrees(nodes - i);
			sum += left*right;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumOfTrees test = new NumOfTrees();
		System.out.println(test.countTrees(3));
		System.out.println(test.countTrees(4));
		System.out.println(test.countTrees(5));
		System.out.println(test.countTrees(6));
	}
}