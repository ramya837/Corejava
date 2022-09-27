package conceptbased;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> fastfood=new ArrayList<String>();
		fastfood.add("pizza");
		fastfood.add("Burger");
		fastfood.add("noodles");
		fastfood.add("frenchfrys");
		fastfood.add("gupchup");
		System.out.println(fastfood);
		System.out.println(fastfood.get(2));
		fastfood.set(2,"pizza");
		System.out.println(fastfood);
		fastfood.remove(2);
		System.out.println(fastfood);
		System.out.println("fast food cost"+fastfood);
		
		Set<Integer>even=new LinkedHashSet<>();
		even.add(2);
		even.add(4);
		even.add(6);
		even.add(8);
		even.add(10);
		even.add(12);
		even.add(14);
		System.out.println(even);
		
	}

}
