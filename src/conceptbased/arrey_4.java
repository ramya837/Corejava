package conceptbased;

import java.util.Scanner;

public class arrey_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int primenum[]=new int[5];
		Scanner sc=new Scanner(System.in);
		for(int i=0; i<5; i++) {
		System.out.println("enter 5 prime number");
		primenum[i]=sc.nextInt();
	}
	
for(int p:primenum) {
	System.out.println(p);
}
}
}
