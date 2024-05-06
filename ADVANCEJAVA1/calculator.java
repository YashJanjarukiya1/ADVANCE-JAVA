import java.util.*;

class calculator
{
    public static void main(String args[])
    {
        double num1,num2;

        Scanner ob=new Scanner(System.in);

        System.out.println("enter the numbers:");
        num1=ob.nextDouble();

        System.out.println("enter the numbers:");
        num2=ob.nextDouble();

        System.out.println("enter the operation to perfome the operation(+,-,*,/):");

        char op=ob.next().charAt(0);
        double o=0;

        switch(op)
        {
            case '+':
                o=num1+num2;
                break;

            case '-':
                o=num1-num2;
                break;

            case '*':
                o=num1*num2;
                break;

            case '/':
                o=num1/num2;
                break; 

            default:
                System.out.println("sorry wrong input:");               
        }
        System.out.println("the final result is:");
        System.out.println();

        System.out.println(num1 +" "+  op +" "+  num2+" "+ o);
                           
    }


}