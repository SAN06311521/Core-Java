import java.util.Scanner;

public class ThirtyOne{

    public static void main(String[] args) {

        int num, reversedNo = 0, r, originalNo;
	Scanner input = new Scanner(System.in);
	System.out.print("Enter a 5 digit number: ");
	num = input.nextInt();
        originalNo = num;

        // reversed number is stored in variable 
        while( num != 0 )
        {
            r = num % 10;
            reversedNo = reversedNo * 10 + r;
            num  /= 10;
        }

        // if they are equal
        if (originalNo == reversedNo) {
            System.out.println(originalNo + " is a palindrome.");	
	}
        else {
		System.out.println(originalNo + " is not a palindrome.");
		System.out.println("Enter a new number: ");
		num = input.nextInt();	
		while( num != 0 ) {
            		r = num % 10;
            		reversedNo = reversedNo * 10 + r;
            		num  /= 10;
        	}
		if (originalNo == reversedNo) {
            		System.out.println(originalNo + " is a palindrome.");
		}
	}
		
		
		
    }
}