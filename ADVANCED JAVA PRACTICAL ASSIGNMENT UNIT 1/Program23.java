//Write a java program which write and read class object to file.
import java.io.*;

class Person implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person [name : " + name + ", age : " + age + "]";
    }
}

public class Program23 {
    public static void main(String[] args) {
        String fileName = "File12.txt";

        writeObjectToFile(fileName);

        readObjectFromFile(fileName);
    }

    private static void writeObjectToFile(String fileName) {
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(fileName))) {
            Person person = new Person("Parth", 19);
            objectOutputStream.writeObject(person);

            System.out.println("Object has been written to the file successfully.");
        } 
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void readObjectFromFile(String fileName) {
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(fileName))) {
            Person person = (Person) objectInputStream.readObject();
            System.out.println("Read Object: " + person);
        } 
        catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
