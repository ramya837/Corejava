package conceptbased;
class Designer{
	int eid;
	double salary;
	Designer(int eid,double salary){
		this.eid=eid;
		this.salary=salary;
	}
	void show() {
		System.out.println("id="+eid);
		System.out.println("salary="+salary);
	}
}
public class ThisDemo {

	public static void main(String[]args) {
		Designer charlee=new Designer(19202,30000);
		  System.out.println(charlee);
		  charlee.show();
		  Designer xyz= new Designer(19203,33000);
		  xyz.show();
		

	}

}
