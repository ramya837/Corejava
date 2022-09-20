package corejava;

public class Orange1 {
	 String color;
	 String taste;
	 Orange1(){
		 System.out.println("this fruit is");
		 
	 }
	 Orange1(String color , String text){
		  this.color=color;
		   this.taste=text;
		   System.out.println("this size of fruit");
		   System.out.println("this cost of fruit");
		   
		   
	 }Orange1(Orange1 O){
		 color=O.color;
		 taste=O.taste;	
		 System.out.println("go "+color);
		 System.out.println("gone"+taste);
		 }

		
	public static void main(String[] args) {
		Orange1 b=new Orange1();
		Orange1 b1=new Orange1("red","sweet");
		Orange1 b2=new Orange1(b1);


	}

}
