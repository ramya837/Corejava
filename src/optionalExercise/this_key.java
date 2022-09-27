package optionalExercise;

public class this_key {
	 String color;
	 String taste;
	 this_key(){
		 System.out.println("this fruit is");
		 
	 }
	 this_key(String color , String text){
		  this.color=color;
		   this.taste=text;
		   System.out.println("this size of fruit");
		   System.out.println("this cost of fruit");
		   
		   
	 }this_key(this_key O){
		 color=O.color;
		 taste=O.taste;	
		 System.out.println("go "+color);
		 System.out.println("gone"+taste);
		 }

		
	public static void main(String[] args) {
		this_key b=new this_key();
		this_key b1=new this_key("red","sweet");
		this_key b2=new this_key(b1);


	}

}
