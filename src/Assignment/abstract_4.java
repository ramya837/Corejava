package Assignment;

abstract class Animals{
	abstract void lifespan();
	abstract void sounds();
	         void zoopark() {
	        	 System.out.println("Animals in Zoopark");
	         }
}
     class Dogs extends Animals{
	
    	void lifespan() {
			System.out.println(" dog lifespan -------60 weeks");
			
		}
		
		void sounds() {
			System.out.println("dog sounds-------bow bow");
			
		}
	}
   
	 class Cats extends Animals{
		
		
			void lifespan() {
				System.out.println("cat life span-------10years");
				
			
		}
		
		void sounds() {
			System.out.println("cat sounds----------meowwwwww meowwww");
			
			
		}
	
   }

public class abstract_4 {

	public static void main(String[] args) {
		Animals obj;
		Dogs D= new Dogs();
		D.lifespan();
		D.sounds();
		Cats C=new Cats();
		  C.lifespan();
		  C.sounds();
		

	}

}
