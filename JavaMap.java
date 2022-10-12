package javacollection;

//Java code to illustrate the containsKey() method 
import java.util.*;

public class JavaMap {
	public static void main(String[] args) {
		HashMap<Integer, String> hmap = new HashMap<>();
		Scanner in = new Scanner(System.in);

		System.out.println("Enter Key");
		Integer a = in.nextInt();
		System.out.println("Enter Value");
		String b = in.next();
		hmap.put(a, b);
		System.out.println(hmap);

		 System.out.println("Is the key 'World' present? " +  hmap.containsKey("World"));

	}

}
