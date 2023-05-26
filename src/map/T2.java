package map;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

public class T2 {
	public static void main(String[] args) {
//		HashMap<String, String> map = new HashMap<>();
		LinkedHashMap<String, String> map = new LinkedHashMap<>();
		map.put("선풍기", "100만원");
		map.put("에어컨", "10만원");
		map.put("자동차", "20만원");
		System.out.println(map);
		System.out.println("에어컨 가격 : "+map.get("에어컨"));
		
		System.out.println(map.keySet());
		System.out.println(map.values());
		System.out.println("==반복자==");
		Set<String> key = map.keySet();
		Iterator<String> it = key.iterator();
		while(it.hasNext()) {
			String k = it.next();
			System.out.println(k);
		}
	}
}
