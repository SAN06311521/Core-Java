import java.util.Scanner;

class TrailingZero {
	public static void main(String args[]) {
		System.out.print("Enter the number for calculating the factorial: ");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int factorial = 1;
		for(int i = 1; i <= n; i++){
			factorial *= i;
 		}
		System.out.println("Factorial of number " + n + " is " + factorial);
		int result = 0;
		for(int j = 5; j <= n; j = j*5) {
			result += n/j;
		}
		System.out.print("Number of trailing zeroes in " + n + " is " + result);
	}
}