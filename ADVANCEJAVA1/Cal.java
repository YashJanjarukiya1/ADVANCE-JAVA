import java.util.Scanner;
class Cal
{
    public static void main(String args[])
    {
        Scanner ob=new Scanner(System.in);

        System.out.println("enter the first number:");
        int num1=ob.nextInt();

        System.out.println("enter the second number:");
        int num2=ob.nextInt();

        System.out.println("enter the operator which you want to perfome (+,-,/,*,%): ");
        String operation=ob.nexString();

        int result=performoperation(num1,num2,operation);

        System.out.println("the answer is:"+result);

        public static void int performoperation(int num1,int num2, String operation);
        {

        int  result=0;
        switch(operation)
        {
            case "+":
                result=num1+num2;
                break;

            case "-":
                result=num1-num2;
                break;
    
            case "*":
                result=num1*num2;
                break;

            case "+":
                result=num1/num2;
                break;

            case "%":
                result=num1%num2;
                break;

    
            default:
                System.out.println("sorry invalied input:");
                break;

        }
        return result;
        }

    }
}

