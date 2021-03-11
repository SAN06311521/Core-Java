import java.util.Scanner;

class Fabonacci {
	public static void main(String args[])	{
		System.out.print("Enter the number upto which you want to see the fabonacci series: ");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int a = 0;
		int b = 1;
		System.out.println("Fabonacci series is: " + a);
		int result = 0;
		for(int i = 2; i <= n; ++i) {
			result = a + b;
			a = b;
			b = result;
			System.out.println(result);
		}		
	}
} 