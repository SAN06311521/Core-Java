import java.util.*;

class ProMap
{
public static void main(String as[])
{
Product p1=new Product(111,"I-Phone6",60000);
Product p2=new Product(112,"Bullet 500cc",130000);
Product p3=new Product(113,"Fortuner",3600000);
Product p4=new Product(114,"I-Phone4",20000);
Product p5=new Product(115,"I-Phone5",30000);
Product p6=new Product(116,"Calculator",500);

HashMap<Integer,Product> list=new HashMap<Integer,Product>();

list.put(111,p1);
list.put(112,p2);
list.put(113,p3);
list.put(114,p4);
list.put(115,p5);
list.put(116,p6);
list.put(116,p4);


System.out.print("Enter the Prodcut code that u want 2 search : ");
int p=new Scanner(System.in).nextInt();

if(list.containsKey(p))
	{
		Product pro=(Product)list.get(p);
		pro.show();
	}
else
	{
		System.out.println("Invalid Product Code......");
	}
}
}
