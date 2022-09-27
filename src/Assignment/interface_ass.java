package Assignment;
interface Vehicle{
	void cost();
	void milage();
	void weight();
}
abstract class Cars implements Vehicle{
	abstract void airbags();
	abstract void seatbelts();
}
 class Roadster extends Cars{
	void airbags () {
		System.out.println("Roadster HAS airbags");
	}
 void seatbelts(){
		System.out.println("roadster has seatbelts");
	}
 public void cost () {
	 System.out.println("Roadster cost is 50.70lak");
 }
 public void milage () {
	 System.out.println("milege of the car 32.16kmpl");
 }
	public void weight() {
		System.out.println("car have 400kgs");
	}
 }
	abstract class bike implements Vehicle {
		abstract void sensor();
		abstract void handlelock();
	}
	     class Duke extends bike{
		void sensor() {
			System.out.println("bike runs on sensor gesters");
		}
		void handlelock() {
		 System.out.println("handle lock is provided to the bike");
		 	}
	    
		public void cost() {
			System.out.println("duke cost 1,70,000/-");
		}
		
		public void weight() {
			System.out.println("weight og the vehicle 31.5kg");
		
		}
		
		public void milage() {
			System.out.println("the milage of a bike is 20kmpl");// TODO Auto-generated method stub
			
		}
	 }
	
public class interface_ass {

	public static void main(String[] args) {
		Cars c;
		c=new Roadster();
		    c.airbags();
		    c.seatbelts();
		    c.cost();
		    c.milage();
		    c.weight();
		    bike b;
		    b=new Duke();
		    b.sensor();
		    b.handlelock();
		    b.milage();
		    b.weight();

	}

}

	
