import java.io.*;

class A
{
    public static void main(String args[])
    {
        File obj=new File("/home/ubuntu/Desktop/one.txt");
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
