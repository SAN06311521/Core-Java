import java.util.Scanner;

class Gcd{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter two integers: ");
		int a = in.nextInt();
		int b = in.nextInt();
		System.out.println("The entered integer is: " + a + "," + b);
		int gcd = 1;
		for(int i = 1; i <= a && i <= b; i++){
			if(a % i == 0 && b % i == 0){
				gcd = i;
			}
		}
		System.out.println("Greatest common divisor of " + a + "," + b + " is: " + gcd);
	}
}