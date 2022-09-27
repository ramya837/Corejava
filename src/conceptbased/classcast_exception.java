package conceptbased;


class Mysql{
	static {
		System.out.println("my sql static block");
	}
}
public class classcast_exception {

	public static void main(String[] args)throws ClassNotFoundException {
		// TODO Auto-generated method stub
		System.out.println("Static method");
		Class.forName("mySql");
		

	}

}
