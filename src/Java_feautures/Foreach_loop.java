package Java_feautures;

import java.util.HashMap;

public class Foreach_loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Integer>FL=new HashMap<String,Integer>();
		System.out.println("---powerstaion name and its producing power in volts----");
		FL.put("Thermal power staion", 24000);
		FL.put("Nuclear power plant",1000);
		FL.put("wind power plant", 690);
		FL.put("hydro power plant", 13800);
		 System.out.println(FL);
		FL.forEach((key,value)->System.out.println(key+" "+value));
		 }
	

}
