package corejava;
class Doctor{
	float salary=300000;
}
class surgen extends Doctor{
	float salarybonus=20000;
}

public class Inheritance {

	public static void main(String[] args) {
		surgen R=new surgen();
		System.out.println("salary of surgen"+R.salary);
		System.out.println("salarybonus"+R.salarybonus);

	}

}
