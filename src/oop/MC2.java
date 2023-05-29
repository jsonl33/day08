package oop;

import java.util.Scanner;

public class MC2 {
	public static void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("두 수 입력");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int sum = num1+num2;
		System.out.println(num1+"+"+num2+"="+sum);
		sc.close();
	}
	public static void main(String[] args) {
		input();
	}
}
