import java.util.Arrays;

class PrimeNo {
	public static void main(String args[]) {

		boolean isPrime[] = seiveOfEratoSthenes(10);
		System.out.println("Prime numbers are: ");
		for(int i = 0; i <= 10; i++) {
			System.out.println(i + " " + isPrime[i]);	
		}	

	}
		
	static boolean[] seiveOfEratoSthenes(int n) {
		boolean isPrime[] = new boolean[n+1];
		
		Arrays.fill(isPrime, true);
		isPrime[0] = false;
		isPrime[1] = false;

		for(int i = 2; i*i <= n; i++) {
			for(int j = 2*i; j <= n; j++) {
				isPrime[j] = false;
			}
		}

		return isPrime;
	}
}