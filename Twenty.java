import java.util.Scanner;

class Twenty{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the string: ");
		String original = scan.next();
		String reverse = "";
		for(int i = (original.length()-1); i >= 0; i--){
			reverse = reverse + original.charAt(i);
		}
		System.out.println("Reverse string is: " + reverse);
	}
}