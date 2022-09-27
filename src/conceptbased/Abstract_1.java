package conceptbased;

abstract class Mycar{
	abstract void cost();
	abstract void milage();
	         void start() {
	        	 System.out.println("Start with a key");
	         }
}
    class Aud extends Mycar{
	
    	void cost() {
			System.out.println("10 lakhs");
			
		}
		
		void milage() {
			System.out.println("20km/hr");
			
		
		}
	}
   
	 class BMWw extends Mycar{		
			void cost() {
				System.out.println("20lakhs");	
		}
		
		void milage() {
			System.out.println("28km/hr");		
		}
	}
public class Abstract_1 {

	public static void main(String[] args) {
		Mycar obj;
		obj= (Mycar)new Aud ();
		obj.cost();
		obj.milage();
		obj= (Mycar)new BMWw();
		obj.cost();
		obj.milage();

	}
}

	