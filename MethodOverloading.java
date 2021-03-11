class MethodOverloading{
	public static void main(String args[]){
		Overload b1 = new Overload();
		b1.box();
		b1.box(10,10,10);
		b1.box(12.2,3,4.6);
		double result = b1.box(5);
		System.out.println("Resulting volume is: " + result);
	}
}

class Overload{
	void box(){
		System.out.println("Without parameters!");
	}
	void box(int w, int h, int d){
		System.out.println("With parameters- w = " + w + " ,h = " + h + " ,d = " + d);
	}
	void box(double w, double h, double d){
		System.out.println("With parameters having decimal value - " + w + " " + h + " " + " " + d);
	}
	double box(double w){
		System.out.println("With parameters and returning the square of width");
		return (w*w);
	}
}