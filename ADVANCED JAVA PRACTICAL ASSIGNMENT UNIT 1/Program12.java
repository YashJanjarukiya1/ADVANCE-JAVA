import java.io.*;

public class Program12 {
	public static void main(String[] args) {
		String outputFile = "File3.txt";

		byte[] byteArray = "Hello, BufferedOutfutStream".getBytes();

		try (BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(outputFile))) {
			bos.write(byteArray);

			System.out.println("Byte array successfully written to BufferedOutfutStream.");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}