import java.util.Scanner;

class Array{
	public static void main(String args[]){
		int arr[] = new int[10];
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the numbers for array to calculate even and odd sum: ");
		for(int j = 0; j < arr.length; j++){
			arr[j] = scan.nextInt();
		}
		System.out.println("Entered number is: ");
		for(int i = 0; i < arr.length; i++){
			System.out.println(arr[i]);
		}
		int sumEven = 0;
		int sumOdd = 0;
		for(int k = 0; k < arr.length; k++){
			if(arr[k] % 2 == 0){
				sumEven += arr[k];
			}else{
				sumOdd += arr[k];
			}
		}
		System.out.println("Sum of even integers is: " + sumEven);
		System.out.println("Sum of add integers is: " + sumOdd);
	}
}

//array initialization = arr[5] = {1,2,3,4,5};
//armstrong number