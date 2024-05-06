import java.io.*;

public class Program13 {
	public static void main(String[] args) {
		String fileName = "File4.txt";

		int intValue = 42;
		double doubleValue = 3.14;
		boolean booleanValue = true;
		String stringValue = "Hell0, DataInputStream / DataOutputStream !";

		try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(fileName))) {
			dos.writeInt(intValue);
			dos.writeDouble(doubleValue);
			dos.writeBoolean(booleanValue);
			dos.writeUTF(stringValue);

			System.out.println("Data written to file successfully.");
		}
		catch (Exception e) {
			e.printStackTrace();
		}

		try (DataInputStream dis = new DataInputStream(new FileInputStream(fileName))) {
			int readIntValue = dis.readInt();
			double readDoubleValue = dis.readDouble();
			boolean readBooleanValue = dis.readBoolean();
			String readStringValue = dis.readUTF();

			System.out.println("Read values from file.");
			System.out.println("Int Value : " + readIntValue);
			System.out.println("Double Value : " + readDoubleValue);
			System.out.println("Boolean Value : " + readBooleanValue);
			System.out.println("String Value : " + readStringValue);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}