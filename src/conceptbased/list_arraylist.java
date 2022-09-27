package conceptbased;

import java.util.ArrayList;
import java.util.List;

public class list_arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer>a1=new ArrayList<Integer>();
		a1.add(46);
		a1.add(87);
		a1.add(24);
		a1.add(98);
		a1.add(76);
		a1.add(12);
		a1.add(34);
		a1.add(65);
		a1.add(58);
		a1.add(24);
		a1.add(77);
		a1.add(67);
		a1.add(32);
		System.out.println(a1);
		a1.add(3,55);
		System.out.println(a1.get(4));
		

	}

}
