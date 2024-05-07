public class Exc1
{
    public static void main(String args[])
    {
        try
        {
            int data=50+10;
            int data1=50-10;
        }
        catch (Arithmentic Exception e)
        {
            System.out.println(e);
        }
        System.out.println("rest of the code.............");
    }
}
