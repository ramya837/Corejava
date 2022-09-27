package optionalExercise;

public class String_op {

	public static void main(String[] args) {
		
		String s="hello";
		s.concat("world");
		System.out.println(".......s........");
        String k=s.concat("________________book store____________________");
        System.out.println(s);
        System.out.println(k);
        String S="hello.";
        System.out.println(S.equals("book price"));
        System.out.println(S.equals("....50rs...."));
        System.out.println(S.equalsIgnoreCase(".......drawing book....."));
        String c="hello";
        System.out.println(c.charAt(1));
        String R="ramya";
        System.out.println(S.contains("1"));
        String b="total price for drawing book,book";
        System.out.println(b.contains("pen"));
        System.out.println(b.contains(""));
        String n="shop at sathupalli for shopping books ,papers etc..";
        System.out.println(n.substring(8));
        System.out.println(n.substring(8,20));
        String L="complete the shopping in book store";
        System.out.println(L.toUpperCase());
        System.out.println(L.toLowerCase());
        String j="            complete the book store";
        		System.out.println(j.trim());
        String b1="welcome to! book store";
        
        String[]b11=s.split("welcom to!book store");
        for(String k1:b11) {
          System.out.println(k1);	
        }
        		
        
        

	}

}
