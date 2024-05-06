import java.io.*;

class Ascii
{
    public static void main(String args[])
    {
        try 
        {
            FileOutputStream fos=new FileOutputStream("One.txt");

            for(int i=60;i<155;i++)
            {
                fos.write(i);
            }
            fos.close();

            System.out.println("file is created");
        }

        catch(IOException e)
        {
            System.out.println(e);
        }
    }
}
