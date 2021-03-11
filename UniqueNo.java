class UniqueNo {
	public static void UniqueNumber(int[] a, int n) {
		int sum = 0;
		for(int i = 0; i < n; i++) {
			sum = (sum^a[i]);
		}
		sum = (sum&-sum); //finding the rightmost set bit
		int sum1 = 0;
		int sum2 = 0;
		for(int i = 0; i < a.length; i++) {

			//for making buckets having rightmost bit 1 and 0 we are using if-else
			if((a[i]&sum) > 0) {
				sum1 = (sum1^a[i]);
			}
			else {
				sum2 = (sum2^a[i]);
			}
		}
		System.out.print("Two unique non-repeating elements are: " + sum1 + " and " + sum2);
	}

	public static void main(String args[]) {
		int arr[] = new int[]{1, 2, 3, 4, 5, 1, 2, 3};
		int n = arr.length;
		UniqueNumber(arr, n);
	}
}