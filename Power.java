class Power {
	public static void main(String args[]) {
		PowerCal obj = new PowerCal();
		System.out.println(obj.fastPower(3,2));
	}
}

class PowerCal {
	static int fastPower(int a, int b) {
		int result = 1;
		while(b > 0) {
			if((b % 2) != 0) {  //b%2 ko b&1 bhi likh skte h
				result = result * a;
			}
			a = a * a;
			b = b >> 1; //b = b/2
		}
		return result;
	}
}