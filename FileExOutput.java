import java.io.*;

class FileExOutput {
	public static void main(String args[]) throws IOException {
		int i;
		FileOutputStream fout = new FileOutputStream("D:/49_Sanya-Java/Hello1.txt");
		
		FileInputStream fin = new FileInputStream("D:/49_Sanya-Java/Hello.txt");
		do {
			i = fin.read();
			if(i != -1) {
				fout.write(i);
				//System.out.println((char)i);
			}
		} while(i != -1);
		fin.close();
		fout.close();
	}
}