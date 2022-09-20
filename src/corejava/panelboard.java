package corejava;
class Controlstation{
	String display="red";
		
	
}
class Nameplate extends Controlstation{
	String display="red";
	
	void details() {
	 System.out.println("display color="+super.display);
	 
	}
	
}

public class panelboard {

	public static void main(String[] args) {
		Nameplate ram=new Nameplate();
		  ram.details();

	}

}
