package conceptbased;


public class stringdemo {

	
	public static void main(String[] args) {
		String s="hello";
		s.concat("world");
		System.out.println(".......s........");
        String k=s.concat("________________world____________________");
        System.out.println(s);
        System.out.println(k);
        String S="hello.";
        System.out.println(S.equals("......hello......"));
        System.out.println(S.equals("....Hello...."));
        System.out.println(S.equalsIgnoreCase(".......Hello....."));
        String c="hello";
        System.out.println(c.charAt(1));
        String R="ramya";
        System.out.println(S.contains("1"));
        String b="wellcome to java string concept";
        System.out.println(b.contains("java"));
        System.out.println(b.contains("Phython"));
        String n="welcome back to java string concept";
        System.out.println(n.substring(8));
        System.out.println(n.substring(8,20));
        String L="welcome to java string";
        System.out.println(L.toUpperCase());
        
        		
        
        
        
	}

}
