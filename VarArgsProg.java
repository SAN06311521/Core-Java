import java.util.*;

class VarArgsProg {
	public static void main (String args[]) {
		if(args.length > 0) {
			System.out.println("Command line arguements are: ");
			for(String value : args) {
				System.out.print(value + " ");
			}
		}
		else {
			System.out.println("Nothing to print! Nothing entered.");
		}	
	}
}