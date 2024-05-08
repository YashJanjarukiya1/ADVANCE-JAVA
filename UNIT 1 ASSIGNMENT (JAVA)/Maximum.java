import java.util.*;

class Maximum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a : ");
		int a = sc.nextInt();

		System.out.println("Enter b : ");
		int b = sc.nextInt();

		System.out.println("Enter c : ");
		int c = sc.nextInt();

		if (a > b && a > c) {
			System.out.println("a is greater !");
		}
		else if (a < b && c < b) {
			System.out.println("b is greater !");
		}
		else if (a < c && b < c) {
			System.out.println("c is greater !");
		}
		else {
			System.out.println("All are equal !!!");
		}
	}
}