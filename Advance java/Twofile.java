import java.io.*;

class Twofile
{
    public static void main(String args[])
    {
        try 
        {
            int c;
            FileInputStream fis1=new FileInputStream("Gls1.txt");
            FileInputStream fis2=new FileInputStream("Gls2.txt");


            FileOutputStream fos=new FileOutputStream("Gls3.txt");

            while((c=fis1.read())!=-1)
            {
                fos.write(c);
            }

            while((c=fis2.read())!=-1)
            {
                fos.write(c);
            }

            fis1.close();
            fis2.close();
            fos.close();

            System.out.println("file is created");
        }

        catch(IOException e)
        {
            System.out.println(e);
        }

    }
}