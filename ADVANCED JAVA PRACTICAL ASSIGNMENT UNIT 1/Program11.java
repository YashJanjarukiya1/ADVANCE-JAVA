import java.io.*;

public class Program11 {
	public static void main(String[] args) {
		String fileName = "file2.txt";

		try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(fileName))) {
			boolean markSupported = bis.markSupported();

			System.out.println("Mark Supported : " + markSupported);

			int availableBytes = bis.available();
			System.out.println("Number of Available Bytes : " + availableBytes);

			int data;
			while ((data = bis.read()) != -1) {
				System.out.println((char) data);
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}