import java.util.Scanner;

class PrintPattern4 {
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
		int no = 1;
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n-i; j++) {
				System.out.print("  ");
			}
			for(int k = 1; k <= i; k++) {
				System.out.print(no + "  ");
				no++;
			}
			System.out.println();
		}
	}
} 