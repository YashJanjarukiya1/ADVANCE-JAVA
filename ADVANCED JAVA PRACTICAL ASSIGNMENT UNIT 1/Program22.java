//Write a java program which write and read java data type in file.
import java.io.*;

public class Program22 {
    public static void main(String[] args) {
        String fileName = "File11.txt";

        writeDataToFile(fileName);

        readDataFromFile(fileName);
    }

    private static void writeDataToFile(String fileName) {
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(fileName))) {
            objectOutputStream.writeInt(123);
            objectOutputStream.writeDouble(45.67);
            objectOutputStream.writeUTF("Hello, File IO!");
            objectOutputStream.writeBoolean(true);
            objectOutputStream.writeObject(new int[]{1, 2, 3, 4, 5});

            System.out.println("Data has been written to the file successfully.");
        } 
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void readDataFromFile(String fileName) {
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(fileName))) {
            int intValue = objectInputStream.readInt();
            double doubleValue = objectInputStream.readDouble();
            String stringValue = objectInputStream.readUTF();
            boolean booleanValue = objectInputStream.readBoolean();
            int[] arrayValue = (int[]) objectInputStream.readObject();

            System.out.println("Read Data:");
            System.out.println("Integer: " + intValue);
            System.out.println("Double: " + doubleValue);
            System.out.println("String: " + stringValue);
            System.out.println("Boolean: " + booleanValue);
            System.out.print("Array: ");
            for (int num : arrayValue) {
                System.out.print(num + " ");
            }
        } 
        catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
