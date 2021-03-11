import java.util.Scanner;

class GCDFind {
	public static void main(String args[]) {
		System.out.println("Enter two numbers whose GCD is to be calculated: ");
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		System.out.println("GCD is: " + gcd(a,b));
	}

	static int gcd(int a, int b) {
		if(b == 0) {
			return a;
		}
		else {
			return gcd(b, a%b);
		}
	}
}