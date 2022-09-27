package optionalExercise;
  class Cartoon{
	  String name;
	  int price;
	  Cartoon(){
		   name="Disney";
		   price=500;
	  }
  
  void trade() {
	  System.out.println("name of the doll="+name);
	  System.out.println("price of the doll="+price);
  }
	  
  }
  

public class constructor_op {

	public static void main(String[] args) {
		Cartoon S=new Cartoon();
		S.trade();

	}

}
