package conceptbased;
interface Parentss{
	int age=40;

}
interface Childss{
	int age=20;
}
class details implements Parentss,Childss{
	void details() {
		System.out.println("parent age is="+Parentss.age);
		System.out.println("child age is="+Childss.age);
	}
}
public class interface_variable {

	public static void main(String[] args) {
		details d=new details();
		d.details();

	}

}
