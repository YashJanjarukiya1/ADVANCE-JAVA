import java.util.Scanner;
class Factorial
{
    public static void main(String args[])
    {

        int i,fact=1,num;
        Scanner ob=new Scanner(System.in);

        System.out.println("enter the factorial number:");
        int number=ob.nextInt();

        for(i=1;i<=number;i++)
        {
            fact=fact*i;
        }

        System.out.println("factorial of" +number+ "is:"+fact);

    }
}