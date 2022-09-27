package conceptbased;

import java.util.Vector;

public class Vectorset_list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v1= new Vector();
		int capacity=v1.capacity();
		System.out.println("the default capacity of vector is 10 ");
		v1.add(6);
		v1.add(96);
		System.out.println("the vector list is"+v1);
		System.out.println("the size of vector is"+v1.size());
		v1.add("babloo");
		v1.add("charlee");
		System.out.println(v1);
		System.out.println("the size of vector is"+v1.size());
		v1.add(3.5f);
		v1.add(3.45f);
		System.out.println(v1);
		System.out.println("the size of vector is"+v1.size());
		v1.remove("babloo");
		System.out.println(v1);
		v1.add(3,43);
		v1.add(3, "barbie");
		System.out.println(v1);
		
		
		

	}

}
