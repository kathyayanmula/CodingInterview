package arrays;

public class RLEcombinations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "batch";
		int combinations = input.length() - 2;
		int length = 0;
		int firstChars = 1;
		for (int i = combinations; i > 1; i--) {
			while (i + firstChars < input.length()) {
				while (length < firstChars) {
					System.out.print(input.charAt(length));
					length++;
				}
				System.out.print(i);
				length += i;
				while (length < input.length()) {
					System.out.print(input.charAt(length));
					length++;
				}
				System.out.print(" ");
				firstChars++;
				length = 0;
			}
			System.out.println();
			firstChars = 1;
		}
	}

}
