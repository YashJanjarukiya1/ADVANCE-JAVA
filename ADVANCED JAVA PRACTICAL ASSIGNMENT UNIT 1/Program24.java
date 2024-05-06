//Write a java program that generates 10 random double numbers and store them in a file.
//Read the file and display the numbers, sum, avg, max and min
import java.io.*;
import java.util.*;

public class Program24 {
    public static void main(String[] args) {
        generateAndWriteToFile();
        readAndDisplayFromFile();
    }

    private static void generateAndWriteToFile() {
        try (PrintWriter writer = new PrintWriter(new FileWriter("File13.txt"))) {
            for (int i = 0; i < 10; i++) {
                double randomNumber = Math.random() * 100;
                writer.println(randomNumber);
            }
            System.out.println("Random numbers written to file successfully.");
        } 
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void readAndDisplayFromFile() {
        try (BufferedReader reader = new BufferedReader(new FileReader("File13.txt"))) {
            ArrayList<Double> numbers = new ArrayList<>();
            String line;

            while ((line = reader.readLine()) != null) {
                double number = Double.parseDouble(line);
                numbers.add(number);
            }

            System.out.println("Random numbers read from file:");
            for (double number : numbers) {
                System.out.println(number);
            }

            double sum = 0;
            double avg;
            double max = Collections.max(numbers);
            double min = Collections.min(numbers);

            for (double number : numbers) {
                sum += number;
            }

            avg = sum / numbers.size();

            System.out.println("\nSum: " + sum);
            System.out.println("Average: " + avg);
            System.out.println("Maximum: " + max);
            System.out.println("Minimum: " + min);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
