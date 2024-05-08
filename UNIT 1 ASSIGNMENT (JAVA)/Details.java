import java.util.*;

class Details {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Roll No : ");
		int no = sc.nextInt();

		System.out.println("Enter Name : ");
		String name = sc.next();

		System.out.println("Enter Surname : ");
		String sname = sc.next();

		System.out.println("Enter Subject 1 Marks : ");
		int sub1 = sc.nextInt();

		System.out.println("Enter Subject 2 Marks : ");
		int sub2 = sc.nextInt();

		System.out.println("Enter Subject 3 Marks : ");
		int sub3 = sc.nextInt();

		System.out.println("Enter Subject 4 Marks : ");
		int sub4 = sc.nextInt();

		System.out.println("Enter Subject 5 Marks : ");
		int sub5 = sc.nextInt();

		System.out.println();
		
		System.out.println("Your Roll No is " + no);
		System.out.println("Your Name is " + name);
		System.out.println("Your Surname is " + sname);
		System.out.println("Total of Subjects Marks is " + (sub1 + sub2 + sub3 + sub4 + sub5));
		System.out.println("Percentage of Student is " + (sub1 + sub2 + sub3 + sub4 + sub5)/5);
	}
}