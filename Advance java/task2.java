import java.io.*;

class task2
{
    public static void main(String args[])
    {
        System.out.println("type some character");

        try
        {
            int c;
            FileOutputStream fos=new FileOutputStream("Demo11.txt");
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
            System.out.println("ERROR");
        }
    }
}