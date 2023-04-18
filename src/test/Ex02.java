package test;

import java.util.Scanner;

public class Ex02 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	int num1 , num2;
	
	System.out.print("가로 길이 입력: ");
	num1 = input.nextInt();
	System.out.print("세로 길이 입력: ");
	num2 = input.nextInt();
	System.out.println();
	
	for(int i = 1; i<=num2; i++) {
		for(int j=1; j<=num1; j++) {
			System.out.print("*");
		}
		System.out.println();
	}
	
}
}
