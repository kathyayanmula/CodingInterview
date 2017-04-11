package math;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Square {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCases = Integer.parseInt(sc.nextLine());
		StringTokenizer st = null;
		while (testCases > 0) {
			testCases--;
			st = new StringTokenizer(sc.nextLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			int d = Integer.parseInt(st.nextToken());

			if (a == b) {
				if (b == c) {
					if (c == d) {
						System.out.println("1");
						continue;
					}
				}
			}
			System.out.println("0");
		}
	}
}
