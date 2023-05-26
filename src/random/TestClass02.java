package random;

import java.util.Scanner;

public class TestClass02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n1, n2;
		System.out.println("문자열 입력1");
		n1 = sc.nextLine();
		System.out.println("문자열 입력2");
		n2 = sc.nextLine();
		System.out.println(n1);
		System.out.println(n2);
		sc.close();
	}
}
