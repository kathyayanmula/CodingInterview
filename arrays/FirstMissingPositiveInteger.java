package arrays;

import java.util.ArrayList;

public class FirstMissingPositiveInteger {

	public int firstMissingPositive(ArrayList<Integer> a) {

		if (a == null || a.size() < 1)
			return 1;

		int num = 0;
		int max = 0;
		int temp = 0;

		for (int i = 0; i < a.size(); i++) {
			num = a.get(i);

			if (num >= 0 && num <= a.size()) {

				while (num > 0 && num < a.size()) {
					temp = a.get(num);
					a.set(num, 0);
					max = temp > max ? temp : max;
					num = temp;
				}

			}

		}

		if (max == 0)
			return 1;

		for (int i = 1; i < a.size(); i++) {
			if (a.get(i) != 0) {
				return i;
			}
		}
		// System.out.println("max " + max);
		return max + 1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirstMissingPositiveInteger test = new FirstMissingPositiveInteger();

		ArrayList<Integer> input = new ArrayList<>();

		input.add(1);
		input.add(2);
		input.add(3);
		input.add(4);
		input.add(5);
		input.add(6);

		System.out.println(test.firstMissingPositive(input));

	}

}
