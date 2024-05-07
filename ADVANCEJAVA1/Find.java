import java.util.Scanner;
class Find
{
    public static void main(String args[])
    {
        Scanner ob=new Scanner(System.in);

        System.out.println("enter the first number:");
        int a=ob.nextInt();

        System.out.println("enter the second number:");
        int b=ob.nextInt();

        System.out.println("enter the third number:");
        int c=ob.nextInt();

        if(a>b && a>c)
        {
            System.out.println("a is greater:");
        }
        else if(b>a && b>c)
        {
            System.out.println("b is greater:");
        }
        else if(c>a && c>b)
        {
            System.out.println("c is greater:");
        }
        else
        {
            System.out.println("sorry invalied input:");
        }


    }
}
