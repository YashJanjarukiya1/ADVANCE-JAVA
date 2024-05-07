public class Exception3
{
    static void validate(int age)
    {
        if(age<18)
        throw new ArithmeticException ("not valied:");

        else
        System.out.println("welcome vote:");
    }

    public static void main(String args[])
    {
        validate(12);
        System.out.println("rest of the code:");
    }
}
