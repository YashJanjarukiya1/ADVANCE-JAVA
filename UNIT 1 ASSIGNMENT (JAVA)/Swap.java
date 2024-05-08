import java.util.*;

class Swap {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a : ");
		int a = sc.nextInt();

		System.out.println("Enter b : ");
		int b = sc.nextInt();

		System.out.println("Before Swapping !!!");
		System.out.println("The value of a is " + a);
		System.out.println("The value of b is " + b);

		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println("After Swapping !!!");
		System.out.println("The value of a is " + a);
		System.out.println("The value of b is " + b);
	}
}