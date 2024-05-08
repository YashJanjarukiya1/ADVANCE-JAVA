import java.util.*;

class Comparison {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a : ");
		double a = sc.nextInt();

		System.out.println("Enter b : ");
		double b = sc.nextInt();

		if (a > b) {
			System.out.println("The Multiplication of a and b is " + (a * b));
		}
		else {
			System.out.println("The Division of a and b is " + (a / b));
		}
	}
}