public class Gen_Example {
	public <E> void printArray(E []s) {
		for(int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}
	}
	/* public void printArray(Integer []n) {
		for(int i = 0; i < n.length; i++) {
			System.out.println(n[i]);
		}
	} */
	public static void main(String ar[]) {
		Gen_Example e1 = new Gen_Example();
		String countries[] = {"India", "Japan", "Nepal"};
		Integer numbers[] = {10, 20, 30};
		Character ch[] = {'A', 'B', 'C'};

		e1.printArray(countries);
		e1.printArray(numbers);
		e1.printArray(ch);
	}
}

