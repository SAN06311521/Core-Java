abstract class Figure {
	int n1;
	int n2;
	Figure(int a, int b) {
		n1 = a;
		n2 = b;
	}
	abstract int  perimeter();
}

class Rectangle extends Figure {
	Rectangle(int a,int b) {
		super(a,b);
	}
	int perimeter() {
		System.out.println("Rectangle's perimeter: ");
		return (2*(n1 + n2));
	}
}

class Square extends Figure {
	Square(int a, int b){
		super(a,b);
	}
	int perimeter() {
		System.out.println("Square's perimeter: ");
		return (4*n1);
	}
}

class AbstractClass {
	public static void main(String args[]) {
		Rectangle r = new Rectangle(3,6);
		Square s = new Square(4,4);
		Figure ref;
		ref = r;
		System.out.println(ref.perimeter());
		ref = s;
		System.out.println(ref.perimeter());
	}
}