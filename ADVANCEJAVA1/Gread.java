import java.util.Scanner;
class Gread
{
    public static void main(String args[])
    { 
       Scanner ob=new Scanner(System.in);
       System.out.println("enter the percentage:");
       Float per=ob.nextFloat();

       if(per>=80)
       {
         System.out.println("your gread is A:");
       }

       else if(per>70)
       {
         System.out.println("your gread is B:");
       }

       else if(per>60)
       {
        System.out.println("your gread is C:");
       }

       else if(per<40)
       {
        System.out.println("your are fail");
       }

       else 
       {
        System.out.println("sorry invalied input:");
       }
     

    }
}
