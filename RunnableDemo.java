class RunnableDemo {
	public static void main(String args[]) {
		MyRunnable r = new MyRunnable();
		Thread t = new Thread(r); //target runnable
		t.start();
		try {
			for(int i = 0; i < 5; i++) {
				System.out.println("main thread");
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			System.out.println("main thread interrupted");
		}
	}
}

class MyRunnable implements Runnable {
	public void run() {
		try {
			for(int i = 0; i < 3; i++) {
				System.out.println("child thread");
				Thread.sleep(500);
			}
		} catch (InterruptedException e) {
			System.out.println("child thread interrupted");
		}
	}
}