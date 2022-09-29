package conceptbased;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Iteratorlinkedhashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> fastfood=new LinkedHashSet<String>();
		fastfood.add("pizza");
		fastfood.add("Burger");
		fastfood.add("noodles");
		fastfood.add("frenchfrys");
		fastfood.add("gupchup");
		System.out.println(fastfood);
		Iterator i=fastfood.iterator();
		while(i.hasNext()){
			System.out.println(i.next());
			
		}
		

	}

}
