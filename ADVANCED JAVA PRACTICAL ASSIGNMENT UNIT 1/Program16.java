import java.io.*;

public class Program16 {
	public static void main(String[] args) {
		String fileName = "File6.txt";

		try (RandomAccessFile ras = new RandomAccessFile(fileName,"rw")) {
			ras.writeBytes("Hello, RandomAccessFile !");

			System.out.println("Data written to file successfully.");

			ras.seek(0);

			byte[] buffer = new byte[(int) ras.length()];
			ras.read(buffer);

			System.out.println("Data read from file : " + new String(buffer));
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}