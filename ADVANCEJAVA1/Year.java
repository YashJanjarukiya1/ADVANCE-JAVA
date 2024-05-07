import java.util.Scanner;
class Year
{
    public static void main(String args[])
    {
        Scanner ob=new Scanner(System.in);

        System.out.println("enter the year:");
        int year=ob.nextInt();

        Boolean leapyear;

        leapyear=(year%4==0);

        leapyear=leapyear && (year % 100!=0 || year % 400==0);

        if(leapyear)
        {
            System.out.println("this is a leapyear:"+year);
        }
        else
        {
            System.out.println("this is not a leapyear:"+year);
        }
    }
}
