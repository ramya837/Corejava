package conceptbased;

import java.util.*;
class Arrays{
	int a[][]=new int [3][3];
	static Scanner s=new Scanner (System.in);
	void scan() {
		for(int i=0;i<a.length;i++) {
		for(int j=0;j<a.length;j++) {
		
		System.out.println("Enter values in array:");
		a[i][j]=s.nextInt();
	}
  }
}

void print() {
	for(int i=0; i<a.length;i++) {
	for(int j=0; j<a.length;j++) {
	System.out.print(" ["+a[i][j]+"]");
}
System.out.println();

  }
 }
}
public class array_2D {

	public static void main(String[] args) {
		
		Arrays c=new Arrays();
		c.scan();
		c.print();

	}

}
