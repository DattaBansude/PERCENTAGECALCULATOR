package baisc.java;

import java.util.Scanner;
// to calculate the percentage of CBSC 
public class Exercise1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a total marks of subject");
		int total = sc.nextInt();
		System.out.println("Enter a marks sub1: ");
		float s1 = sc.nextFloat();
		System.out.println("Enter a marks sub2: ");
		float s2 = sc.nextFloat();
		System.out.println("Enter a marks sub3: ");
		float s3 = sc.nextFloat();
		System.out.println("Enter a marks sub4: ");
		float s4 = sc.nextFloat();
		System.out.println("Enter a marks sub5: ");
		float s5 = sc.nextFloat();
		
		 float marks = s1+s2+s3+s4+s5;
		System.out.println("Total marks you obtained "+marks);
		double total_marks = marks*100/(total*5);
		System.out.println("percentage:> "+total_marks +"%");
		
		
		
	}
}
