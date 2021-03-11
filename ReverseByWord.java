class ReverseByWord {
	public static void main(String args[]) {
		String s[] = "Live life the way you want".split(" ");
		String result = " ";
		for(int i = s.length - 1; i >= 0; i--) {
			result = result + s[i] + " ";
		}
		System.out.println("Reversed string is: ");
		System.out.println(result.substring(0, result.length() - 1));
	}
}