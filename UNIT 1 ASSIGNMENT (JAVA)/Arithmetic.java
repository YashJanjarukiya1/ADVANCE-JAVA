import java.util.*;

class Arithmetic {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a : ");
		int a = sc.nextInt();

		System.out.println("Enter b : ");
		int b = sc.nextInt();

		System.out.println("The Addition of a and b is " + (a + b));
		System.out.println("The Subtraction of a and b is " + (a - b));
		System.out.println("The Multiplication of a and b is " + (a * b));
		System.out.println("The Division of a and b is " + (a / b));
		System.out.println("The Modulus of a and b is " + (a % b));
	}
}