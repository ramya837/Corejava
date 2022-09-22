package corejava;
class Tiger{
	void eat(){
		System.out.println("eating...");
		
		
	}
}
    class Puppy extends Animal {
    	void barking() {
    	System.out.println("barking...");
    	}
    }
    class babypuppy extends Puppy{
    	void sounds() {
    		System.out.println("meow....");
    	}
    }

public class Inheritance2 {

	public static void main(String[] args) {
		  babypuppy C=new babypuppy();
		   C.sounds();
		   C.barking();
		   C.eat();

	}

}
