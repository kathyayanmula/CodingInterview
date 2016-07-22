package Arrays;

public class MatrixDiagonals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] myMatrix = { { 1, 2, 3, 11,0}, {4, 5, 6, 12,1}, {7, 8, 9, 13,2}, {10,11,12, 14,3}, {1,2,3,4,5} };
		int top = 0;
		int left = 0;
		int right = myMatrix[0].length - 1;
		int down = myMatrix.length - 1;
		for(int i = left; i < myMatrix.length; i++){
			int j = i;
			int k = 0;
			while(j>=0 && k <=i){
				System.out.print(myMatrix[k][j]+" ");
				j--;
				k++;
			}
			System.out.println();
		}
		top++;
		left++;
		for(int i = left; i <= right; i++){
			int j = down;
			int k = left;
			while(j>= top && k <=right){
				System.out.print(myMatrix[k][j]+" ");
				j--;
				k++;
			}
			System.out.println();
			left++;
		}

	}

}
