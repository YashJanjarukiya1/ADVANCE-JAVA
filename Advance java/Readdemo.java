import java.io.*;

class Readdemo
{
    public static void main(String args[])
    {
        try 
        {
            int c;
            FileInputStream fis=new FileInputStream("Gls.txt");

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
