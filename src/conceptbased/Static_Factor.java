package conceptbased;

class CarModels{
	void cost() {
		System.out.println("no cost");
	}

void milage(){
	System.out.println("no milage");
}
}
class Audi2 extends CarModels {
	void cost() {
	System.out.println("Audi cost is 50lakhs");
}

void milage() {
	System.out.println("Audi milage is 10Km");
}
}
class BMW2 extends CarModels{
	void cost() {
		System.out.println("BMW cost is 40lakhs");
		}
	void milage() {
		System.out.println("Audi milage is 10Km");
	}
}
class Card{
	static CarModels getCarModels(String carname) {
		if (carname.equals("Audi2"))
			return new Audi2();
		else if(carname.equals("BMW2"))
			return new BMW2();
		else
			return null;
	}
}

public class Static_Factor {
	public static void main(String args[]) {
		
		CarModels cm=Card.getCarModels("Audi2");
		cm.cost();
		cm.milage();
	}
	
}
