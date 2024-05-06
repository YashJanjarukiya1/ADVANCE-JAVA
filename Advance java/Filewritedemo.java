import java.io.*;

class Filewritedemo
{
    public static void main(String args[])
    {
        try
        {
            FileOutputStream fos = new FileOutputStream("Demo.txt");

            for(int i=60;i<155;i++)
            {
                fos.write(i);
            }
            fos.close();

            System.out.print("file is created");
        }

        catch(IOException e)
        {
            System.out.println(e);
        }
    }
}