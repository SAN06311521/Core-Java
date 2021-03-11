class ExceptBuffer {
	public static void main(String args[]) {
		try {
			String str = "Faith"; // length - 6
			char ch = str.charAt(10); //trying to access 11th element which is buffer overflow
			System.out.println(ch);
		} 
		
		catch (StringIndexOutOfBoundsException e){
			System.out.println("Exception occured - Buffer Overflow!");			
		}
		try {
			int num[] = new int[10]; // array having 5 elements
			num[11] = 1; //this will give error because we are accessing 11th element which doen't exist
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array index is not reachable.");
		}
	}
}