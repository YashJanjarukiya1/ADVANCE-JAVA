import java.util.*;

class reverse
{
    public static void main(String args[])
    {
        Scanner ob=new Scanner(System.in);

        System.out.println("enter the number:");
        int no=ob.nextInt();

        int rem,rev=0;
        while(no!=0)
        {
            rem=no%10;
            rev=rev*10+rem;
            no=no/10;
        }
        System.out.println("the reverse number is:"+rev);
    }
}
