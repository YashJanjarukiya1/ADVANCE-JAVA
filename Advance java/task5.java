import java.io.*;

class task5
{
    public static void main(String args[])
    {
        System.out.println("type some characters:");

        try
        {
            int c;
            FileOutputStream fos=new FileOutputStream("Demo17.dat");
            InputStream IStream;
            IStream=System.in;

            while((c=IStream.read())!=-1)
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