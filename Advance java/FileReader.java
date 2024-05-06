import java.io.*;

class FileReader
{
    public static void main(String args[])
    {
        try
        {
            FileInputStream f=new FileInputStream("/home/ubuntu/Desktop/Advance java/Some.txt");


            int c;
            while((c=f.read())!=-1);
            {
                System.out.println((char)c);
            }

            f.close();
        }

        catch(IOException e)
        {
            System.out.println(e);
        }
    }
}
