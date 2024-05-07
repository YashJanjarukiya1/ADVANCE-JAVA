import java.util.*;

class prime
{
    public static void main(String args[])
    {
        Scanner ob=new Scanner(System.in);
        System.out.println("enter the any number:");
        int number=ob.nextInt();

        void prime()
        {
            for(int i=1;i<100;i++)
            {
                for(int j=1;j<i;j++)
                {
                    if(i%j==0)
                    {
                        break;
                    }
                }
            }
            if(i==j)
            {
                System.out.println("the number is prime:"+i);
            }
        }
    }
}