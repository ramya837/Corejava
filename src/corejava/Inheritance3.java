package corejava;

import java.util.Scanner;
 class square{
	 int a;
	 Scanner sc=new Scanner(System.in);
	 void input() {
		 System.out.println("enter a value");
		 a=sc.nextInt();
	 }
 
 void square() {
	 System.out.println("square="+(a*a));
 }
 }
 class Addition extends square{
	 int b;
	 void accept() {
		 System.out.println("enter b value");
		 b=sc.nextInt();
		 
	 }
	 void add () {
		 System.out.println("sum"+(a+b));
		 
	 }
 }

public class Inheritance3 {

	public static void main(String[] args) {
		Addition aa=new Addition();
		         aa.input();
		         aa.square();
		         aa.accept();
		         aa.add();

	}

}
 
