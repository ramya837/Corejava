package conceptbased;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class iterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String>hs=new HashSet<String>();
		hs.add("f");
		hs.add("q");
		hs.add("i");
		hs.add("m");
		hs.add("b");
		hs.add("");
		hs.add("f");
		hs.add("t");
		hs.add("c");
		hs.add("k");
		hs.add("p");
		hs.add("n");
		System.out.println("HashSet");
		System.out.println(hs);
		System.out.println("size of the HashSet:"+hs.size());
		System.out.println("Hashset is empty:"+hs.isEmpty());
		System.out.println("Is HashSet contains G:"+hs.contains("G"));
		System.out.println("Remove D"+hs.remove("D"));
		System.out.println(hs);
		System.out.println("Clone Set:"+((HashSet) hs).clone());
		Iterator i=hs.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
			
		}
		
    }
	
     }


