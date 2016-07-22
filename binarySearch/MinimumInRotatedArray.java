package arrays;

public class MinimumInRotatedArray {

	public int findMinimum(int[] input) {
		if (input == null)
			return -1;
		if (input.length < 2)
			return input[0];

		int start = 0;
		int end = input.length - 1;
		int middle = 0;
		int len = input.length;

		if (input[start] < input[end])
			return input[start];
		
		while (start <= end) {

			middle = (start + end) / 2;
			int next = (middle + 1) % len;
			int prev = (middle + len - 1) % len;
			if (input[middle] <= input[prev] && input[middle] <= input[next])
				return input[middle];
			else if (input[middle] < input[end])
				end = middle - 1;
			else if (input[middle] > input[end])
				start = middle + 1;
		}

		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] input = { 1, 2, 3, 4, 5, 6 };
		int[] input1 = { 6, 1, 2, 3, 4, 5 };
		int[] input2 = { 5, 6, 1, 2, 3, 4 };
		int[] input3 = { 4, 5, 6, 1, 2, 3 };
		int[] input4 = { 3, 4, 5, 6, 1, 2 };
		int[] input5 = { 2, 1, 1, 2, 2, 2 };
		int[] input6 = { 1, 1, 1, 1, 1, 1 };

		MinimumInRotatedArray test = new MinimumInRotatedArray();
		System.out.println(test.findMinimum(input));
		System.out.println(test.findMinimum(input1));
		System.out.println(test.findMinimum(input2));
		System.out.println(test.findMinimum(input3));
		System.out.println(test.findMinimum(input4));
		System.out.println(test.findMinimum(input5));
		System.out.println(test.findMinimum(input6));

	}

}
