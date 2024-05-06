import java.io.*;

public class Program3 {
	public static void main(String[] args) {
		File file = new File("/Users/Parth/OneDrive/Desktop/PRACTICE/Program2.java");

		if (file.canRead() && !file.canWrite()) {
			System.out.println("The file is read-only");
		}
		else {
			System.out.println("The file is not read-only");
		}
	}
}