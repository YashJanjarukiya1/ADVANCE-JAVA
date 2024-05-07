import java.util.Scanner;
public class Yash4
{
    public static void main(String args[])
    {
    
        Scanner ob=new Scanner(System.in);

        System.out.println("enter the first value:");
        String name=ob.nextLine();

        System.out.println("enter the mobileno:");
        double mobileno=ob.nextDouble();

        System.out.println("enter the rollno:");
        int roll=ob.nextInt();

        System.out.println("enter the address:");
        String add=ob.nextLine();

        System.out.println("first value is:"+name);
        System.out.println("mobileno is:"+mobileno);
        System.out.println("rollno is:"+roll);
        System.out.println("address is:"+add);

    }
}