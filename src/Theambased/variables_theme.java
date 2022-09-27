package Theambased;

class electricalequipment{
	String quality;
	String brand;
	float price;
	String color;
	static String model;
}

public class variables_theme {
	

	public static void main(String[] args) {
		electricalequipment rajasthan=new electricalequipment();
		  rajasthan.quality="good";
		  rajasthan.brand="no.1";
		  rajasthan.price=100;
		  rajasthan.color="gold";
		  electricalequipment.model="goldmedal";
		  System.out.println("switch quality is good");
		  System.out.println("switch brand is no.1");
		  System.out.println("switch price is=100rs");
		  System.out.println("switch color is gold");
		  System.out.println("switch model is goldmedal");
		  
	   

	}

}
