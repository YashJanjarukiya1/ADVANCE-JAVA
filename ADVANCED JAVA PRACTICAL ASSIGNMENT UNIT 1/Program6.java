import java.io.*;

public class Program6 {
	public static void main(String[] args) {
		File file = new File("/Users/Parth/OneDrive/Desktop/PRACTICE/Program1.class");

		if (file.exists()) {
			boolean deleteFile = file.delete();

			if (deleteFile) {
			System.out.println("The file is deleted");
			}
			else {
				System.out.println("The file is not deleted");
			}
		}		
		else {
			System.out.println("The file does not exists");
		}
	}
}