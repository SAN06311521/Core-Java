import java.util.Scanner;
import java.lang.Math;

class SeventyNine {
	static double power(int n, int p) {
		return Math.pow(n,p);
	}
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n = input.nextInt();
		System.out.print("Enter the power: ");
		int p = input.nextInt();
		System.out.println("The answer of " + n + " raised to te power " + p + " is " + power(n,p));
	}
}