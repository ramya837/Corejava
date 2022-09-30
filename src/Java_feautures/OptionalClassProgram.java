package Java_feautures;

import java.util.Optional;

public class OptionalClassProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String[]str=new String[5];
        str[0]="core";
        Optional<String>c= Optional.ofNullable(str[0]);
        if(c.isPresent()) {
        	System.out.println(str[0].length());
        	
        }else {
        	System.out.println("this is null");
        }
        System.out.println("statement-1");
        System.out.println("statement-2");
        System.out.println("statement-3");
        System.out.println("statement-4");
        System.out.println("statement-5");
        System.out.println("statement-6");
        System.out.println("statement-7");
        System.out.println("statement-8");
        System.out.println("statement-9");
        
	}

}
