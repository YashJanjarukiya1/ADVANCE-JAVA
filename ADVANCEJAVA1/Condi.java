import java.util.Scanner;
class Condi
{
    public static void main(String args[])
    {
        Scanner ob=new Scanner(System.in);

        System.out.println("enter the first number:");
        int a=ob.nextInt();

        System.out.println("enter the second number:");
        int b=ob.nextInt();

        System.out.println((a>b ? true : false ));


    }
}