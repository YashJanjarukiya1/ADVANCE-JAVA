import java.util.*;

class Pallindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Number : ");
		int num = sc.nextInt();
		int rev = 0;
		int rem;
		int originalnum = num;
		while (num != 0) {
			rem = num % 10;
			rev = rev * 10 + rem;
			num = num / 10; 
		}
		if (originalnum == rev) {
			System.out.println("It is pallindrome !!!");
		}
		else {
			System.out.println("It is not a pallindrome !!!");
		}
	}
}