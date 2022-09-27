package conceptbased;
class Swiggy{
	void menu() {
		System.out.println("on display bar 1.pizza 2.burger 3.frenchfries");
		
		
	}
	void placeorder() {
		System.out.println("order given is");
		
	}
	String getfood(String string) {
		return "pizza";
		
	}
	String paybill(int amount) {
		return "paid";
	}
}

public class Practice_return {

	public static void main(String[] args) {
	       Swiggy S=new Swiggy();
	           S.menu();
	
	           S.getfood("pizza");
	           System.out.println("food given by the delivery boy");
	           System.out.println("bill+S.PayBill(126)");

	}

}
