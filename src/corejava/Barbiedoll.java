package corejava;
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
  

public class Barbiedoll {

	public static void main(String[] args) {
		Cartoon S=new Cartoon();
		S.trade();

	}

}
