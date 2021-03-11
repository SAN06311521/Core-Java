class Josephus {
	public static void main(String args[]) {
		JosephusProblem ob = new JosephusProblem();
		System.out.println(ob.jos(5,3));
	}
}

class JosephusProblem {
	int jos(int n, int k) {
		if(n == 1) {
			return 0;
		}
		else {
			return ((jos(n-1,k) + k ) % n);
		}
	}
}