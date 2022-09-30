package conceptbased;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class List_Iterator {

	public static void main(String[] args) {
		
		List<String>sweets=new LinkedList<>();
		System.out.println("------favorite sweets-----");
		sweets.add("kalakanda");
		sweets.add("jaangri");
		sweets.add("badhsha");
		System.out.println("favorite sweets"+sweets);
		ListIterator i=sweets.listIterator();
		while(i.hasNext()) {
			System.out.println(i.next());
			
		}
		System.out.println("print previous sweet");
		while(i.hasPrevious()) {
		System.out.println(i.previous());

		}
	}

}
