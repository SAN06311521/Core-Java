import java.util.*;

class StackDemo {
	public static void main(String args[]){
		Stack st = new Stack();
		//st.push(1234); auto boxing
		st.push(52.34);
		st.push(67.34f);
		st.push("Hello");
		st.push('c');
		st.push(false);
		st.push(49.92);
		System.out.println("The Stack is :  "+st);
		double d = (Double)st.pop();
		System.out.println(d +" is double stack");
		System.out.println("Now,the Stack is :  "+st);
		//boolean b = (Boolean)st.pop(); //auto unboxing
		Boolean bl = (Boolean)st.pop();  //manual unboxing
		boolean b = bl.booleanValue();
		System.out.println(b +" is out.......");
		System.out.println("Now,the Stack is :  "+st);
	}
}
