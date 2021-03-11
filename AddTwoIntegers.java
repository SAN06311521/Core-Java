import java.util.Scanner;

class AddTwoIntegers{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter two integers: ");
		int a = in.nextInt();
		int b = in.nextInt();
		System.out.println("The entered integer is: " + a + "," + b);
		int sum = a + b;
		System.out.println("The sum of the entered integers is: " + sum);
	}
}