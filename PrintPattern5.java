import java.util.Scanner;

class PrintPattern5 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n = input.nextInt();
		Print ob = new Print();
		ob.pattern(n);
	}
}

class Print {
	void pattern(int n) {
			System.out.println("*");
			for(int i = 2; i <= n-1; i++) {
				System.out.print("* ");
				for(int j = 1; j <= i-2; j++) {
					System.out.println("  ");
				}
				System.out.print("* ");
				System.out.println();
			}
		for(int i = 1; i <= n; i++) {
			System.out.print("* ");
		}
	}
} 