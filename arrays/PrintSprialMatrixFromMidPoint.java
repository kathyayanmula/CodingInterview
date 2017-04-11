package arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PrintSprialMatrixFromMidPoint {
	public List<Integer> print(int[][] input) {
		int n = input.length;
		List<Integer> result = new ArrayList<>();
		if(n == 1){
			result.add(input[0][0]);
			return result;
		}
		int row = n%2 == 0 ? n/2 - 1 : n/2;
		int col = row;
		int i = row;
		int j = col;
		int steps = 1;
		int k = 0;
		while (true) {

			k = steps;

			while (k > 0) {
				if (inBounds(i, j, n)) {
					result.add(input[i][j]);
				}
				j++;
				k--;
			}

			if (i > row + 4 || j > col + 4)
				break;

			k = steps;

			while (k > 0) {
				if (inBounds(i, j, n)) {
					result.add(input[i][j]);
				}
				i++;
				k--;
			}

			if (i > row + 4 || j > col + 4)
				break;

			steps++;

			k = steps;

			while (k > 0) {
				if (inBounds(i, j, n)) {
					result.add(input[i][j]);
				}
				j--;
				k--;
			}

			if (i > row + 4 || j > col + 4)
				break;

			k = steps;

			while (k > 0) {
				if (inBounds(i, j, n)) {
					result.add(input[i][j]);
				}
				i--;
				k--;
			}
			steps++;

			if (i > row + 4 || j > col + 4)
				break;

		}
		return result;
	}
	
	boolean inBounds(int i, int j, int n){
		return (i >= 0 && i <= n - 1 && j >=0 && j <= n -1);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] odd = { { 25, 16, 7, 8, 9 }, { 24, 15, 6, 1, 2 }, { 23, 14, 5, 4, 3 }, { 22, 13, 12, 11, 10 },
				{ 21, 20, 19, 18, 17 } };
		int[][] even = { { 7, 8, 9, 10 }, { 6, 1, 2, 11 }, { 5, 4, 3, 12 }, { 16, 15, 14, 13 } };
		int[][] two = {{1,2},{3,4}};

		PrintSprialMatrixFromMidPoint test = new PrintSprialMatrixFromMidPoint();
//				System.out.println("row " + i + " column " + j);
				List<Integer> result = test.print(two);
				System.out.println(result);
				Set<Integer> set = new HashSet<>(result);
				if(set.size() != result.size()){
					System.out.println(result);
				}
			}
}
