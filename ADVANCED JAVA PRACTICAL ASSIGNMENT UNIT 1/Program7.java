import java.io.*;

public class Program7 {
	public static void main(String[] args) {
		File fileToHide = new File("/Users/Parth/OneDrive/Desktop/PRACTICE/Program2.class");

		boolean hidden = fileToHide.isHidden();

		if (hidden) {
			System.out.println("File is hidden");
		}
		else {
			System.out.println("File is not hidden");
		}
	}
} 