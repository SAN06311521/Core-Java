import java.util.Scanner;

class ThirtyTwo {
	public static void main(String args[]){
		int n1, n2, n3;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter three non-zero numbers: ");
		n1 = input.nextInt();
		n2 = input.nextInt();
		n3 = input.nextInt();
		int product = 0, sum = 0, avg = 0;
			int a=0;
     			int b=0;
     			if (n1 > n2 && n1 > n3)
     				a=n1;
     			if (n2 > n1 && n2 > n3)
     				a = n2;
     			if (n3 > n1 && n3 > n2)
     				a = n3;
    			if (n1 < n2 && n1 < n3)
     				b = n1;
     			if (n2 < n1 && n2 < n3)
     				b = n2;
     			if (n3 < n1 && n3 < n2)
     				b = n3;
     			System.out.println("The greatest number = "+ a);
     			System.out.println("The smallest number = "+ b);
		sum = n1 + n2 + n3;
     		System.out.println("The sum is "+ sum);
		product = n1 * n2 * n3;
     		System.out.println("The product is "+ product);
		avg = (n1 + n2 + n3)/3;
     		System.out.println("The average is "+ avg);		
	}
}