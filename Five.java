import java.util.Scanner;

class Five{
	public static void main(String args[]){
		int a,b,c,d,e;
		System.out.println("Enter 5 integers: ");
		Scanner in = new Scanner(System.in);
		a = in.nextInt();
		b = in.nextInt();
		c = in.nextInt();
		d = in.nextInt();
		e = in.nextInt();
		int sum = a + b + c + d + e;
		int avg = sum/5;
		System.out.println("Average of entered number is: " + avg);
	}
}