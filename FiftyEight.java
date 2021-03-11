import java.io.FileNotFoundException;

public class FiftyEight {
	FiftyEight(String msg) {
		msg = "inside constructor";
		System.out.println(msg);
	}	
	
	public static void main(String args[]) {
		try {
			throw new FileNotFoundException();
		}
		catch (FileNotFoundException e){
			System.out.println("File not found Exception caught");
		}
		catch(Exception e) {
			System.out.println("Other exception: " + e);
		}
		finally {
			System.out.println("Inside the Finally block");
		}
	}
}