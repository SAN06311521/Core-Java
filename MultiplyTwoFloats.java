import java.util.Scanner;

class MultiplyTwoFloats{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter two floating point numbers: ");
		float a = in.nextFloat();
		float b = in.nextFloat();
		System.out.println("The entered floating point numbers are: " + a + "," + b);
		float product = a * b;
		System.out.println("The product is: " + product);
	}
}