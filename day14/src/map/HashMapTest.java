package map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapTest {
	public static void main(String[] args) {
		// Student 타입의 키와 ArrayList<Integer>타입의 값을 짝짓는 자료구조 HashMap을 선언한다.
		HashMap<Student, ArrayList<Integer>> studentMap = new HashMap<>();
		// Student타입의 학생 객체 생성
		Student std1 = new Student(1, "한동석");
		Student std2 = new Student(2, "홍길동");
		Student std3 = new Student(1, "이순신");

		// asList(T ...) : 배열을 리스트로 변경시켜주는 메소드, 배열을 전달하지 않고 여러 개의 값을 전달해도 List로 리턴해준다.
		// Integer타입의 배열을 넣어도 되고 직접 때려 박아도 됨
		Integer[] arData = { 100, 90, 70 }; // Arrays.asList로 List타입으로 바꿔야함
		ArrayList<Integer> std1Scores = new ArrayList<>(Arrays.asList(arData));
		ArrayList<Integer> std2Scores = new ArrayList<>(Arrays.asList(20, 50, 60));
		ArrayList<Integer> std3Scores = new ArrayList<>(Arrays.asList(20, 50, 60));

		// 키값에 Student객체 value()에 점수 ArrayList를 짝짓어 자료구조화시킴
		//HashMap에 학생 2명의 정보와 각 시험 점수를 넣어준다.
		studentMap.put(std1, std1Scores);
		studentMap.put(std2, std2Scores);
		
		//equals()와 hashCode()를 재정의 한 후 결과를 직접 확인
//      System.out.println(std1.equals(std3));
//      System.out.println(std1.hashCode() == std2.hashCode());
//      System.out.println(std1.hashCode() == std3.hashCode());
//      System.out.println(studentMap.containsKey(std3));

		// 학생의 이름 변경
		// 이름 변경을 위해 key값을 수정하려고 KeySet() 이용
		// 하지만 Key값은 순서가 없으므로 순서 부여해주려고 iterator사용
		Iterator<Student> iter = studentMap.keySet().iterator();
		// hasNext()는 다음값이 없을 때까지 다음값 가져오는 메소드
		while (iter.hasNext()) {
			// Student 타입의 std에 iter.next()담음
			// iter.next는 Key값들이고 Key값들은 Student로했으니 가능
			Student std = iter.next();
			// 여기서 Key값 속 std의 Num과 수정하려는 값을 가진 std3의 숫자 비교
			if (std.getNum() == std3.getNum()) {
				// Key값 속 std의 set를 통해 학생3번의 이름으로 수정
				std.setName(std3.getName());
//            System.out.println(std.getName());
			}
		}

//      //학생 1번의 점수를 수정한다.
//      studentMap.put(std3, std3Scores);
//      System.out.println(studentMap);

//      빠른 for문(향상된 for문, forEach)

//      int[] datas = {3, 4, 5};
//      for(int data : datas) {
//         System.out.println(data);
//      }

		// 학생별 점수와 평균 점수, 총 점(values())
		//학생의 수만큼 배열 선언
		// 첫번째 학생, 두번째 학생 총합 점수 담을 배열
		int[] arTotal = new int[studentMap.size()];
		// 첫번째 학생, 두번째 학생 평균 점수 담을 배열
		double[] arAvg = new double[studentMap.size()];
		
		//전체 점수
		int total = 0;
		//전체 평균
		double avg = 0.0;
		// 학생 구분 인덱스
		int idx = 0;
		
		// studentMap의 값들을 scores에 담음, 이때 타입은 values()위에 커서 되면 나오니간
		//HashMap에서 점수에 대한 작업을 해야 하므로 KEY는 필요없다.
		//따라서 Value를 분리하여 Collection에 담아준다.
		//Collection은 여러개의 ArrayList를 담고 있다.
		// 붙여넣기해주기
		Collection<ArrayList<Integer>> scores = studentMap.values();
		// 첫번째 학생, 두번째학생 점수 뽑아냄
		for (ArrayList<Integer> scoreList : scores) {//각 학생의 점수를 scoreList에 담아준다.
			for (int score : scoreList) {// 각 학생의 점수들들에서 점수를 분리
				// 첫번째학생의 점수가 다 담기고, 두번째 학생의 점수가 다 담김
				arTotal[idx] += score;
				// 모든 학생의 점수 총합
				total += score;
				System.out.print(score + "\t");
			}
			// 학생들의평균
			arAvg[idx] = (double) arTotal[idx] / scoreList.size();
			// 소수점 2째짜리까지 String.format으로 담음
			// 문자열이므로 Double.parseDouble로 형변환
			arAvg[idx] = Double.parseDouble(String.format("%.2f", arAvg[idx]));
			// scoreList는 점수들이 담겨서 size가 3,
			avg = (double) total / (scoreList.size() * studentMap.keySet().size());
			avg = Double.parseDouble(String.format("%.2f", avg));

			System.out.println(arAvg[idx] + "\t" + arTotal[idx]);
			// for(ArrayList<Integer> scoreList : scores)한번 반복시 idx가 커지므로
			// idx에 따라 학생 구분 가능해짐
			//학생 한명의 연산이 모두 끝나면 다음 학생으로 넘어가야 하기 때문에 idx에 +1해줌
			idx++;
		}

		// 전체 학생의 평균 점수보다 높은 학생을 찾아낸다(우수 학생으로 출력)
		// Key와 Valaue()를 동시에 가져올거기 때문에 entrySet을 쓰고
		// 순서를 부여하기 위해 iterator
		Iterator<Entry<Student, ArrayList<Integer>>> iterator = studentMap.entrySet().iterator();
		String msg = "";
		String names = "";
		// 쌍으로 가져온 studentMap의 다음 값이 없을때까지 가져옴,
		// 첫번째 학생, 두번째 학생 반복이 될거임
		while (iterator.hasNext()) {
			// Entry타입의 entry에 다음값들을 담음
			//점수로 학생의 이름을 가져와야 하기 때문에 KEY와 Value모두 필요하다.
			//이 때 entrySet()을 사용하여 한 쌍씩 모든 쌍을 가져온다.
			//이 때 각 쌍은 Entry타입이다.
			Entry<Student, ArrayList<Integer>> entry = iterator.next();
			
			// 초기화
			//학생의 총점
			int stdTotal = 0;
			//학생의 평균
			double stdAvg = 0.0;
			// entry에서 Value()들만 가져와서 점수에 담음
			
			//학생의 점수를 하나씩 score에 담고 stdTotal에 누계한다.
			for (int score : entry.getValue()) {
				// 학생의 총점
				stdTotal += score;
			}
			// 학생의 평균
			stdAvg = (double) stdTotal / entry.getValue().size();
			msg = "우수 장학생 명단\n";
			if (stdAvg > avg) {//학생의 평균점수가 전체 평균 점수보다 높다면
				// Key에서 getName으로 학생 이름 출력
				names = entry.getKey().getName() + "\n";
			}
		}
		
		if (!names.equals("")) {// 평균 점수보다 높은 학생이 한명이라도 있다면
			System.out.print(msg + names);
			// else이므로 없는경우
		} else {//우수 장학생이 없는 경우
			System.out.println("우수 장학생이 없습니다.");
		}
	}
}
