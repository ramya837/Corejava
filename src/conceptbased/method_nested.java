package conceptbased;
class MISTcollege{
	Department cse=new Department();
    void announcement() {
		System.out.println(" btech Reguler exams starts from oct 3rd week");
		cse.prepare();
    }
		class Department{
			void prepare() {
				System.out.println("quetion paper takes 10 days time");
			}
		}
}

public class method_nested {

	public static void main(String[] args) {
		MISTcollege jntu=new MISTcollege();
		jntu.announcement();
	}

	}


