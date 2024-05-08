import java.util.*;

class Percentage {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Subject 1 marks : ");
		int sub1 = sc.nextInt();

		System.out.println("Enter Subject 2 marks : ");
		int sub2 = sc.nextInt();

		System.out.println("Enter Subject 3 marks : ");
		int sub3 = sc.nextInt();

		int per = (sub1 + sub2 + sub3)/3;
		System.out.println("The Percentage is " + per);

		if (per > 70) {
			System.out.println("Distinction");
		}
		else if (per > 60) {
			System.out.println("First Class");
		}
		else if (per > 50) {
			System.out.println("Second Class");
		}
		else if (per < 35) {
			System.out.println("Fail");
		}
		else {
			System.out.println("Good");
		}
	}
}