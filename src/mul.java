

import java.util.Scanner;

class car{
	void car() {
		System.out.println("class car");
	}
		
		void vehicletype() {
			System.out.println("vehiletype:car");
		}
	}
class Audi3 extends car{
	void Audi3() {
		System.out.println("class Audi3");
	}
	void brand() {
		System.out.println("brand:Audi3");
	}

void speed(){
	System.out.println("max:80kmphr");
}
}
class BMW1 extends Audi3{
	void BMW1() {
		System.out.println("Audi3 model:BMW1");
	}
	void speed() {
		System.out.println("max:90kmph");
	}
	void brand() {
		System.out.println("model:BMW1");
	}
	
}
public class mul {

	public static void main(String[] args) {
	  BMW1 b=new BMW1();
	   b.vehicletype();
	   b.speed();
	   b.brand();
	   Audi3 c= new Audi3();
	     c.vehicletype();
	     c.speed();
	     c.brand();
	}

}

