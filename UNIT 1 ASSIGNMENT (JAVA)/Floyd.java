import java.util.*;

class Floyd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number : ");
		int num = sc.nextInt();

		int k = 1;

		System.out.println("Floyd's Triangle : ");
		for (int i = 1 ; i <= num ; i++ ) {
			for (int j = 1 ; j <= i ; j++ ) {
				System.out.print(k + " ");
				k++;
			}
			System.out.println();
		}
	}
}