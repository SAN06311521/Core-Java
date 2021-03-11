public class Gen_Main {
	public static void main(String arg[]) {
		Integer numbers[] = {10, 20, 30, 40};
		main(numbers);
	}
	static <E> void main(E aa[]) {
		for(int i = 0; i < aa.length; i++) {
			System.out.println(aa[i]);
		}
	}
}