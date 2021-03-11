class length {
	public static void main(String args[]) {
		String str = "First string!";
		int i = 0;
		for(char ch : str.toCharArray()) {
			i++;
		}
		System.out.println("Length of the string is : " + i);
	}
}