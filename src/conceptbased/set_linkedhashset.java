package conceptbased;

import java.util.LinkedHashSet;
import java.util.Set;

public class set_linkedhashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> fastfood=new LinkedHashSet<String>();
		fastfood.add("pizza");
		fastfood.add("Burger");
		fastfood.add("noodles");
		fastfood.add("frenchfrys");
		fastfood.add("gupchup");
		System.out.println(fastfood);
		
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
