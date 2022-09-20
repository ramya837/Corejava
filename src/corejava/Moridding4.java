package corejava;
class Dress2{
	void cost() {
		System.out.println("no cost");
	}

void color(){
	System.out.println("no color");
}
}
class silk extends Dress2 {
	void cost() {
	System.out.println("cloth cost 500rs");
}

void color() {
	System.out.println("5 meters length ");
}
}
class benurus extends Dress2{
	void cost() {
		System.out.println("benurus cloth cost 1000rs");
		
	}

void color() {
	System.out.println("4 meters of length");
}
}

public class Moridding4 {

	public static void main(String[] args) {
		Dress2 z=new Dress2();
		  z.cost();
		  z.color();
		  z=new silk();
		  z.cost();
		  z.color();
		  z=new benurus();
		  z.cost();
		  z.color();
		  

	}

}
