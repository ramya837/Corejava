package conceptbased;

import java.util.TreeSet;
import java.util.Iterator;



public class IteratorTreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer>It=new TreeSet<>();
		It.add(1);
		It.add(2);
		It.add(3);
		It.add(4);
		It.add(5);
		It.add(6);
		It.add(7);
		It.add(8);
		
		System.out.println("hlooo barbie");
		System.out.println("first:"+It.first());
		System.out.println("last:"+It.last());
		System.out.println("Lower:"+It.lower(2));
		System.out.println("floor value of 75 in set:"+It.floor(9));
		System.out.println("Ceiling value of 3 in set:"+ It.ceiling(4));
		System.out.println("Heigher value of 4:"+ It.higher(4));
		System.out.println("poll first value:"+It.pollFirst());
		System.out.println("subset between 4 and 8:"+It.subSet(4,8));
		System.out.println("Headset of 7 :"+It.headSet(3));
		System.out.println("Headset of 7 includes:"+It.headSet(7,true));
		System.out.println("poll Last:"+It.pollLast());
		System.out.println("tailset of 5:"+It.tailSet(5));
		System.out.println("tailset remove of 5:"+It.tailSet(5,false));
		System.out.println(It);
		Iterator i=It.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		

}
}

