import java.io.*;

class task4
{
    public static void main(String args[])
    {
        File myFile=new myFile("Demo15.dat");
        if(myFile.exists())
        {
            boolean flag=myFile.SetReadOnly();

            if(flag==true)
            {
                System.out.println("file is successfully convered into read only mode:");
            }

            else
            {
                System.out.println("file is not convered:");
            }
        }

        File myFile=new myFile("Demo16.dat");
        if(myFile.RenameTo(newName))
        {
            System.out.println("rename successfully:");
        }


        else
        {
            System.out.println("ERROR");
        }

    }

}