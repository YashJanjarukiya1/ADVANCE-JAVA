import java.util.Scanner;
class Finds
{
    public static void main(String args[])
    {
        Scanner ob=new Scanner(System.in);

        System.out.println("enter the first number:");
        int a=ob.nextInt();

        System.out.println("enter the second number:");
        int b=ob.nextInt();

        if(a>b)
        {
            System.out.println("multiplication"+(a*b));
        }
        else
        {
            System.out.println("division"+(a/b));
        }


    }
}

