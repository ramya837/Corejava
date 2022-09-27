package conceptbased;

import java.util.Scanner;

public class arrey_indexfactor {

	

	public static void main(String[] args) {
		int a[]=new int[5];
		Scanner sc = new Scanner(System.in);
		for (int i=0; i<5; i++) {
			System.out.println("enter array elements");
			a[i]=sc.nextInt();
		}
		for (int i=1; i<5; i++) {
			System.out.println("a[+i+]="+a[i]);
		}
	}

}
