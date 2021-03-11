import java.util.Scanner;

class PrintAnInteger{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the integer: ");
		int a = in.nextInt();
		System.out.println("The entered integer is: " + a);
	}
}