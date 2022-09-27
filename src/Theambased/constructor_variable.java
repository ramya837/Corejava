package Theambased;
 class Powerproduced{
	 String water;
	 String plantname;
	 String coal;
	 
	 Powerproduced(){
		 water="water consumption 112";
		 plantname="rithwik";
		 coal="coal in kgs 15";
	 }
	 void show() {
		 System.out.println("water="+water);
		 System.out.println("plantname="+plantname);
		 System.out.println("coal="+coal);
	 }
	 }

public class constructor_variable {

	public static void main(String[] args) {
		Powerproduced R=new Powerproduced();
		      R.show();
		      

	}

}
