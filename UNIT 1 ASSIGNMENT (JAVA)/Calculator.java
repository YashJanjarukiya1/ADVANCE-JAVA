import java.util.*;

class Calculator {
	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);

		int ch,a,b;

		do
		{
			System.out.println("Enter Your Choice : [1.Addition , 2.Subtraction , 3.Multiplication , 4.Division , 5.Modulus , 6.Exit]");
			ch = s1.nextInt();

			if (ch == 6) {
				break;
			}


			System.out.println("Enter a : ");
			a = s1.nextInt();

			System.out.println("Enter b : ");
			b = s1.nextInt();
		

			switch (ch) {
			case 1 : 
				System.out.println("You have chosen Addition !!!");
				System.out.println("The Addition of a and b is " + (a+b));
				System.out.println("");
				break;
			case 2 : 
				System.out.println("You have chosen Subtraction !!!");
				System.out.println("The Subtraction of a and b is " + (a-b));
				System.out.println("");
				break;
			case 3 :
				System.out.println("You have chosen Multiplication !!!");
				System.out.println("The Multiplication of a and b is " + (a*b));
				System.out.println();
				break;
			case 4 :
				System.out.println("You have chosen Division !!!");
				if (b == 0) {
					System.out.println("Please enter b value except 0 !!!");
					b = s1.nextInt();
				}
				System.out.println("The Division of a and b is " + (a/b));
				System.out.println();
				break;
			case 5 : 
				System.out.println("You have chosen Modulus !!!");
				System.out.println("The Modulus of a and b is " + (a%b));
				System.out.println();
				break;
			case 6 :
			 	System.out.println("Exit !!!");
			 	System.out.println();
			 	break;
			default:
				System.out.println("Invalid Choice !!!");	
				System.out.println();
			}
		}while (ch != 6);
	}
}