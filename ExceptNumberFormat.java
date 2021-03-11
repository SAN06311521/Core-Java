class ExceptNumberFormat {
	public static void main(String args[]) {
		try {
			int n = Integer.parseInt("Sanya"); //sanya is not a number
			System.out.println(n); //error will occur.
		}
		catch (NumberFormatException e) {
			System.out.println("Error is caught! " + e);
		}
	}
}