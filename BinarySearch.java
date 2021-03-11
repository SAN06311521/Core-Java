import java.util.Scanner;

class BinarySearch {
	public static void main(String args[]) {	
		int count, n, item, arr[], f, l, m;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of elements for binary search: ");
		n = input.nextInt();
	
		//array initialization
		arr = new int[n];
	
		System.out.print("Enter " + n + " integers: ");
	
		//taking input of array from users
		for(count = 0; count < n; count++) {
			arr[count] = input.nextInt();
		}
	
		System.out.println("Enter the value to be searched: ");	

		item = input.nextInt();
		f = 0;
		l = n - 1;
		m = (f + l)/2;

		while(f <= l) {
			if( arr[m] < item) {
				f = m + 1;
			}else if (arr[m] == item) {
				System.out.println(item + " found at location " + (m + 1));
				break;
			}else {
				l = m -1;
			}
			m = (f + l)/2;
		}
		if( f > l) {
			System.out.println(item + " not found :(");
		}
	}
	
}