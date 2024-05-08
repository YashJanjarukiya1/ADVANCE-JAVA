import java.util.*;

class Bank {
	static String name,type;
	long accno;
	static long bal ;

	Bank(String n,long a,String t,long b)
	{
		name = n;
		accno = a;
		type = t;
		bal = b;
	}

	static void deposit(long d)
	{
		System.out.println("You have deposited " + d + "rs.");
		System.out.println("Your Balance is " + (bal + d) + "rs.");
	}

	static void withdraw(long w)
	{
		if (w > bal) {
			System.out.println("Insufficient Balance to withdraw !!!");
		}
		else {
			System.out.println("You have withdrawn " + w + "rs.");
			System.out.println("Your Balance is " + (bal - w) + "rs.");
		}
	}

	static void display()
	{
		System.out.println("Your Name is " + name);
		System.out.println("Your Balance is " + bal + "rs.");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your name : ");
		String n = sc.next();

		System.out.println("Enter your Account Number : ");
		long a = sc.nextLong();

		System.out.println("Enter your Type of Account : ");
		String t = sc.next();

		System.out.println("Enter your Balance : ");
		long b = sc.nextLong();

		Bank b1 = new Bank(n,a,t,b);

		System.out.println("Enter your Amount to be deposited : ");
		long d = sc.nextLong();

		deposit(d);

		System.out.println("Enter your Amount to be withdrawn : ");
		long w = sc.nextLong();

		withdraw(w);

		display();
	}
}