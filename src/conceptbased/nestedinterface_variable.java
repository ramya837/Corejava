package conceptbased;

interface Parents{
	int age=40;

}
interface Childs extends Parents {
	int age=20;
}
class detailss implements Childss{
	void detailss() {
		System.out.println("parent age is="+Parents.age);
		System.out.println("child age is="+Childs.age);
	

	}

}

public class nestedinterface_variable {
	public static void main(String[] args) {
		detailss d=new detailss();
		d.detailss ();
	}
}
