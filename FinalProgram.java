class A{
	final int i = 10;
	final void meth() {
		System.out.println("final method");
		System.out.println("final variable is constant - i = " + i);
	}
}

class B extends A{
	// trying to override final method
	//meth() {
	//	System.out.println("Error here! because you cannot override final method");
	//}
	// this will give error

	void meth1() {
		System.out.println("Extra non-final method");
	}
}

public class FinalProgram {
	public static void main(String args[]) {
		A obj = new A();
		obj.meth();
		B b = new B();
		b.meth1();
		//inheriting final method
		b.meth();
	}
}