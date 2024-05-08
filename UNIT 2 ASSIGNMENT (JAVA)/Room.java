import java.util.*;

class Room {
	static int l;
	static int b;

	static void getdata()
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter length : ");
		l = sc.nextInt();

		System.out.println("Enter breadth : ");
		b = sc.nextInt();
	}

	static void area()
	{
		System.out.println("Area of Room is " + (l * b));
	}

	public static void main(String[] args) {
		
		getdata();
		area();
	}
}