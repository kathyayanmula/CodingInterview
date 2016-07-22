package arrays;

public class PrintSpiralMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] myMatrix = { { 1, 2, 3}, { 4, 5, 6}, { 7, 8, 9}, {10,11,12} };
		int top = 0;
		int left = 0;
		int right = myMatrix[0].length - 1;
		int down = myMatrix.length - 1;
		while (true) {
			for (int i = left; i <= right; i++) {
				System.out.print(myMatrix[top][i]);
			}
			top++;
			if (left > right || top > down) 
				break;
			for (int j = top; j <= down; j++) {
				System.out.print(myMatrix[j][right]);
			}
			right--;
			if (left > right || top > down)
				break;
			for (int k = right; k >= left; k--) {
				System.out.print(myMatrix[down][k]);
			}
			down--;
			if (left > right || top > down)
				break;
			for (int l = down; l >= top; l--) {
				System.out.print(myMatrix[l][left]);
			}
			left++;
			if (left > right || top > down)
				break;
			
		}
	}

}
