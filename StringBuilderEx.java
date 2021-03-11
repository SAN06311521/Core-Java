class StringBuilderEx {
	public static void main(String args[]) {
		StringBuilder str = new StringBuilder();
		StringBuilder str1 = new StringBuilder("Chun");
		str1.append("chun"); 
		System.out.println(str1);
		System.out.println(str.capacity());
		StringBuilder str2 = new StringBuilder("Hello");
		str2.reverse();
		System.out.println(str2);
		
	}
}