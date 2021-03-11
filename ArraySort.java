import java.util.Arrays;

class ArraySort {
	public static void main(String args[]) {
		String[] fruits = {"Chicku", "BlackBerry", "Strawberry", "Apple", "Pineapple", "Rasberry", "Orange", "Cherry"};
		System.out.println("Before the sorting: " + Arrays.toString(fruits));
		Arrays.sort(fruits);
		System.out.println("Sorted array is: " + Arrays.toString(fruits));			
	}
}