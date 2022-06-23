package collection;

import java.util.HashSet;
import java.util.Iterator;

public class SetTest {
	public static void main(String[] args) {
		//Set 값의 유무 검사에 특화되어있는 자료구조 해시코드로 유무검사 진행 속도가 빠르다.
		//저장된 값들은 인덱스가 없기 때문에 순서가 없다.
		//중복되는 값 무시
		HashSet<String> fruitSet = new HashSet<>();
		fruitSet.add("수박");
		fruitSet.add("자두");
		fruitSet.add("자몽");
		fruitSet.add("망고");
		fruitSet.add("딸기");
		fruitSet.add("사과");
		//중복되는 수박은 중복안됨
		fruitSet.add("수박");
		fruitSet.add("수박");
		fruitSet.add("수박");
		
		System.out.println(fruitSet);
		//순서 부여하는 메소드
		//순서가 없는 객체에 순서를 부여하거나, 순서가 있어도 iterator 방식으로 순서 변경하고자 사용
		Iterator<String>iter = fruitSet.iterator();
		//hasNex()로 다음값이 있는지 검사하고
		while(iter.hasNext()) {
				//next()를 사용하여 값을 가져온다.
			System.out.println(iter.next());
		}
	}
}
