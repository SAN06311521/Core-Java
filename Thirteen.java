import java.util.Scanner;

class Thirteen{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		int a = in.nextInt();
		int b = in.nextInt();
		int max;
		if(a > b){
			System.out.println(a + " is greater than " + b);
		}else{
			System.out.println(a + " is smaller than " + b);
		}
		if(a % 2 == 0 && b % 2 == 0){
			System.out.println("Both are even!");	
		}else{
			System.out.println("Both are NOT even!");
		}
		if(a >= b){
			max = a;
		}else{
			max = b;
		}
		int count = 0;
		for(int i = 2; i <= max; i++){
			if(a % i == 0 && b % i == 0){
				count++;
			}
		}
		if(count == 0){
			System.out.println("Both are relatively prime.");
		}else{
			System.out.println("They aren't relatively prime.");
		}
	}
}
	