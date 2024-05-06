import java.io.*;

public class Program8 {
	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\Parth\\OneDrive\\Desktop\\PRACTICE\\file1.txt");

		FileInputStream fis = new FileInputStream(file);

		FileOutputStream fos = new FileOutputStream("C:\\Users\\Parth\\OneDrive\\Desktop\\PRACTICE\\file2.txt");

		int b;
		while ((b = fis.read()) != -1) {
			fos.write(b);
		}

		fis.close();
		fos.close();

		System.out.println("File copied successfully");
	}
}