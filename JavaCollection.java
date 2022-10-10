package javacollection;

import java.util.ArrayList;

public class JavaCollection {

	public static void main(String[] args) {

		ArrayList<String> Name = new ArrayList<String>();
		Name.add("Ankit");
		Name.add("Rahul");
		Name.add("Jyoti");

		//add
		
		System.out.println(Name);
		Name.add("Rohit");
		System.out.println(Name);
		Name.add(1, "Yadav");
		System.out.println(Name);
		
		//  remove 
		
		Name.remove(3);
		System.out.println(Name);
		
		System.out.println("Size = "+Name.size());
		
		// Set method change value
		
		Name.set(0, "Vaibhav");
		
		// Get method
		
		System.out.println(Name.get(3));
		
		// clear method for deleting all element
		
		Name.clear();
		System.out.println(Name);
		
		
				
		
	}

}
