package corejava;
 class parent{
	 int age=54;
 }
 class child extends parent{
	 int age=23;
	 void details() {
		 System.out.println("parent age is"+super.age);
		 System.out.println("child age is"+age);
		 
	 }
 }

public class SuperDemo {

	public static void main(String[] args) {
		child x=new child();
		x.details();

	}

}
