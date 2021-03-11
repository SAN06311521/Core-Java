import java.util.*;

class ExceptDivide {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the integer: ");
		int a = input.nextInt();
		System.out.println("Enter another integer: ");
		int b = input.nextInt();
		int result;
		if(b == 0) {
			try {
				b = 0;
				result = a/b;
				System.out.println("This will not be printed..");
			}
			catch (ArithmeticException e) {
				System.out.println("Caught the error - devision by zero!");
			}
			System.out.println("After catch..");
		}
		else {
			result = a/b;
			System.out.println("Answer -" + result);
		}
	}
}