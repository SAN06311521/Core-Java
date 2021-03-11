class ArrayQues {

	static int OnceOccur(int a[], int a_size) {
		int result = a[0];
		for(int i = 1; i < a_size; i++) {
			result = result ^ a[i];
		}
		return result;
	}

	public static void main(String args[]) {
		int arr[] = {1, 2, 3, 4, 5, 4, 3, 2, 1};
		int n = arr.length;
		System.out.print("Element occuring once is: " + OnceOccur(arr, n) + " ");	
	}	
}