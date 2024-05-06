import java.io.*;

class Writedemo
{
    public static void main(String args[])
    {
        try
        {
            int c;
            FileOutputStream fos=new FileOutputStream("College.txt");

            while((c=fos.read())!=-1)
            {
              fos.Write("hello my name is yash janjarukiya");
            }

            fos.close();
        }
        
        catch(IOException e)
        {
            System.out.println(e);
        }
    }
}
