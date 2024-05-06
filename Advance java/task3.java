import java.io.*;

class task3
{
    public static void main(String args[])
    {
        File myFile=new myFile("Demo20.dat");
        if(myFile.exists())
        {
            boolean flag=myFile.SetReadOnly();

            if(flag==true)
            {
                System.out.println("file is successfully converted into read only mode");
            }

            else
            {
                System.out.println("unsuccessfully");
            }

            File Name=new File ("Demo21.dat");

            if(myFile.RenameTo(newName))
            {
                System.out.println("renamesuccessfully");
            }

            else
            {
                System.out.println("ERROR");
            }
        }

        else
        {
            System.out.println("file is not available");
        }
    }
}
