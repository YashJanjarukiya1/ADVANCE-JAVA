import java.util.*;

class Conditional {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number : ");
		int num = sc.nextInt();

		if (num > 0) {
			System.out.println("Number is positive !");
		}
		else if (num < 0) {
			System.out.println("Number is negetive !");
		}
		else {
			System.out.println("Number is zero !");
		}
	}
}