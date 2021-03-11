import java.util.*;

class MapDemo {
	public static void main(String args[]) {

		HashMap<Integer,Product> list=new HashMap<Integer,Product>();

		Product p1=new Product(111,"I-Phone6",60000);
		Product p2=new Product(112,"Bullet 500cc",130000);
		Product p3=new Product(113,"Fortuner",3600000);
		Product p4=new Product(114,"I-Phone4",20000);
		Product p5=new Product(115,"I-Phone5",30000);
		Product p6=new Product(116,"Calculator",500);

		list.put(1,p1);
		list.put(2,p2);
		list.put(3,p3);
		list.put(4,p4);
		list.put(5,p5);
		list.put(6,p6);

		System.out.print("Enter the Product code that you want to search: ");
		Scanner input = new Scanner(System.in);
		int p = input.nextInt();

		if(list.containsKey(p)) {
			Product pro = (Product)list.get(p);
			pro.show();
		}
		else {
			System.out.println("Invalid Product Code......");
		}
	}
}
