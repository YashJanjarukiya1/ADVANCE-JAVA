import java.io.*;

public class Program10 {
	public static void main(String[] args) throws IOException {
		byte[] bytes = {1, 2, 3, 4, 5};

		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		baos.write(bytes);

		byte[] byteArray = baos.toByteArray();

		System.out.println(byteArray);
	}
}