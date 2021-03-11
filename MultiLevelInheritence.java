class A { 
	A() {
		System.out.println("I'm A");
	}
}

class B extends A {
	B() {
		System.out.println("I'm B");
	}
}

class C extends B {
	C() {
		System.out.println("I'm C");
	}
}

class Final {
	public static void main(String args[]) {
		C obj = new C();
	}
}