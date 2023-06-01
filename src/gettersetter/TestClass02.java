package gettersetter;

import java.util.Scanner;

public class TestClass02 {
	private String name, grade;
	private int kor, eng, math, sum;
	private double avg;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}



	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("이름, 국, 영, 수 점수 입력");
		String name = sc.next();
		setName(name);
		int kor = sc.nextInt();
		setKor(kor);
		int eng = sc.nextInt();
		setEng(eng);
		int math = sc.nextInt();
		setMath(math);
		sc.close();
	}
	
	public void cal() {
		int kor = getKor();
		int eng = getEng();
		int math = getMath();
		
		int sum = kor+eng+math;
		setSum(sum);
		
		int avg = sum / 3;
		setAvg(avg);
		
		if(avg >= 90) {
			setGrade("A");
		}
		else if(avg >= 80) {
			setGrade("B");
		}
		else {
			setGrade("C");
		}
	}
	
	public void show() {
		System.out.println(name);
		System.out.println(kor);
		System.out.println(eng);
		System.out.println(math);
		System.out.println(sum);
		System.out.println(avg);
		System.out.println(grade);
	}
}
