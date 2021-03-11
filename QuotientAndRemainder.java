import java.util.Scanner;

class QuotientAndRemainder{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter two integers: ");
		int a = in.nextInt();
		int b = in.nextInt();
		System.out.println("The entered integer is: " + a + "," + b);
		int quotient = a / b;
		int remainder = a % b;
		System.out.println("The quotient is: " + quotient);
		System.out.println("The remainder is: " + remainder);
	}
}