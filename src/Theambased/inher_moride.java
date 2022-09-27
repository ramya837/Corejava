package Theambased;
class Biomass2{
	void type() {
		System.out.println("no type");
	}

void require(){
	System.out.println("no type");
}
}
class divercity extends Biomass2 {
	void type() {
	System.out.println(" typen of the biomass wood");
}

void require() {
	System.out.println("using the biomass in 10000kgs");
}
}
class Controling extends Biomass2{
	void type() {
		System.out.println("type of the husk coconut");
		
	}

void require() {
	System.out.println("using 20000 kgs");
}
}

	 

public class inher_moride {

	public static void main(String[] args) {
		 Biomass2 Q=new Biomass2();
		  Q.type();
		 Q.require();
		 divercity D= new divercity();
		 D.type();	
		 D.require();
		 Controling p=new Controling ();
		  p.type();
		  p.require();

	}

}
