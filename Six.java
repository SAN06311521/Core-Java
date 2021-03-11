import java.util.Scanner;

class Six {
	public static void main(String args[]){
		System.out.println("Enter 2 integres: ");
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		if(a % b == 0){
			System.out.println(a + " is the multiple of " + b);
		}else if (b % a == 0){
			System.out.println(b + " is multiple of " + a);
		}else{
		    System.out.println("they aren't multiple of each other");
		}
	}
}