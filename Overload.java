class A {
	int i, j;
	A(int a, int b) {
		i = a;
		j = b;
	}
	void display() {
		System.out.println("i and j is " + i + " " + j);
	}
}

class B extends A {
	int k;
	B(int a, int b, int c) {
		super(a,b);
		k = c;
	}
	void display(String msg) {
		System.out.println(msg + k);
	}
}

class Overload {
	public static void main(String args[]) {
		B subOB = new B(1,2,3);
		subOB.display("This is k: ");
		subOB.display();
	}
}