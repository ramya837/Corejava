package corejava;
 class Ramya{
	 String home;
	 String tv;
	 int time;
	 int price;
	 Ramya(){
		String home="dream home";
		String tv="tv channel";
		System.out.println("dream home");
		System.out.println("tv channel");
		System.out.println("time");
		System.out.println("price");
	 
	 }
	 void control() {
		 System.out.println("dream home" +"tv channel");
	 }
 }
public class Core_constructor {

	public static void main(String[] args) {
		Ramya R=new Ramya();
		    R.control();

	}

}
