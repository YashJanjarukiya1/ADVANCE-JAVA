import java.util.*;

class Factorial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int fact = 1;
		int i = 1;

		System.out.println("Enter number : ");
		int no = sc.nextInt();

		do {
			fact = fact * i;
			i++;
		}while (i <= no);

		System.out.println("The Factorial of " + no + " is " + fact);
	}
}