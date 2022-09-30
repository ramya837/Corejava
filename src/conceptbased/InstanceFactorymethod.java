package conceptbased;
class Carss{
	void cost() {
		System.out.println("no cost");
	}

void milage(){
	System.out.println("no milage");
}
}
class Audi12 extends Carss {
	void cost() {
	System.out.println("Audi12 cost is 50lakhs");
}

void milage() {
	System.out.println("Audi12 milage is 10Km");
}
}
class BMW1 extends Carss{
	void cost() {
		System.out.println("BMW1 cost is 40lakhs");
	}
	void milage() {
		System.out.println("BMW1 milage is 20Km");
}
}
		class Cardetails{
			Carss getCarss(String carname) {
				if(carname.equals("Audi12"))
				return new Audi12();
				else if(carname.equals("BMW1"))
				return new BMW1();
				else
					return null;
			}
		}

		public class InstanceFactorymethod {
			public static void main(String args[]) {
				Cardetails c= new Cardetails();
				Carss cr=c.getCarss("BMW1");
				cr.cost();
				cr.milage();
	
}
		}
	
