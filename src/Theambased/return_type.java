package Theambased;
class Powerproducing{
	void record() {
		System.out.println("details of employee name_age");
		System.out.println("details of his home town");
		
	}
	void entrypass(String id ,String fingerprint) {
		System.out.println("id="+id+"+fingerprint="+fingerprint);
	}

   String allowpass() {
	   return"allowpass";
   }
    String allowpass(int number) {
    	System.out.println("amount given="+number);
    	return"allowpass";
    }
}
public class return_type {

	public static void main(String[] args) {
		Powerproducing p=new Powerproducing();
		p.record();
		p.entrypass("id number:2345","fingerprint:12matched");
		System.out.println("allowpass"+p.allowpass());
		System.out.println("allowpass"+p.allowpass(2345));

	}

}
