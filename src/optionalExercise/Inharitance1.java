package optionalExercise;
class Animal{
	void eat() {
		System.out.println("eating..............");
	}
}

    class Dog extends Animal{
    	void bark(){
    	System.out.println("barking...............");
    	}
    }
    
public class Inharitance1 {

	public static void main(String[] args) {
	  Dog A=new Dog();
	  A.bark();
	  A.eat();

	}

}
