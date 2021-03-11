import java.util.Scanner;

class ThirtyFour {
	public static void main(String args[]) {
		AreaCircle ob = new AreaCircle();
		ob.CircleArea();
		System.out.println("");
		ob.CirclePerimeter();
	}
}

class AreaCircle {
	void CircleArea() {
		double a = 0;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the radius: ");
		double r = input.nextDouble();
		a = 3.14 * r * r;
		System.out.print("Area is " + a);
	}	
	void CirclePerimeter() {
		double p = 0;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the radius again to calculate perimeter: ");
		double r = input.nextDouble();
		p = 2 * 3.14 * r;
		System.out.print("Area is " + p);
	} 
}