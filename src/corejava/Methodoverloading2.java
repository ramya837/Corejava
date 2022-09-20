package corejava;
import java.util.Scanner;
class Add {
	void add(int x ,int y) {
		System.out.println("sum of two numbers="+(x+y));
	}
	void add(float x ,float y) {
		System.out.println("sum of two numbers="+(x+y));
	}
}

public class Methodoverloading2 {

	public static void main(String[] args) {
		
        try (Scanner SC = new Scanner ("System.in")) {
			Add s=new Add();
			  System.out.println("Enter two values");
			  s.add(SC.nextInt(),SC.nextInt( ));
			  s.add(SC.nextFloat(),SC.nextFloat());
		}
	

}
}
