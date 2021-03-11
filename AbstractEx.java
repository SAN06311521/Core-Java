import java.util.*;

abstract class Shapes {
	public abstract void getArea();
	public abstract void getVolume();
}

class Dimensions extends Shapes {
	Scanner input = new Scanner(System.in);
	public void getArea() {
		double s, c, l, r;
		System.out.print("Enter the length for calculating the Area: ");
		l = input.nextDouble();
		s = 4*l;
		System.out.println("Area of square is: " + s);
		System.out.print("Enter the radius: ");
		r = input.nextDouble();
		c = 3.14*r*r;
		System.out.println("Area of Circle is: "+ c); 
	}

	public void getVolume() {
		double cube, sphere, radius, side;
		System.out.print("Enterthe side: ");
		side = input.nextDouble();
		cube = side*side*side;
		System.out.println("Volume of cube is " + cube);
		System.out.print("Enter the radius: ");
		radius = input.nextDouble();
		sphere = (4*3.14*radius*radius*radius)/3;
		System.out.println("Volume of sphere is: " + sphere);
	}
}

class AbstractEx {
	public static void main(String args[]) {
		Dimensions d = new Dimensions();
		d.getArea();
		d.getVolume();
	}
}