import java.io.*;

class Fileinput1
{
	public static void main(String args[])
	{
		try 
		{
			int c;

			FileInputStream fis=new FileInputStream("demo1.txt");
			FileoutputStream fos=new FileoutputStream("demo2.txt");

			while((c=fis.read())!=-1)
			{
				fos.write(c);
				System.out.println((char)c);
			}

			fos.close();
			fis.close();
		}

		catch(IOException e)
		{
			System.out.println(e);
		}
	}
}