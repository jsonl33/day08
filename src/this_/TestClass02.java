package this_;

import java.util.Scanner;

public class TestClass02 {
	public String name, grade;
	public int kor, eng, math, sum;
	public double avg;
	
	public void input() {
		Scanner input = new Scanner(System.in);
		System.out.println("이름, 국어, 영어, 수학 점수 입력");
		this.name = input.next();
		this.kor = input.nextInt();
		this.eng = input.nextInt();
		this.math = input.nextInt();
		input.close();
	}
	
	public void sum() {
		int kor = this.kor;
		int eng = this.eng;
		int math = this.math;
		this.sum = kor + eng + math;
	}
	
	public void average() {
		int kor = this.kor;
		int eng = this.eng;
		int math = this.math;
		this.avg = (kor + eng + math) / 3;
	}
	
	public void show() {
		System.out.println("이름: "+this.name);
		System.out.println("국: "+this.kor);
		System.out.println("영: "+this.eng);
		System.out.println("수: "+this.math);
		System.out.println("합: "+this.sum);
		System.out.println("평균: "+this.avg);
		System.out.println("등급: "+this.grade);
	}
	
	public void grade() {
		double avg = this.avg;
		if(avg >= 90) {
			this.grade = "A";
		}
		else if(avg >= 80) {
			this.grade = "B";
		}
		else {
			this.grade = "C";
		}
	}
	public class Main02 {
		public static void main(String[] args) {
			TestClass02 t = new TestClass02();
			t.input();
			t.sum();
			t.average();
			t.grade();
			t.show();
		}
	}
}
