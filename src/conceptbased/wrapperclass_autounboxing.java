package conceptbased;

public class wrapperclass_autounboxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer i=new Integer(3000);
		Float weight=new Float(3.2f);
		String fruit=new String("papaya");
		Long num=new Long(1234567);
		
		
		int x=i;
		float w=weight;
		String s=fruit;
		long l=num;
		
		
		System.out.println("value"+i);
		System.out.println("weight"+w);
		System.out.println("fruit="+s);
		System.out.println("the num="+l);
		
		

	}

}
