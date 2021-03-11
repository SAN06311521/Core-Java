//error

class PowerFast {
	public static void main(String args[]) {
		HighPowerCal ob = new HighPowerCal();
		System.out.println(ob.powerLong(3978432, 5, 107));
	}
}

class HighPowerCal {
	static long powerLong(int a, long b, int n) {
		int ans = 1;
		while(b > 0) {
			if( (b&1) != 0) {
				ans = (ans * a % n) % n;
			}
			a = (a % n * a % n) % n;
			b = b >> 1;
		}	
		return ans;
	}
}