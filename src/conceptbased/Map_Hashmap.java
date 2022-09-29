package conceptbased;

import java.util.HashMap;
import java.util.TreeMap;

public class Map_Hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String>fruits=new HashMap<Integer,String>();
		System.out.println("--------list of the fruits price in flipcart------");
		fruits.put(103, ("kiwi 3 units"));
		fruits.put(106,("watermelon 1unit null"));
		fruits.put(114, ("Sweet lemon 1kg"));
		fruits.put(138, ("Mandrainorange 250g"));
		fruits.put(200,("Mango 1kg"));
		System.out.println(fruits);
		
		
		TreeMap<Integer,String> vegetables=new TreeMap<Integer,String>();
		System.out.println("------list of the vegetables price in the amazon-----");
		 vegetables.put(132, ("beetroot 1kg"));
		 vegetables.put(161,("bell pepper 1kg"));
		 vegetables.put(50,("cucumber 1kg"));
		 vegetables.put(120,("green beans 1kg"));
		 vegetables.put(45,("okra 1kg"));
		 vegetables.put(180,("peace 1kg"));
		 vegetables.put(50,("garlic 1kg"));
		 System.out.println(vegetables);
		 
		 
		 
		 TreeMap<Integer,String> lifyvegetables=new TreeMap<Integer,String>();
			System.out.println("------list of the lifyvegetables price in market with each bundle----");	
			 lifyvegetables.put(100,("coriander leaves"));
			 lifyvegetables.put(150,("mint leaves"));
			 lifyvegetables.put(10,("curry leaves"));
             lifyvegetables.put(30,("kenaf leaves"));
             lifyvegetables.put(25,("amaranthus leaves"));
             System.out.println(lifyvegetables);



	}

	
}
