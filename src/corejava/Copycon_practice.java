package corejava;

public class Copycon_practice {
	  int a;
	  int b;
Copycon_practice(){
	System.out.println("give the values");
	
}
Copycon_practice(int m, int n){
	a=m;
	b=n;
	System.out.println("value of"+a);
	System.out.println("num is "+b);
	
}
 Copycon_practice(Copycon_practice c){
	 a=c.a;
	 b=c.b;
	 System.out.println("mar"+a);
	 System.out.println("this is"+b);
	 
 }
	public static void main(String[] args) {
	
		Copycon_practice b=new Copycon_practice();
		Copycon_practice ram=new Copycon_practice(2,3);
		Copycon_practice ram1=new Copycon_practice(ram);
		                

	}

}
