package conceptbased;

class Employee{
	int id;
	double salary;

	Employee(){
		id=202;
		salary=20000;
	}
     
	void show() {
    	  System.out.println("id="+id);
    	  System.out.println("salary="+salary);
      }
	}

public class Constructordemo {

	public  void main(String[] args) {
		
		Employee R=new Employee();
		R.show();
	
	
}

}



