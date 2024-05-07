import java.util.Scanner;
class Table
{
    public static void main(String args[])
    {
        int i=1,num;

        Scanner ob=new Scanner(System.in);

        System.out.println("enter the number of table:");
        int number=ob.nextInt();

        do
        {
            System.out.println(number + "*" + i + "=" + (number*i));
            i++;
        }
        while(i<11);
        
    }
}

