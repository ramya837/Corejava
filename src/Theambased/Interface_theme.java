package Theambased;
interface Powerstation{
	void turbine();
	void generator();
} 
abstract class Conventionalpowerstation{
	abstract void boiler();
	abstract void condenser();
}
class Thermalplant extends Conventionalpowerstation{
void boiler() {
	System.out.println("boiled the water");
}
void condenser() {
	System.out.println("to exahsted the power");
}
public void turbine() {
	System.out.println("steam produced in the turbine");
}
public void generator() {
	System.out.println("it converting the mechanical energy into electrical energy");
}
}
abstract class Nonconventionalpowerstaion implements Powerstation{
	abstract void storage();
}
class Hydroplant extends Nonconventionalpowerstaion{
	void storage() {
		System.out.println("water stored from the reservoires");
	}
	void boiler() {
		System.out.println("burns the water");
	}
	void condenser() {
		System.out.println("to exahsted the power");
	}
	@Override
	public void turbine() {
		System.out.println("produces the steam");
		
	}
	@Override
	public void generator() {
		System.out.println("the generator converts the mechanical energy to electrical energy");
	}
}
public class Interface_theme {

	public static void main(String[] args) {
		
		 Conventionalpowerstation c;
		 c=new Thermalplant();
		 c.boiler();
		 c.condenser();
		
		 Nonconventionalpowerstaion n;
		 n=new  Hydroplant();
		 n.storage();
		 n.turbine();
		 n.generator();
		 
		

	}



}


