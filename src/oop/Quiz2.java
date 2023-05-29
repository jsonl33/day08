package oop;

import java.util.Scanner;

public class Quiz2 {
	public static String[] threeNames() {
		Scanner sc = new Scanner(System.in);
		System.out.println("이름 3개 입력");
		String[] names = new String[3];
		
		for(int i = 0;i<names.length;i++) {
			names[i] = sc.next();
		}
		for(String x : names) {
			System.out.println(x);
		}
		return names;
	}
	public static void main(String[] args) {
		threeNames();
	}
}
