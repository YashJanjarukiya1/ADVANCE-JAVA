import java.util.*;

class Leap {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Year : ");
		int year = sc.nextInt();

		if (year % 4 == 0) {
			System.out.println(year + " is Leap year !!!");
		}
		else {
			System.out.println(year + " is not Leap year !!!");
		}
	}
}