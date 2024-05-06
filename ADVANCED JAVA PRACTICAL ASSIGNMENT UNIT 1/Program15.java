import java.io.*;

class Person implements Serializable {
	private String name;
	private int age;

	public Person(String name,int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String toString() {
		return "Person{" + "name : " + name + " , " + "age : " + age + "}";
	}
}

public class Program15 {
	public static void main(String[] args) {
		String fileName = "File5.txt";

		Person pts = new Person("John Doe",25);

		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
			oos.writeObject(pts);
			System.out.println("Object written to file successfully.");
		}
		catch (Exception e) {
			e.printStackTrace();
		}

		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
			Object readObject = ois.readObject();

			if (readObject instanceof Person) {
				Person readPerson = (Person) readObject;
				System.out.println("Object read from file : " + readPerson);
			}
			else {
				System.out.println("Invalid object type in file.");
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}