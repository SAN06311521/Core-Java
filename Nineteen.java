import java.util.Scanner;

class Nineteen{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String str1 = scan.next();
		System.out.println("Entered string is: " + str1);
		System.out.println("The length of entered string is: " + str1.length());		
	}
}