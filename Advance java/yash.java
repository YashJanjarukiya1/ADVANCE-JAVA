import java.io.File;

class yash
{
    public static void main(String args[])
    {
        File obj=new File("two.txt");
        System.out.println("file is created");

        if(obj.exists())
        {
            System.out.println("file is available");
        }

        else
        {
            System.out.println("file is not available");
        }

    }
}