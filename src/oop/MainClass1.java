package oop;

public class MainClass1 {
	public static void main(String[] args) {
		int a;
		T1 num = new T1();
		num.age = 10;
		num.name = "홍길동";
		
		System.out.println("이름: "+num.name);
		System.out.println("나이: "+num.age);
	}
}
