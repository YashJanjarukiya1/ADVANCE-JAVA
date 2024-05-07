import java.util.Scanner;
public class Yash3
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the name:");
        String name=sc.nextLine();

        System.out.println("enter rollno:");
        int roll=sc.nextInt();

        System.out.println("enter the marks:");
        int marks=sc.nextInt();

        System.out.println("enter the parsentage:");
        Float per=sc.nextFloat();

        System.out.println("name is:"+name);
        System.out.println("roll is:"+roll);
        System.out.println("marks is:"+marks);
        System.out.println("per is:"+per);

    }
}
