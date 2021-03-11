import java.util.*;

class SetDemo {
	public static void main(String args[]) {
		HashSet set = new HashSet();
		set.add(123);
		set.add('C');
		set.add("Java");
		set.add(true);
		set.add("C++");
		System.out.println("Set is : "+set);
		System.out.println("size of Set is : "+set.size());
		//set.clear();
		//System.out.println("is Set is blank? "+set.isEmpty());
		HashSet set1 = new HashSet();
		set1.add("one");
		set1.add("two");
		set1.add("three");
		set1.add('C');
		set1.add("four");
		set1.add("five");
		set.add(set1);
		set.addAll(set1);
		System.out.println("Now,the Set is : "+set);
		System.out.println("size of Set is : "+set.size());
		set.removeAll(set1);
		set.retainAll(set1);
		//System.out.println("Now,the Set is : "+set);
	}
}