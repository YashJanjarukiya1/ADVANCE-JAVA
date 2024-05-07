public class Exc2
{
    static void valieddate(int age)
    {
        if(age<18)
        {
            throw new ArithmeticException("not valied:");
        }
        else
        {
            System.out.println("welcome to votesector:");
        }
    }

    public static void main(String args[])
    {
        valieddate(23);
        System.out.println("rest of the code............");
    }
}
