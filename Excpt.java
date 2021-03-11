class Excpt{
	public static void main (String ar[]) {
		int a , b;
		try {
			//b = 0;
			//a = 20/b;
			int c[] = {1,2,3};
			c[4] = 10;
			System.out.println("This statement does not execute");
		}
		catch(ArithmeticException e) {
			System.out.println("Divide by zero..");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Index out of Range!");
			System.out.println("Exception: " + e);
		}
		System.out.println("After the catch statement..");
	}
}