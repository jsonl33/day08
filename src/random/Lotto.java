package random;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class Lotto {
	public static void main(String[] args) {
		Random rand = new Random();
		
		ArrayList<Integer> arr = new ArrayList<>();
		for(int i = 0;i<6;i++) {
			int arrNum = 1+rand.nextInt(44);
			if(!arr.contains(arrNum)) {
				arr.add(arrNum);
			}else if(arr.contains(arrNum)) {
				i--;
			}
		}
		System.out.print("ArrayList: ");
		for(int i = 0;i<6;i++) {
			System.out.print(arr.get(i)+" ");
		}
		System.out.println();
		
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i = 0;i<6;i++) {
			int mapNum = 1+rand.nextInt(44);
			if(!map.containsValue(mapNum)) {
				map.put(i, mapNum);
			}else if(map.containsValue(mapNum)) {
				i--;
			}
		}
		System.out.print("HashMap: ");
		for(int i = 0;i<6;i++) {
			System.out.print(map.get(i)+" ");
		}
		System.out.println();
		
		HashSet<Integer> hSet = new HashSet<>();
		for(int i = 0;i<6;i++) {
			int hSetNum = 1+rand.nextInt(44);
			if(!hSet.contains(hSetNum)) {
				hSet.add(hSetNum);
			}else if(hSet.contains(hSetNum)) {
				i--;
			}
		}
		Iterator<Integer> it = hSet.iterator();
		System.out.print("HashSet: ");
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
		System.out.println();
	}
}
