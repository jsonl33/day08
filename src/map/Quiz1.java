package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Quiz1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String, Integer> menuMap = new HashMap<>();
		while (true) {
			System.out.println("1. 메뉴 등록");
			System.out.println("2. 메뉴별 가격 보기");
			System.out.println("3. 종료");
			System.out.print(">>> ");
			int sel = sc.nextInt();
			switch (sel) {
			case 1:
				System.out.println("등록할 메뉴의 이름과 가격을 입력해주세요.");
				String inputKey = sc.next();
				int inputVal = sc.nextInt();
				menuMap.put(inputKey, inputVal);
				System.out.println("등록이 완료되었습니다.\n");
				break;
			case 2:
				Set<String> keySet = menuMap.keySet();
				Iterator<String> keyIter = keySet.iterator();
				if (!menuMap.isEmpty()) {
					while (keyIter.hasNext()) {
						String hashKey = keyIter.next();
						System.out.println(hashKey + ": " + menuMap.get(hashKey));
					}
					System.out.println();

					int innerWhileSwitch = 0;
					while (innerWhileSwitch == 0) {
						System.out.println("1.수정 2.삭제 3.나가기");
						int innerSel = sc.nextInt();
						switch (innerSel) {
						case 1:
							System.out.println("수정할 메뉴를 입력해주세요.");
							String editKey = sc.next();
							if (menuMap.containsKey(editKey)) {
								System.out.println("수정할 가격을 입력해주세요.");
								int editVal = sc.nextInt();
								menuMap.put(editKey, editVal);
								System.out.println(editKey + " 메뉴의 가격이 수정되었습니다.\n");
							} else {
								System.out.println("존재하지 않는 메뉴입니다.\n");
							}
							break;
						case 2:
							System.out.println("삭제할 메뉴를 입력해주세요.");
							String removeKey = sc.next();
							if(menuMap.containsKey(removeKey)) {
								System.out.println(removeKey + "(이)가 삭제되었습니다.\n");
								menuMap.remove(removeKey);
							}
							else {
								System.out.println("존재하지 않는 메뉴입니다.");
							}
							break;
						case 3:
							innerWhileSwitch++;
							System.out.println("나가기\n");
						}
					}
				}else {
					System.out.println("등록된 메뉴가 없습니다.\n");
				}
				break;
			case 3:
				System.out.println("프로그램을 종료합니다.");
				sc.close();
				return;
			}
		}
	}
}
