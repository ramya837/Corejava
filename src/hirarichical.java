

class R{
	int a=2;
	int b=10;
void m1() {
	System.out.println(a);
	System.out.println(b);
}
}
class S extends R{
	
	int c=4;
	int d=15;
	void m2() {
	System.out.println (a+c);
	System.out.println(b+d);
	}
	
}
class T extends S{
	int e=20;
	int f=8;
	void m3() {
		

		System.out.println(a+e);
		System.out.println(b+f);
	}
	}
public class hirarichical{
	
	

	public static void main(String[] args) {
	     S c=new S();
	       c.m1();
	       c.m2();
	     T s=new T();
	       s.m1();
	      s.m3();

	}

}
