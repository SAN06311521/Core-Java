class TheTowerOfHanoi {
	public static void main(String args[]) {
		AlgoImplement obj = new AlgoImplement();
		obj.move(5, 1, 3);
	} 	
}

class AlgoImplement {
	public void move(int n, int start, int end) {
		if(n == 0) {
			return;
		}
		int intermediate =  6 - start - end;
		move(n-1, start, end);
		System.out.println("Move " + n + " from " + start + " to " + end);
		move(n-1, intermediate, end);
	}
}