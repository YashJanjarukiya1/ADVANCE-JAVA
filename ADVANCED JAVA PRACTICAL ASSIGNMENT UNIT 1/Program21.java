//Write a java program that generates 10 random integer numbers and store them in a file.
//It should also display last number by accessing it directly
import java.io.*;
import java.util.*;

public class Program21 {
    public static void main(String[] args) {
        String fileName = "File10.txt";

        generateAndStoreRandomNumbers(fileName, 10);

        displayLastNumber(fileName);
    }

    private static void generateAndStoreRandomNumbers(String fileName, int count) {
        try (FileWriter writer = new FileWriter(fileName)) {
            Random random = new Random();

            for (int i = 0; i < count; i++) {
                int randomNumber = random.nextInt();
                writer.write(Integer.toString(randomNumber) + "\n");
                System.out.println(randomNumber);
            }

            System.out.println("Random numbers have been generated and stored in the file.");
        } 
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void displayLastNumber(String fileName) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            String lastNumber = null;

            while ((line = reader.readLine()) != null) {
                lastNumber = line;
            }

            if (lastNumber != null) {
                System.out.println("Last number in the file: " + lastNumber);
            } 
            else {
                System.out.println("File is empty.");
            }
        } 
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
