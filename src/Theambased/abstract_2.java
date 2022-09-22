package Theambased;


abstract class Mypowerstation{
	abstract void generates();
	abstract void voltage();
	         void time() {
	        	 System.out.println("generating start with certain time");
	         }
}
     class substationn1 extends Mypowerstation{
	
    	void generates() {
			System.out.println(" power generating in the station 133kw/hr");
			
		}
		
		void voltage() {
			System.out.println("220v/hr");
			
		}
	}
   
	 class substationn2 extends Mypowerstation{
		
		
			void generates() {
				System.out.println("power generating in the station 145kw/hr");
				
			
		}
		
		void voltage() {
			System.out.println("235kv/hr");
			
			
		}
	
   }
   public class abstract_2 {

	public static void main(String[] args) {
		Mypowerstation obj;
		obj= (Mypowerstation)new substationn1 ();
		obj.generates();
		obj.voltage();
		obj= (Mypowerstation)new substationn2();
		obj.generates();
		obj.voltage();

	}

}
