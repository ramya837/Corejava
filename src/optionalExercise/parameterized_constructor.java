package optionalExercise;
class Buying{
	int price;
	String color;
	Buying(int price , String color){
		this.price=100;
		this.color="white";
	}
	void sell() {
		System.out.println("book price="+price);
		System.out.println("book color="+color);
	}
}

public class parameterized_constructor {

	public static void main(String[] args) {
		Buying B=new Buying(100 , "weight");
		  System.out.println(B);
		  B.sell();
		  
		
		

	}

}
