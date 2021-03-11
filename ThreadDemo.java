class ThreadDemo {
	public static void main(String args[]) {
		MyThread t = new MyThread(); // new state
		t.start(); // thread will enter into runnable state
		try {
			for(int i = 0; i < 5; i++) {
				System.out.println("main thread.");
				Thread.sleep(1000);
			}
		} 
		catch (InterruptedException e) {
			System.out.println("main thread interrupted");
		}
	}
}

class MyThread extends Thread {
	public void run() {
		try {
			for(int i = 0; i< 3; i++) {
				System.out.println("child thread");
				Thread.sleep(500);
			}
		} 
		catch (InterruptedException e) {
			System.out.println("child Thread Interrupted");
		}
	}
}