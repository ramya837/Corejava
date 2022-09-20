package corejava;
class Car{
	void cost() {
		System.out.println("no cost");
	}

void milage(){
	System.out.println("no milage");
}
}
class Audi1 extends Car {
	void cost() {
	System.out.println("Audi cost is 50lakhs");
}

void milage() {
	System.out.println("Audi milage is 10Km");
}
}
class BMW extends Car{
	void cost() {
		System.out.println("BMW cost is 40lakhs");
		
	}

void milage() {
	System.out.println("BMW milage is 15km");
}
}
public class Moriding {

	public static void main(String[] args) {
	  Car z=new Car();
	  z.cost();
	  z.milage();
	  z=new Audi1();
	  z.cost();
	  z.milage();
	  z=new BMW();
	  z.cost();
	  z.milage();
	  
			  

	}

}
