package conceptbased;

import java.util.LinkedList;

public class Linkedlist {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> namkees=new LinkedList<>();
		namkees.add("chips");
		namkees.add("snacks");
		System.out.println("the namkees list is"+namkees);
		namkees.addFirst("aloochips");
		System.out.println("the list of namkees"+namkees);
		namkees.addLast("banana chips");
		System.out.println("the total namkees"+namkees);
		namkees.add(4, "murukul");
		System.out.println(namkees);
		namkees.remove("aloochips");
		System.out.println("the removed namkees list is"+namkees);
		System.out.println("the namkees list"+namkees);
		namkees.pop();
		System.out.println("the veg list"+namkees);
		namkees.clear();
		System.out.println(namkees);
		
		

	}

}
