package corejava;
import java.util.Scanner;
class Dress{
	 String color;
	 Scanner sc=new Scanner(System.in);
	 void model() {
		 System.out.println("enter a value");
		 color=sc.next();
	 }

void Dress() {
	 System.out.println("Dress="+color);
}
}
class Clothe extends Dress{
	 String type;
	 void show() {
		 System.out.println("dress type ");
		 type=sc.next();
		 
	 }
	 void lookout () {
		 System.out.println("outlook"+(" color" + "type"));
		 
	 }
}

public class Fashion {

	public static void main(String[] args) {
		Clothe Cc=new Clothe();
        Cc.model();
        Cc.Dress();
        Cc=new Clothe();
      
        Cc.lookout();


	}

}
