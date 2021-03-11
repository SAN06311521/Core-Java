import java.util.Scanner;

class PrintPattern2 {
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
		for(int i = 1; i <= n; i++) {
			for(int j = i; j <= n; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
} 