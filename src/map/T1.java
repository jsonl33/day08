package map;

import java.util.HashMap;

public class T1 {
	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<>();
		map.put("num", "100");
		map.put("name", "홍길동");
		map.put("addr", "산골짜기");
		
		System.out.println(map);
	}
}
