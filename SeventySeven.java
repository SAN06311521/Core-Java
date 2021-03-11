import java.util.*;

class JoiningThread extends Thread {
	@Override
	public void run() {
		for(int i = 0; i < 2; i++) {
			try {
				Thread.sleep(500);
				System.out.println("Current thread: " + Thread.currentThread().getName());
			}
			catch(Exception e) {
				System.out.println("Exception caught!");
			}
			System.out.println(i);
		}
	}
}
class SeventySeven {
	public static void main(String args[]) {
		JoiningThread t1 = new JoiningThread();
		JoiningThread t2 = new JoiningThread();
		JoiningThread t3 = new JoiningThread();
		t1.start();
		try {
			System.out.println("Current Thread: " + Thread.currentThread().getName());
			t1.join();
		}
		catch (Exception e) {
			System.out.println("Exception caught in t1!");
		}
		t2.start();
		try {
			System.out.println("Current Thread: " + Thread.currentThread().getName());
			t2.join();
		}
		catch(Exception e) {
			System.out.println("Exception caught in t2!");
		}
		t3.start();
	}
}