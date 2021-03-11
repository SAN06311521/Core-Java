class CallByReference {
	public static void main(String args[]) {
		Test obj = new Test();
		obj.Test(5,10);
		System.out.println("obj.a and obj.b before calling: " + obj.a + " " + obj.b);
		obj.meth(obj);
		System.out.println("obj.a and obj.b after calling: " + obj.a + " " + obj.b);
	}
}

class Test {
	int a,b;
	void Test(int x, int y) {
		int i = a;
		int j = b;
	}
	void meth(Test ob) {
		ob.a = ob.a + 5;
		ob.b = ob.b + 10;
	}
}