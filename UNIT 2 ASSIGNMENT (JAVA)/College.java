import  java.util.*;

class College {
	static int no;
	static  String name,cname;
	static  double per;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your Roll no : ");
		no = sc.nextInt();

		System.out.println("Enter your Name : ");
		name = sc.next();

		System.out.println("Enter your College Name : ");
		cname = sc.next();

		System.out.println("Enter your Percentage : ");
		per = sc.nextInt();

		System.out.println("Your Roll no is " + no);
		System.out.println("Your Name is " + name);
		System.out.println("Your College Name is " + cname);
		System.out.println("Your Percentage is " + per);
	}
}