import java.io.*;

class ReThrow {
	public static void main(String args[]) {
		int a;
		try {
			a = Integer.parseInt(args[0]);
			ReThrow ob = new ReThrow();
			int cat = ob.one();
			if(a > 50) {
				throw (new ArithmeticException("Number is greater than fifty!"));
			}
			System.out.println("number is less than fifty: " + a);
		}
		catch(ArithmeticException e) {
			System.out.println("Error caught!");
		}
		finally {
			System.out.println("After catch - in finally");
		}
	}
	
	int one() throws ArithmeticException {
		ReThrow ob1 = new ReThrow();
		int a = 6, b = 0;
		return ob1.two(a,b);
	} 
	
	int two(int a, int b) {
		return a/b;
	}
}