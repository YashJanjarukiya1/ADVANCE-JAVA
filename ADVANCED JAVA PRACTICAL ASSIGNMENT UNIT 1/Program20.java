//A random access file contains int type data. Write a java program to read the first, 5th and 9th int values
import java.io.*;

public class Program20 {

    public static void main(String[] args) {
        String fileName = "File9.dat";

        writeDataToFile(fileName);

        readIntValues(fileName, 0);
        readIntValues(fileName, 4 * Integer.BYTES);
        readIntValues(fileName, 8 * Integer.BYTES);
    }

    private static void writeDataToFile(String fileName) {
        try (RandomAccessFile file = new RandomAccessFile(fileName, "rw")) {
            file.writeInt(10);
            file.writeInt(20);
            file.writeInt(30);
            file.writeInt(40);
            file.writeInt(50);
            file.writeInt(60);
            file.writeInt(70);
            file.writeInt(80);
            file.writeInt(90);
            file.writeInt(100);

            System.out.println("Integer data has been written to the file.");
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void readIntValues(String fileName, long position) {
        try (RandomAccessFile file = new RandomAccessFile(fileName, "r")) {
            file.seek(position);
            int value = file.readInt();
            System.out.println("Value at position " + position + ": " + value);
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
