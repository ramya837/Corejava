package conceptbased;

import java.util.HashSet;
import java.util.Set;

public class Set_hashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String>names=new HashSet<String>();
		names.add("BARBIE");
		names.add("disney");
		names.add("kitty");
		names.add("picachoo");
		names.add("teddybatch");
		
		System.out.println(names);
		System.out.println("no of persons="+names);
		System.out.println(names.isEmpty());
		System.out.println(names.contains("teddybatch"));
		System.out.println(names.containsAll(names));
		names.remove("teddybatch");
		System.out.println(names);
		
		Set<Integer>Rating=new HashSet<Integer>();
		Rating.add(1);
		Rating.add(2);
		Rating.add(3);
		Rating.add(4);
		Rating.add(5);
		
		System.out.println("Rating list"+Rating);
		System.out.println("no of dolls names list is ="+Rating);
		System.out.println(Rating.isEmpty());
		System.out.println(Rating.contains(Rating));
		System.out.println(Rating.containsAll(Rating));
		Rating.remove(5);
		System.out.println(Rating);
		
		
		

	}

}
