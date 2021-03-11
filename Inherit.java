class A {
	int i , j;
	void showij() {
		System.out.println("i = " + i + " " + " j = " + j);
	}
}

class B extends A {
	int k;
	void showk() {
		System.out.println("k = " + k);
	}
	void sum() {
		System.out.println("sum of i,j,k : " + (i+j+k));
	}
}

class Inherit {
	public static void main(String args[]){
		A a = new A();
		B b = new B();
		a.i = 10;
		a.j = 20;
		System.out.println("Contents of parent class: ");
		a.showij();
		b.i = 50;
		b.j = 30;
		b.k = 40;
		b.showij();
		b.showk();
		System.out.print("sum by sub class : ");
		b.sum();
	}
}