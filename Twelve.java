import java.util.Scanner;

class Twelve{
	public static void main(String args[]){
		int i;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the product number: ");
		i = in.nextInt();
		System.out.println("Enter the quantity: ");
		int q;
		q = in.nextInt();
		double result;
		switch(i) {
			case 1:
				result = 99.90*q;
				System.out.println("Total amount for " + q + " quantity of product number 1 is: " + result);
				break;
			case 2:
				result = 20.20*q;
				System.out.println("Total amount for " + q + " quantity of product number 2 is: " + result);
				break;
			case 3:
				result = 6.87*q;
				System.out.println("Total amount for " + q + " quantity of product number 3 is: " + result);
				break;
			case 4:
				result = 45.50*q;
				System.out.println("Total amount for " + q + " quantity of product number 4 is: " + result);
				break;
			case 5:
				result = 40.49*q;
				System.out.println("Total amount for " + q + " quantity of product number 5 is: " + result);
				break;
			default:
				System.out.println("Invalid product number! Please try again :)");
		}
	}
}