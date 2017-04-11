package math;

import java.util.Scanner;

public class HoursAndMinutes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int testCases = Integer.parseInt(sc.nextLine());

		while (testCases > 0) {

			String[] input = sc.nextLine().split(" ");
			int hours = Integer.parseInt(input[0])%12;
			int minutes = Integer.parseInt(input[1])%60;

			float minutesDegrees = (float) minutes * 6;
			float hoursDegrees = (float) hours * 30 + (float) minutes / 2;
			float angleDiff = Math.abs(minutesDegrees - hoursDegrees);
			int answer = angleDiff > 180 ? (int)(360 - angleDiff) : (int)angleDiff;
			System.out.println(answer);
			testCases--;

		}

	}

}
