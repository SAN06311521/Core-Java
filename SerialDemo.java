import java.io.*;

public class SerialDemo {
	public static void main(String arg[]) {
		try (FileOutputStream fout = new FileOutputStream("D:/49_Sanya-Java/Hello.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fout)) {
				Emp e = new Emp();
				e.name = "Suzan";
				e.address = "12, Cross Street, New York";
				e.ssn = 123;
				e.number = 1001;
				oos.writeObject(e);
				System.out.println("Serialized  data is saved!");
		}
		catch (IOException e1) {
			System.out.println("Exception during serialization: " + e1);
		}
		try (FileInputStream fin = new FileInputStream("D:/49_Sanya-Java/Hello.txt");
			ObjectInputStream ois = new ObjectInputStream(fin)) {
				Emp ee = (Emp)ois.readObject();
				System.out.println(ee.name);
				System.out.println(ee.address);
				System.out.println(ee.ssn);
				System.out.println(ee.number);
		}
		catch (Exception e1) {
			System.out.println("exception in deserialization: " + e1);
		}
	}
}


class Emp implements java.io.Serializable {
	String name;
	String address;
	transient int ssn;
	int number;
}