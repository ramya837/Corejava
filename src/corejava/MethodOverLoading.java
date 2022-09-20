package corejava;
import java.util.Scanner;

	class sum{
		void add (int x ,int y) {
			System.out.println("Integer sum="+(x+y));
	}
		void add (float x ,float y) {
			System.out.println("Decimal sum="+(x+y));
		}
	}
public class MethodOverLoading {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        sum obj=new sum();
        System.out.println("Enter two values");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Enter two values");
        float t=sc.nextFloat();
        float g=sc.nextFloat();
        obj.add(a, b);
        obj.add(t, g);
	}

}
