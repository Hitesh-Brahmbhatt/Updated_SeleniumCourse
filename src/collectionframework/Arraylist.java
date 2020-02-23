package collectionframework;

import java.util.ArrayList;

public class Arraylist {

	public static void main(String[] args) {
		
		ArrayList<String> names = new ArrayList<String>();
		names.add("Kohli");
		names.add("Dhoni");
		System.out.println("Length of an ArrayList is " + names.size());
		System.out.println("Names are " + names);
		names.remove("Dhoni");
		System.out.println("Length of an ArrayList is " + names.size());
		System.out.println("Names are " + names);
		ArrayList<String> Cricketers = new ArrayList<String>();
		System.out.println("Cricketers");
		System.out.println("Cricketers.size()");
	}
}
