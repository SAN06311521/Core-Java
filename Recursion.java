class Recursion {
	public static void main(String args[]){
		Factorial f = new Factorial();
		System.out.println("Factorial of n is: " + f.meth(10));
	}
}

class Factorial {
	int meth(int n){
		if(n == 1){
			return 1;
		}else{
			return (meth(n-1)*n);
		}
	}
}