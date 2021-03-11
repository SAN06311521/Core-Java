import java.util.*;

interface Student {
	default void show() {
		System.out.println("Inside student method");
	}
}

interface Child {
	default void show() {
		System.out.println("Inside chlid method");
	}
}

class InterfaceTest implements Student, Child {
	public void show() {
		Student.super.show();
		Child.super.show();
	}

	public static void main(String args[]) {
		InterfaceTest t = new InterfaceTest();
		t.show();
	}
}