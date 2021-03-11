class UpperCase {
	public static void main(String args[]) {
		String str = "First string";
		for(char ch : str.toCharArray()) {
			if(ch >= 'a' &&  ch <= 'z') {
				ch += 'A' - 'a';
			}
			System.out.print(ch);
		}
	}
}