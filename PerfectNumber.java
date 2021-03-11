import java.util.Scanner;

class PerfectNumber{
	public static void main(String args[]){
		int sum = 0;
		System.out.println("Enter a number: ");
		Scanner scan = new Scanner(System.in);	
		int number = scan.nextInt();
		for(int i = 1; i < number; i++) {
			if(number % i == 0){
				sum += i;
			}
		}	
		if(sum == number){
			System.out.println(number + " is a perfect number.");
		}else{
			System.out.println(number + " is NOT a perfect number.");
		}
	}
}

// the number whose divisor's sum results in the number itself. like 1 + 2 + 3 = 6, so, 6 is a perfect number.