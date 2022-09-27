package conceptbased;
class Sample<K>{
	void show(K a) {
		System.out.println(a);
	}
	
}

public class Generic_concept {

	public static void main(String[] args) {
		Sample<Integer>i=new Sample<Integer>();
		i.show(100);
		i.show(10);
		Sample<Double>d=new Sample<Double>();
		d.show(3.4);
		Sample<String>s=new Sample<>();
		s.show("hello");

	}

}
