import java.io.*;

class FileExcept {
	public static void main(String args[]) {
		int i = 0;
		try (FileOutputStream fout = new FileOutputStream("D:/49_Sanya-Java/Hello1.txt");
		FileInputStream fin = new FileInputStream("D:/49_Sanya-Java/Hello.txt")) {
			do {
			i = fin.read();
			if(i != -1) {
				fout.write(i);
				//System.out.println((char)i);
			}
		} while(i != -1);	
		} catch(FileNotFoundException e) {
			System.out.println("File not found");
		} catch (IOException e) {
			System.out.println("An IO error occured..");
		}
	}
}