import java.util.Scanner;

public class K
{
	public static void main(String args[])
	{
		Scanner obj = new Scanner(System.in);
		
		System.out.print("Enter your full name : ");
		String name = obj.nextLine();
		System.out.print("Enter your roll no : ");
		int roll = obj.nextInt();
		System.out.print("Enter your course : ");
		String course = obj.next();
		System.out.print("Enter your percentage : ");
		float per = obj.nextFloat();
		
		System.out.println("\n------Details of Student------");
		System.out.println("Roll_No :- " + roll);
		System.out.println("Full Name :- " + name);
		System.out.println("Course :- " + course);
		System.out.println("Percentile :- " + per);
	}
}
