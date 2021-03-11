import java.io.*;

class FileDemo {
	public static void main(String ar[]) {
		File f1 = new File("D:/49_Sanya-Java/Hello.txt");
		System.out.println("Filename: " + f1.getName());
		System.out.println("File absolute path: " + f1.getAbsolutePath());
		System.out.println("File parent: " + f1.getParent());
		System.out.println("File exists? " + f1.exists());
		System.out.println("File writeable? " + f1.canWrite());
		System.out.println("File last modified: " + f1.lastModified());
		System.out.println("File size: " + f1.length());
	}
}