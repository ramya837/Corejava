package conceptbased;


class SISTcollege{
   static class Department{
	   void preparation(){
	   System.out.println("quetion paper takes 10 days time");
    }
		
			static void announcement() {
				System.out.println("Exam starts on oct 20th");
			}
		}
}

public class method_Static {

	public static void main(String[] args) {
		SISTcollege.Department.announcement();
		SISTcollege.Department sd=new SISTcollege.Department();
		sd.preparation();
	}
	


	}



