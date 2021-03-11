import java.util.Scanner;

class Eighteen{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String str1 = scan.next();
		System.out.println("Entered string is: " + str1);
		System.out.print("Enter another string: ");
		String str2 = scan.next();
		System.out.println("Entered string is: " + str1);
		System.out.println("Concatenated string is: " + str1.concat(str2));		
	}
}