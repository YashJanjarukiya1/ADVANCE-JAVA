import java.io.*;

class Datainput
{
	public static void main(String args[])
	{
		File f=new File("1.txt");

		try 
		{

			DataInOutPutStream dos=new DataInOutPutStream(new FileOutputStream(f));
			dos.WriteInt(1500);
			dos.WriteFloat((float)25.03);
			dos.WriteLong(9106236284);

			System.out.println("file created");
			dos.close();

			DataInputStream dis=new DataInputStream(new FileInputStream(f));
			System.out.println(dis.readInt());
			System.out.println(dis.readFloat());
			System.out.println(dis.readLong());

			dis.close();


		}

		catch(IOException e)
		{
			System.out.println(e)
		}
	}
}