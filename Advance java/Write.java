import java.io.*;

class Writedemo
{
    public static void main(String args[])
    {
        try
        {
            FileOutputStream fos=new FileOutputStream("College.txt");

            fos.write("hello my name is yash janjarukiya");
        }
        fos.close();

        catch(IOException e)
        {
            System.out.println(e);
        }
    }
}
