import java.util.*;

class ArrayListDemo {
	public static void main(String args[]) {
		ArrayList<String> al = new ArrayList<String>();
		System.out.println("Initial size of al: " + al.size());
		al.add("A");
		al.add("B");
		al.add("C");
		al.add("D");
		al.add("E");
		al.add("F");
		al.add(1, "S");
		System.out.println("Size of al after addition: " + al.size());
		System.out.println("Contents of al: " + al);
		al.remove("F");
		al.remove("E");
		System.out.println("Content after removal: " + al);
	}
} 