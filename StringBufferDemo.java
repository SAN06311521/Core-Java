class StringBufferDemo {
	public static void main(String args[]) {
		StringBuffer s = new StringBuffer("hello");

		System.out.println("String: " + s);
		System.out.println("String length: " + s.length());
		System.out.println("String's capacity: " + s.capacity());
		System.out.println("Reverse of string: " + s.reverse());

		//by default if not defined a stringbuffer occupy 16 bytes and 0 length here s1 is empty string
		StringBuffer s1 = new StringBuffer();
		System.out.println("Empty string's length: " + s1.length());
		System.out.println("Empty string's capacity: " + s1.capacity());
	}
}