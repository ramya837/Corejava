package corejava;
class Persondetails{
	int age;
	byte weight;
	float height;
	long Class;
	String name;
	String color;
	String gender;

}

public class variablesDemo {

	public static void main(String[] args) {
		Persondetails sam=new Persondetails();
		sam.age=22;
		sam.weight=30;
		sam.height=166.2f;
		sam.Class=11;
		sam.name="charlee";
		sam.color="white";
		sam.gender="male";
		System.out.println("sam.age="+22);
		  System.out.println("sam.weight="+30);                            
		  System.out.println("sam.height="+166.2f); 
		  System.out.println("sam.class="+11); 
		  System.out.println("sam.name="+"charlee"); 
		  System.out.println("sam.color="+"white"); 
		  System.out.println("sam.gender="+"male"); 

	}

}
