import java.io.*;
import java.util.*;

class FiftyFive {
	static void s_push (Stack<Integer> stack) {
		System.out.println("Push operation");
		for(int i = 0; i < 5; i++) {
			stack.push(i);
		}
	}

	static void s_pop(Stack<Integer> stack) {
		System.out.println("Pop Operation");
		for(int i = 0; i < 5; i++) {
			Integer x = (Integer) stack.pop();
			System.out.println(x);
		}		
	}

	static void s_peek(Stack<Integer> stack) {
		Integer top = (Integer) stack.peek();
		System.out.println("On the top of the stack: " + top);
	}

	static void s_search(Stack<Integer> stack, int element) {
		Integer position = (Integer) stack.search(element);
		if(position == -1) {
			System.out.println("Not found :(");
		}
		else {
			System.out.println("Found! at position: " + position);
		}
	}
	
	public static void main(String args[]) {
		Stack<Integer> stack = new Stack<Integer>();
		s_push(stack);
		s_pop(stack);
		s_push(stack);
		s_peek(stack);
		s_search(stack, 3);
		s_search(stack, 2);
	}
}