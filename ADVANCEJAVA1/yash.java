import java.util.*;

class yash
{
    public static void main(String args[])
    {
        Scanner ob=new Scanner(System.in);
        System.out.println("enter the any number:");

        int number=ob.nextInt();

        int tmp=0;
        int n=N;
        {
            int x=n%10;
            tmp=tmp*10+x;
            n=N/10;
        }

        if(tmp==n)
        {
            System.out.println("the number is palindrome:");
        }

        else
        {
            System.out.println("the number is not palindrome:");
        }
    }
}
