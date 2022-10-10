package javacollection;

import java.util.ArrayDeque;
import java.util.Stack;

public class JavaStack {

	public static void main(String[] args) {

		// Stack work in LIFO manner
		Stack<String> Name = new Stack<>();
		Name.push("Akash");
		Name.push("Arun");
		Name.push("Nil");
		System.out.println(Name);
		Name.pop();
		System.out.println(Name);
		System.out.println("-----Array Deque----");

		// ArrayDeque work in FIFO manner

		ArrayDeque<String> Name1 = new ArrayDeque<>();

		Name1.add("Vaibhav");
		Name1.add("Akashy");
		Name1.add("Kunal");
		System.out.println(Name1);
		Name1.remove();
		System.out.println(Name1);
		Name1.removeLast();
		System.out.println(Name1);

	}

}
