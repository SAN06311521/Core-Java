import java.util.Scanner;

class BubbleSort {
	public static void main(String args[]) {
		int num, count, swap, i;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter he number of integers to sort via bubble sort: ");
		num = input.nextInt();

		//array declaration
		int arr[] = new int[num];
		System.out.println("Enter " + num + " integers: ");
		
		//taking input from the user
		for(count = 0; count < num; count++) {
			arr[count] = input.nextInt();
		}

		for(count = 0; count < (num - 1); count++) {
			for (i = 0; i < (num - count - 1); i++) {
				if(arr[i] > arr[i+1]) {
					//descending order
					swap = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = swap;
				}
			}
		}
		System.out.println("Sorted list is: ");

		for(count = 0; count < num; count++) {
			System.out.println(arr[count]);
		} 
	}
}