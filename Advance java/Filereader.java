import java.io.*;

class FileReader
{
    public static void main(String args[])
    {
        FileReader f=new FileReader("/home//ubuntu//Desktop//Advance java//Some.txt");

        try
        {
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
