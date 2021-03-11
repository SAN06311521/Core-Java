class CallByValue {
	public static void main(String args[]){
		Test obj = new Test();
		int a = 5;
		int b = 10;
		System.out.println("a and b before call: " + a + " " + b);
		obj.meth(a,b);
		System.out.println("a and b after call: " + a + " " + b);
	}
}

class Test {
	void meth(int x, int y) {
		x += 5;
		y -= 10;
	}
}