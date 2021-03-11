import java.io.*;

class ExceptIO {
	public static void main(String args[]) {
		try {
			FileInputStream input = null;
			input = new FileInputStream("file.txt");
			int n;
			while(( n = input.read()) != -1) {
				System.out.println((char)n);
			}
			input.close();
		}
		catch(IOException e) {
			System.out.println("IO Exception occured, that is, " + e);
		}			
	}
}