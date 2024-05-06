import java.io.*;

public class Program19 {
    public static void main(String[] args) {
        writeToFile("File8.txt", "Name: Parth\nAddress: Tejendra Vihar");

        String content = readFromFile("File8.txt");

        System.out.println("File Content:\n" + content);
    }
    
    private static void writeToFile(String fileName, String content) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(content);
            System.out.println("Content has been written to the file successfully.");
        } 
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String readFromFile(String fileName) {
        StringBuilder content = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
        } 
        catch (IOException e) {
            e.printStackTrace();
        }
        return content.toString();
    }
}
