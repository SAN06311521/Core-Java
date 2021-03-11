interface CallBack {
	void callBack(int param);  //abstract method doesn't have it's body.
}

class Client implements CallBack {

	//abstract class called
	public void callBack(int p) {
		System.out.println("callBack called with " + p);
	}	
	void nonIfaceMethod() {
		System.out.println("class that implements interface may also define its own method");
	}
}

class Client1 implements CallBack {
	public void callBack(int p) {
		System.out.println("Another version of callBack " + p);
		System.out.println("Square of p is " + (p*p));
	}
}

class Interface {
	public static void main(String args[]) {
		CallBack c3; //reference variable
		c3 = new Client(); //assigning ref var
		c3.callBack(10);
		Client c1 = new Client(); 
		c1.callBack(100);
		c1.nonIfaceMethod();
		Client1 c2 = new Client1();
		c2.callBack(5);
	}
}