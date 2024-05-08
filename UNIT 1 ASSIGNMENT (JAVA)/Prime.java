import java.util.*;

class Prime {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number to generate prime numbers :");
		int no = sc.nextInt();

		int count = 0;
		int number = 2;

		while (count < no) {
			boolean isPrime = true;
			for (int i = 2 ; i <= number/2 ; i++ ) {
				if (number % i == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				System.out.print(number + " ");
				count++;
			}
			number++;
		}
	}
}