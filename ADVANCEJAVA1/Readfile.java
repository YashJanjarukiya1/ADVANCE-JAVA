import java.io.*;

class Readfile
{
    public static void main(String args[])
    {
        try 
        {
            int c;
            FileInputStream fis=new FileInputStream("read.txt");

            while((c=fis.read())!=-1)
            {
                System.out.println((char)c);
            }

            fis.close();

        }
        catch(IOException e)
        {
            System.out.println(e);
        }
    }
}