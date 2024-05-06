import java.io.*;

public class Program1 {
	public static void main(String[] args) {
		File directory = new File("/Users/Parth/OneDrive/Desktop/PRACTICE");

		File[] files = directory.listFiles();

		for (File file : files) {
			System.out.println(file.getName());
		}
	}
}