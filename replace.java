class Replace {
	public static void main(String args[]) {
		String str = "First string!";
		System.out.println("String is: " + str);
		int position = 7;
		char replace = 'S';
		String result = str.substring(0, position) + replace + str.substring(position + 1);
		System.out.println("Replaced string without replace method is: " + result);
	}
}