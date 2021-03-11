class ExceptNullPointer {
	public static void main(String args[]) {
		try {
			String str = null; //accessing null value
			System.out.println(str.charAt(1)); //error occured
		}
		catch (NullPointerException e){ 
			System.out.println("Null pointer exception occured - " + e);
		}
		System.out.println("After catch block");
	}
}