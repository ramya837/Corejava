package Theambased;

public class String_theme {

	public static void main(String[] args) {
		String s="hello";
		s.concat("PowerINDUSTRIES");
		System.out.println("________________PowerINDUSTRIES____________");
        String k=s.concat("________________substation____________________");
        System.out.println(s);
        System.out.println(k);
        String S="hello.";
        System.out.println(S.equals("......high power load....."));
        System.out.println(S.equals("....power load 1000kw...."));
        System.out.println(S.equalsIgnoreCase(".......in sub station 133/11kv....."));
        String c="hello";
        System.out.println(c.charAt(1));
        String R="rithwik";
        System.out.println(S.contains("1"));
        String b="Total power produced from the industries";
        System.out.println(b.contains("total power"));
        System.out.println(b.contains(""));
        String n="power stations are basically two types conventional ,non-conventional";
        System.out.println(n.substring(5));
        System.out.println(n.substring(30));
        String L="total power produced at power industries";
        System.out.println(L.toUpperCase());
        

	}

}
