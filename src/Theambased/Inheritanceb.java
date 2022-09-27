package Theambased;
import java.util.Scanner;
class Biomass{
	 String type;
	 Scanner sc=new Scanner(System.in);
	 void input() {
		 System.out.println("using  biomass");
		 type=sc.next();
	 }

void input2() {
	 System.out.println("Biomass="+("using biomass"));
}
}
class Wood extends Biomass{
	 int kgs;
	 void input3() {
		 System.out.println("take the 100000 kilos of wood");
		 kgs=sc.nextInt();
		 
	 }
	 void input4 () {
		 System.out.println("sum"+("using wood as a biomass" + "take the 100000kilos of wood"));
		 
	 }
}

public class Inheritanceb {

	public static void main(String[] args) {
		Wood w= new Wood();
		     w.input();
		     w.input2();
		     w.input3();
		     w.input4();

	}

}
