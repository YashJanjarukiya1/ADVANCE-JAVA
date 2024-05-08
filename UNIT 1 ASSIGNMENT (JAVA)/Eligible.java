import java.util.*;

class Eligible {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter age : ");
		int age = sc.nextInt();

		System.out.println("Enter weight : ");
		int weight = sc.nextInt();

		if (age > 18 && age < 55) {
			if (weight > 45) {
				System.out.println("You are eligible for donating blood !!!");
			}
			else {
				System.out.println("You are not eligible for donating blood !!!");
			}
		}
		else {
			System.out.println("You are not eligible for donating blood !!!");
		}
	}
}