package Shapes;

//first class having first method
public class Circle {
	public void circleArea(double r) {
		double circleArea = 3.14 * r * r;
		System.out.println("Area of circle is : " + circleArea);
	}
}

//second class
public class Square {
	public void squareArea(int a) {
		int squareArea = a * a;
		System.out.println("Area of square is : " + squareArea);
	} 
}

//third class
public class Rectangle {
	public void rectArea(int l, int b) {
		int rectArea = l * b;
		System.out.println("Area of rectangle is : " + rectArea);
	}
}
