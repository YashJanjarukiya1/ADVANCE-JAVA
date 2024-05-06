import java.io.*;

public class Program18 {

    public static void main(String[] args) {
        //String inputFile = "File6.txt";
        //String outputFile = "File7.txt";
        String fileName = "File7.txt";

        try (OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(fileName))) {
            String dataToWrite = "Hello, OutputStreamWriter!";
            outputStreamWriter.write(dataToWrite);

            System.out.println("Data written to file successfully.");
        } 
        catch (IOException e) {
            e.printStackTrace();
        }

        try (InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(fileName))) {
            char[] buffer = new char[1024];
            int bytesRead;

            System.out.println("Reading data from file:");
            while ((bytesRead = inputStreamReader.read(buffer)) != -1) {
                System.out.print(new String(buffer, 0, bytesRead));
            }

            System.out.println("\nReading complete.");
        } 
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
