public class exception
{
    public static void main(String args[])
    {
        try
        {
            String s=null;
            System.out.println(s);
        }

        catch (Exception e)
        {
            System.out.println(e);
        }

        System.out.println("rest of the code:");
    }
}
