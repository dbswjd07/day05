package test;

import java.util.Scanner;

public class Ex01 {
public static void main(String[] args) {
	Scanner input = new Scanner (System.in);
	
//	int num=0;
//	System.out.print("수 입력: ");
//	num=input.nextInt();
	
//	for(int i=1;i<=5;i++) {
//		System.out.println("*");
//		for(int j=1;j<=5;j++) {
//			System.out.print("*");
//		}
//	}
//	System.out.println();
	
//	for(int i=1;i<=5;i++) {
//		for(int j=1;j<=i;j++) {
//			System.out.print("*");
//			if(i==j) {
//				System.out.println();
//				break;
//			}
//		}
//		
//	}
	
	for(int i=1;i<=5;i++) {
		for(int j=1;j<=i;j++) {
			System.out.print("*");
		}
		System.out.println();
	}
	
	
//	for(int i=1;i<=5;i++) {
//		System.out.println("*");
//	}
	
}
}
