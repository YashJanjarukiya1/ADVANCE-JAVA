import java.io.*;

public class Program2 {
	public static void main(String[] args) {
		File file = new File("/Users/Parth/OneDrive/Desktop/PRACTICE/Program1.java");

		boolean exists = file.exists();

		if (exists) {
			System.out.println("The file exists");
		}
		else {
			System.out.println("The file does not exists");
		}
	}
}