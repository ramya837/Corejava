package conceptbased;

import java.util.TreeSet;

public class Treeset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> odd=new TreeSet<Integer>();
         odd.add(1);
         odd.add(3);
         odd.add(5);
         odd.add(7);
         odd.add(9);
         odd.add(11);
         odd.add(13);
         System.out.println(odd);
         System.out.println(odd.first());
         System.out.println(odd.last());
         odd.add(15);
         odd.add(17);
         odd.add(19);
        System.out.println(odd);
         System.out.println(odd.lower(9));
         System.out.println(odd.floor(13));
         System.out.println(odd.ceiling(17));
         System.out.println(odd.pollFirst());
         System.out.println(odd.pollLast());
         System.out.println(odd.subSet(5,13));
         System.out.println(odd.headSet( 19));
         System.out.println(odd.tailSet(11));
         
         
	}    
	

}
