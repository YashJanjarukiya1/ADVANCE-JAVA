import java.util.*;

class Logical {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a : ");
		int a = sc.nextInt();

		System.out.println("Enter b : ");
		int b = sc.nextInt();

		if (a > 0 && b > 0) {
			System.out.println("Both are positive !");
		}
		else if (a < 0 && b < 0) {
			System.out.println("Both are negative !");
		}
		else {
			System.out.println("Both are zero !!!");
		}
	}
}