import java.io.*;

public class Program17 {
	public static void main(String[] args) {
		char[] charArray = "Hello, CharArrayReaderWriter !".toCharArray();

		try (CharArrayReader car = new CharArrayReader(charArray)) {
			int data;
			while ((data = car.read()) != -1) {
				System.out.print((char) data);
			}
			System.out.println();
			System.out.println("CharArrayReader reading complete.");
		}
		catch (Exception e) {
			e.printStackTrace();
		}

		try (CharArrayWriter caw = new CharArrayWriter()) {
			caw.write(charArray);

			char[] transferredCharArray = caw.toCharArray();

			System.out.println("Transferred CharArrayWriter content:");
			System.out.println(new String(transferredCharArray));
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}