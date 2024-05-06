import java.io.*;

class yash1
{
	public static void main(String[] args)
	{
		try
		{
			int a;

			FileInputStream f1 = new FileInputStream("three.txt");

			while((a = f1.read()) != -1)
			{
				System.out.print(" " + (char)a);
			}
		}
		catch(IOException e)
		{
			System.out.println("error");
		}
	}
}