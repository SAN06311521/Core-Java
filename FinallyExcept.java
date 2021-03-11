import java.util.*;

class finallyExcept {
	static void finallyMeth() throws ArithmeticException {
		System.out.println("Inside method");
		throw new ArithmeticException("finally practice");
	}
	public static void main(String args[]) {
		try {
			finallyMeth();
		}
		catch (ArithmeticException e) {
			System.out.println("caught the exception!" + e);
		}	
	}
}