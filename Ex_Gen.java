class MyData<T> {
	T i;
	public void add(T i1) {
		i = i1;
	}
	public T get() {
		return i;
	}
}

public class Ex_Gen {
	public static void main(String ar[]) {
		MyData<Integer> md = new MyData<Integer>();
		MyData<String> ms = new MyData<String>();
		Integer k = new Integer(10);
		md.add(k);
		ms.add(" IIPS");
		System.out.println("Integer object: " + md.get());
		System.out.println("String object: " + ms.get());
	}
}