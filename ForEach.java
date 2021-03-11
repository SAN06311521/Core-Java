class ForEach {
	public static void main(String args[]) {
		int[] arr = {2, 3, 4, 5, 6, 7, 8, 9, 10};
		int total = 0;
		for(int i: arr) {
			total += i;
			System.out.println("partial total : " + total + "  ");
		}
		System.out.println("Final total is: " + total);
	}
}