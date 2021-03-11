class ExceptSubSuper {
	public static void main(String args[]) {
		try {
			int n = 1;
			int m = 0;
			int ans = n/m; 
		}
		catch (Exception e) { // this will catch every error above
			System.out.println("Superclass Exception caught!");
		}
		catch(ArithmeticException e) { // subclass block will not be run
			System.out.println("I'm subclass exception placed wrong hence will not run :(");
		}
	}
}