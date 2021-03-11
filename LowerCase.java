class LowerCase {
	public static void main(String args[]) {
		String str = "First STRING";
		for(char ch : str.toCharArray()) {
			if(ch >= 'A' &&  ch <= 'Z') {
				ch += 'a' - 'A';
			}
			System.out.print(ch);
		}
	}
}