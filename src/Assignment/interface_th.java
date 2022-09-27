package Assignment;


interface Electronics{
	void processor();
	void Ram();
	void os();
}
abstract class Laptop implements Electronics{
	abstract void harddrive();
	abstract void Intelcore();
}
 class Lenova extends Laptop{
	void harddrive () {
		System.out.println("the harddrive storage of lenovo is 500mg hdd");
	}
 void Intelcore(){
		System.out.println("lenova comes with core i5");
	}
 public void processor () {
	 System.out.println("the processor of lenova laptop is HM76 express");
 }
 public void Ram () {
	 System.out.println("the ram of lenova 2-7gb");
 }
	public void os() {
		System.out.println("the operating system of lenova is windows 10");
	}

	
 }
	abstract class Mobile implements Electronics {
		abstract void backcamera();
		abstract void sim();
	}
	     class Redmi9A extends Mobile{
		void backcamera() {
			System.out.println("the backcam 50megapxel");
		}
		void sim() {
		 System.out.println("dualsim");
		 	}
	    
		public void Ram() {
			System.out.println("2-6gb ram");
		}
		
		public void os() {
			System.out.println("10 MIUTI12");
		
		}
		
		public void processor() {
			System.out.println("the processor based on generation 5gb");
			
		}
	    
	   
	 }
	
public class interface_th {

	public static void main(String[] args) {
		Laptop IP;
		IP=new Lenova();
		    IP.harddrive();
		    IP.Intelcore();
		    IP.processor();
		    IP.Ram();
		    IP.os();
		    Mobile m;
		    m=new Redmi9A();
		    m.backcamera();
		    m.sim();
		    m.processor();
		    m.Ram();
		    m.os();

	}

}
