import java.io.*;

class Writefile
{
    public static void main(String args[])
    {
        try
        {
            FileOutputStream fos=new FileOutputStream("write.txt");

            fos.write("hello my name is yash janjarukiya");
        }
        fos.close();

        catch(IOException e)
        {
            System.out.println(e);
        }
    }
}