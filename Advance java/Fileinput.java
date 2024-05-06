import java.io.*;

class Fileinput
{
	public static void main(String args[])
	{
		try 
		{
			int c;

			FileInputStream fis=new FileInputStream("yash.txt");

			while((c=fis.read())!=-1)
			{
				System.out.println((char)c);

			} 
		}

		catch(IOException e)
		{
			System.out.println(e);
		}
	}
}