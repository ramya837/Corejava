package optionalExercise;

abstract class Myworld{

	abstract void name();
	abstract void relation();
	         void princess() {
	        	 System.out.println("dads princesses");
		
	}
	      
}
class dadoo extends Myworld{
	void name() {
		System.out.println("dadoo name madhusudhanarao");
	}
	void relation() {
		System.out.println("father to princess");
	}
}
class mom extends Myworld{
      void name() {
    	  System.out.println("moms name samba");
      }
      void relation() {
    	  System.out.println("mother to princesses");
      }
}
public class abtstract_5 {

	public static void main(String[] args) {
		Myworld n;
		n=(Myworld)new dadoo();
		n.name();
		n.relation();
		n=(Myworld)new mom();
		n.name();
		n.relation();

	}

}

