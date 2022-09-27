package conceptbased;

import java.util.Scanner;

public class arrey_sumofelements {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[];
		a=new int[5];
		Scanner sc=new Scanner(System.in);
		for (int i=0; i<5;i++) {
			System.out.println("enter arrey elements");
			a[i]=sc.nextInt();
		}
		int sum =0;
		for(int i=0; i<5;i++) {
		sum=sum+a[i];
	}
	System.out.println("sum="+sum);
	}
		
				

	}


