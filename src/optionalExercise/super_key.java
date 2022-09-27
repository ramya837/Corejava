package optionalExercise;


class carpentor{
	 String name="abhi";
}
class child extends carpentor{
	 String name="akhash";
	 void details() {
		 System.out.println("parent name is="+super.name);
		 System.out.println("child name is="+name);
		 
	 }
}

public class super_key {

	public static void main(String[] args) {
		child x=new child();
		x.details();

	}

}


