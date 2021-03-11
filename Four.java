import java.util.Scanner;

class Four{
	public static void main(String args[]){
		int a,b,c,d,e;
		System.out.println("Enter 5 different integers: ");
		Scanner in = new Scanner(System.in);
		a = in.nextInt();
		b = in.nextInt();
		c = in.nextInt();
		d = in.nextInt();
		e = in.nextInt();
		int largest = a;
		int smallest = a;
		if(a < b){
			largest = b;
		}
		if(a < b){
			largest = b;
		}
		if(a < c){
			largest = c;
		}
		if(a < d){
			largest = d;
		}
		if(a < e){
			largest = e;
		}
		if(a > b){
			smallest = b;
		}
		if(a > c){
			smallest = c;
		}
		if(a > d){
			smallest = d;
		}
		if(a > e){
			smallest = e;
		}
		System.out.println("Largest among all is: " + largest);
		System.out.println("Smallest among all is: " + smallest);
	}
}