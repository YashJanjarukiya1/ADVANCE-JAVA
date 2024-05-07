import java.util.Scanner;
class Logical
{
    public static void main(String args[])
    {
        Scanner ob=new Scanner(System.in);

        System.out.println("enter the age:");
        int age=ob.nextInt();

        System.out.println("enter the width:");
        int wi=ob.nextInt();

        if(age == 18 && age>=18)
        {
            if(wi==50 || wi>50)
            {
                System.out.println("your are eligable for voting:");
            
            }
            else
            {
                System.out.println("your are not eligable for voting:");
            }

        }
        else
        {
            System.out.println("above 18 years:");
        }
    }
}
