package optionalExercise;


abstract class Mobilestore{
	abstract void company();
	abstract void price();
	         void memory() {
	        	 System.out.println("occupying memory");
	         }
}
     class realme extends Mobilestore {
	
    	void company() {
			System.out.println(" mobile company realme");
			
		}
		
		void price() {
			System.out.println("128gb-11500rs");
			
		}
	}
   
	 class samsung extends Mobilestore{
		
		
			void company() {
				System.out.println("samsung");
				
			
		}
		
		void price() {
			System.out.println("4gb-10000rs");
			
			
		}
	
   }

public class abstract_3 {

	public static void main(String[] args) {
		Mobilestore M;
		realme obj=new realme();
		obj.company();
		obj.price();
		samsung obj1=new samsung();
		  obj1.company();
		  obj1.price();

	}

}
