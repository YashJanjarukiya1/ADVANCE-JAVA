import java.io.*;

public class Program9 {
	public static void main(String[] args) throws IOException {
		byte[] bytes = {1, 2, 3, 4, 5};
		ByteArrayInputStream bais = new ByteArrayInputStream(bytes);

		int read;
		while ((read = bais.read()) != -1) {
			System.out.println((byte) read);
		}
		bais.close();
	}
} 