import java.util.*;

class Bitwise {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a : ");
		int a = sc.nextInt();

		System.out.println("Enter b : ");
		int b = sc.nextInt();

		System.out.println("a & b is " + (a&b));
		System.out.println("a | b is " + (a|b));
		System.out.println("a ^ b is " + (a^b));
	}
}