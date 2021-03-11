public class CmdLineArgsExample {
	public static void main(String ar[]){
		if(ar[0].equals("h")) {
			System.out.println("Hello");
		}else if(ar[0].equals("g")) {
			System.out.println("Good bye");
		}
		System.out.println("length: " + ar.length);
		for(int i = 0; i < ar.length; i++) {
			System.out.println(" " + ar[i]);
		}
	}
}