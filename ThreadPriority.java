import java.util.*;

class MyThread extends Thread {
	String msg;
	MyThread(String s) {
		super(s);
		msg = s;
		this.start();
	}
	
	public void run() {
		System.out.println("Thread start: " + msg);
		for(int i = 0; i <= 10; i++) {
			System.out.println("Thread i: " + i);
			System.out.println("Thread is finished:" + msg);
		}
	}	
}

class ThreadPriority {
	public static void main(String args[]) {
		MyThread t1 = new MyThread("First");
		MyThread t2 = new MyThread("Second");
		MyThread t3 = new MyThread("Third");
		t1.setPriority(1);
		t2.setPriority(2);
		t3.setPriority(3);
		System.out.println("Thread: " + t1.msg + ".." + t1.isAlive());
		System.out.println("Thread: " + t2.msg + ".." + t2.isAlive());
		System.out.println("Thread: " + t3.msg + ".." + t3.isAlive());
		
		try {
			t1.join();
			t2.join();
			t3.join();
		}
		catch (Exception e) {
			System.out.println("Error: " + e);
		}
		System.out.println("Thread: " + t1.msg + ".." + t1.isAlive());
		System.out.println("Thread: " + t2.msg + ".." + t2.isAlive());
		System.out.println("Thread: " + t3.msg + ".." + t3.isAlive());
	}
}