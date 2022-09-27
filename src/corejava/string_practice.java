package corejava;

import java.nio.Buffer;

public class string_practice {

	public static void main(String[] args) {
		String R="hello ramya ";
		R.concat(" indian girl ");
		System.out.println(R);
		String s="hello";
		String B=s.concat("indian girl");
		System.out.println(s);
		System.out.println(B);
		
		
		
		String M="indian girl";
		System.out.println(M.equals("indian girl"));
		String M1="Indian girl";
		System.out.println(M1.equalsIgnoreCase("Indian girl"));
		
		
		String N="LOL";
		System.out.println(N.charAt(1));
		
		String l="LOL";
		System.out.println(l.contains("1"));
		   
		String q="ramya indian girl ";
		System.out.println(q.contains("india"));
		
        String r="ramya indian girl";
        System.out.println(r.contains("pakisthan"));
        
        String m="welocome to telanana";
        System.out.println(m.substring(9));
        System.out.println(m.substring(9,11));
        
        String f="welcome to indian girl to telangana";
        System.out.println(f.toUpperCase());
        System.out.println(f.toLowerCase());
        
        String h="    welocome";
        System.out.println(h.trim());
        
        
        
        
        
				
		 
	}

	private static void constant() {
		// TODO Auto-generated method stub
		
	}

}
