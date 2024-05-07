import java.io.File;

class IOException
{
    public static void main(String args[])
    {
        File myFile=new File("myfile.txt");
        try
        {
            myFile.createNewFile();
        }
        catch (IOException e)
        {
            System.out.println("File is created");
            System.out.println(e);
        }
    }
}
