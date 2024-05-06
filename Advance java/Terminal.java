import java.io.*;

class Terminal
{
    public static void main(String args[])
    {
        System.out.println("type some character............");

        try
        {
            int c;
            FileOutputStream fos=new FileOutputStream("Two.txt");
            
            InputStream Istream;
            Istream = System.in;

            while((c=Istream.read())!=-1)
            {
                fos.write(c);
            }
            fos.close();
        }

        catch(IOException e)
        {
            System.out.println(e);
        }
    }
}