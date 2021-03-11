import java.util.Scanner;
import java.lang.Math;

public class Roots{
	public static void main(String[] args) {
		double a, b, c;
		double r1, r2, imaginary, d;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println(" Please Enter the Values of a, b, c of Quadratic Equation : ");
		a = scan.nextDouble();	
		b = scan.nextDouble();
		c = scan.nextDouble();
		
		d = (b * b) - (4 * a *c);
	  	
	  	if(d > 0)
	  	{
	  		r1 = (-b + Math.sqrt(d) / (2 * a));
	  		r2 = (-b - Math.sqrt(d) / (2 * a));
	  		System.out.println("\n Two Distinct Real Roots are: root-1 = " + r1 + " and root-2 = " + r2);
	  	}
	  	else if(d == 0)
	  	{
	  		r1 = r2 = -b / (2 * a);
	  		System.out.println("\n Two Equal and Real Roots are: root-1 = " + r1 + " and root-2 = " + r2);
	  	}
	  	else if(d < 0)
	  	{
	  		r1 = r2 = -b / (2 * a);
	  		imaginary = Math.sqrt(-d) / (2 * a);
	  		System.out.println("\n Two Distinct Complex Roots are: root-1 = " + r1 + " + " + imaginary + " and root-2 = " + r2 +" - " + imaginary);
	  	}		
	}
}