package random;

import java.util.Random;

public class T1 {
	public static void main(String[] args) {
		for(int i = 0;i<5;i++) {
			double ran = Math.random();
			System.out.println(ran*3+","+(int)(ran*3));
		}
		for (int i = 0;i<5;i++) {
			int n = (int)(Math.random()*10+10);
			System.out.println(n);
		}
		
		Random rand = new Random();
		for(int i = 0;i<5;i++) {
			System.out.println(rand.nextInt(5));
		}
	}
}
