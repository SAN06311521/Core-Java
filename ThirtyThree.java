import java.util.Scanner;

class ThirtyThree {
	public static void main(String args[]) {
		AreaCircle ob = new AreaCircle();
		ob.CircleArea();
	}
}

class AreaCircle {
	void CircleArea() {
		double a = 0;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the radius: ");
		double r = input.nextDouble();
		a =  3.14 * r * r;
		System.out.print("Area is " + a);
	}
}