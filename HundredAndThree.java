import java.util.Scanner;

class HundredAndThree {
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		int[][] a = new int[3][3];
		int[][] b = new int[3][3];
		int[][] c = new int[3][3];
		System.out.println("Enter the elements of first 3x3 matrix: ");

		//taking first matrix from user
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				a[i][j] = input.nextInt();	
			}
		}

		//taking second matrix from user
		System.out.println("Enter the elements of second 3x3 matrix: ");
		for(int k = 0; k < 3; k++) {
			for(int l = 0; l < 3; l++) {
				b[k][l] = input.nextInt();	
			}
		}

		System.out.println("The resultant matrix is: ");
		
		//adding the two matrix
		for(int n = 0; n < 3; n++) {
			for(int m = 0; m < 3; m++) {
				c[n][m] = a[n][m] + b[n][m];
				System.out.print(c[n][m] + " ");
			}
			System.out.println();
		}
	}
}