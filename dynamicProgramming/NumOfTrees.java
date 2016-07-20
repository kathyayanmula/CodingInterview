package dynamicProgramming;

public class NumOfTrees {
	
	public int countTrees(int nodes){
		int[] treeCount = new int[nodes];
		treeCount[0] = 1; treeCount[1] = 1;
		return countTrees(nodes - 1, treeCount);
	}
	
	public int countTrees(int nodes, int[] treeCount){
		//int[] treeCount = [0]*nodes;
		if(treeCount[nodes] != 0)
			return treeCount[nodes];
		int sum = 0;
		int left = 0;
		int right = 0;
		//For number of elements greater than 1 we iterate through each element of the 
		//array and for each element k as root we find the number of trees possible for 
		//k-1 elements in the left and the number of trees possible for n-k elements in 
		//the right. Now, these two are independent of each other so to find the total 
		//trees for a given root, we multiply the number of trees in left and right and add it to the sum.
		for(int i = 0; i <= nodes; i++){
			left = countTrees(i);  //number of trees possible on the right side
			if(treeCount[i] != 0)
				treeCount[i] = left;
			right = countTrees(nodes - i);
			if(treeCount[nodes - i] != 0)
				treeCount[nodes - i] = left;
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
