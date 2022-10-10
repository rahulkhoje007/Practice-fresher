package javacollection;

import java.util.LinkedList;

public class JavaLinkList {

	public static void main(String[] args) {

		LinkedList<String> Name = new LinkedList<String>();
		Name.add("Ankit");
		Name.add("Rahul");
		Name.add("Jyoti");

		System.out.println(Name);

		Name.addFirst("Raj");
		Name.addLast("Kiran");

		System.out.println(Name);

		for (String str : Name) {

			System.out.println(str);
		}

	}
}
