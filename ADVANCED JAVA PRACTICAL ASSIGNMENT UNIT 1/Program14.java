import java.io.*;

public class Program14 {
	public static void main(String[] args) {
		String fileName1 = "File1.txt";
		String fileName2 = "File2.txt";

		try {
			readAndPrintFile(fileName1);

			readAndPrintFile(fileName2);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void readAndPrintFile(String fileName) throws IOException {
		System.out.println("Reading File : " + fileName);
		try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
			String line;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
			System.out.println("End of File : " + fileName);
			System.out.println();
		}
	}
}