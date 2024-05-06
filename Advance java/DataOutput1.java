import java.io.*;

class DataOutput1
{
    public static void main(String args[])
    {
        File myFile= new File("Demo50.txt");

        try
        {
            DataOutputStream dos=new DataOutputStream(new FileOutputStream(myFile));
            dos.writeInt(5000);
            dos.writeFloat((float)63.50);
            dos.writeLong(9106236);

            System.out.println("file is created:");

            dos.close();

            System.out.println("...............................");

            DataInputStream dis=new DataInputStream(new FileInputStream(myFile));
            System.out.println(dis.readInt());
            System.out.println(dis.readFloat());
            System.out.println(dis.readLong());

            dis.close();

        }

        catch(FileNotFoundException e)
        {
            System.out.println(e);
        }

        catch(IOException e)
        {
            System.out.println(e);
        }
    }
}