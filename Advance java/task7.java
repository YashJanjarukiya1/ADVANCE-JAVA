import java.io.*;

class task7
{
    public static void main(String args[])
    {
        File myFile= new File("Demo18.txt");

        try
        {
            DataOutputStream dos=new DataOutputStream(new FileOutputStream(myFile));
            dos.writeInt(3200);
            dos.writeFloat((float)25.3);
            dos.writeLong(9106236);

            System.out.println("file is created:");
            dos.close();


            System.out.println("......................................");
            DataInputStream dis=new DataInputStream(new FileInputStream(myFile));
            System.out.println(dis.readInt());
            System.out.println(dis.readFloat());
            System.out.println(dis.readLong());

            System.out.println("............................................");

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
