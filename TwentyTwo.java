import java.util.Scanner;

class TwentyTwo {
	public static void main(String args[]){
		String str;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the string: ");
		str = input.next();
		System.out.println("Entered string is: " + str);
		System.out.println("String changed to upper-case: " + str.toUpperCase());
		System.out.println("String changed to lower-case: " + str.toLowerCase());
	}
}