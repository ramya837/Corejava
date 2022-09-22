package conceptbased;

class university{
	void announcement() {
		System.out.println(" btech Reguler exams starts from oct 3rd week");
		
		class Department{
			void prepare() {
				System.out.println("quetion paper takes 10 days time");
			}
		}
		Department cse=new Department();
		cse.prepare();
	}
}


public class method_inner_class {

	public static void main(String[] args) {
		university jntu=new university();
		jntu.announcement();
		

	}

}
