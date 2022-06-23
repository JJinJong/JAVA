package collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserField {
	// 회원을 저장할 자료구조 선언, 이름 아이디 비밀번호 핸드폰번호
	//ArrayList도 되고 List로 업캐스탱해서 사용 가능
	public static List<User> users = new ArrayList<>();
	
	// 암호키
	private static final int KEY = 3;

	// 아이디 중복검사
	public static User checkId(String id) {
		User user = null;
		for (int i = 0; i < users.size(); i++) {
			if (users.get(i).getId().equals(id)) {
				user = users.get(i);
				break;
			}
		}
		return user;
	}

	// 회원가입
	public void join(User user) {
		user.setPw(encrypt(user.getPw()));
		users.add(user);
	}

	// 로그인
	public static User login(String id, String pw) {
		User user = null;
		for (int j = 0; j < users.size(); j++) {
			if (users.get(j).getId().equals(id) && users.get(j).getPw().equals(pw)) {
				user = users.get(j);
			}
		}
		return user;
	}

	// 비밀번호찾기
	public static User findPassword(String id, String phone) {
		User user = null;
		for (int j = 0; j < users.size(); j++) {
			if (users.get(j).getId().equals(id) && users.get(j).getPhoneNum().equals(phone)) {
				user = users.get(j);
			}
		}
		return user;
	}
	
	// 암호화
	public static String encrypt(String pw) {
		String en_pw = "";
		for (int i = 0; i < pw.length(); i++) {
			en_pw += (char) (pw.charAt(i) * KEY);
		}
		return en_pw;
	}
	
	//복호화
	public static String decrypt(String pw) {
		String de_pw = "";
		for (int i = 0; i < pw.length(); i++) {
			de_pw += (char) (pw.charAt(i) / KEY);
		}
		return de_pw;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String id = "";
		String pw = "";
		String phoneNum = "";
		String name = "";
		String mainMsg = "1.회원가입\n2.로그인\n3.비밀번호찾기\n4.나가기";
		int choice = 0;

		// 고객 정보 담을 user
		// 이름

		while (true) {
			System.out.println(mainMsg);
			choice = sc.nextInt();
			if (choice == 4) {
				break;
			}

			switch (choice) {
			case 1:
				User user = new User();
				System.out.println("이름을 입력해주세요");
				name = sc.next();
				//user에 이름 넣기
				user.setName(name);

				System.out.println("아이디를 입력해주세요");
				id = sc.next();
				//기존 고객에 아이디 있으면  종료
				//null이면 중복 없으므로 다음 실행
				if (checkId(id) != null) {
					System.out.println("아이디가 중복됩니다.");
					break;
				}
				//user에 아이디 넣기
				user.setId(id);

				System.out.println("패스워드를 입력해주세요");
				pw = sc.next();
				//user에 암호화된 비밀번호 넣기
				user.setPw(encrypt(pw));

				System.out.println("핸드폰 번호를 입력해주세요");
				phoneNum = sc.next();
				//user에 핸드폰번호 넣기
				user.setPhoneNum(phoneNum);
				//List users에 user 담기
				//users 인덱스엔 user 클래스가 담김
				users.add(user);
				
				//회원가입 된 유저 체크
//				for (int j = 0; j < users.size(); j++) {
//					System.out.println(users.get(j).getId());
//				}

				break;

			case 2:
				System.out.println("아이디");
				id = sc.next();
				System.out.println("비밀번호");
				pw = sc.next();
				//암호화된 비밀번호를 넣었으므로 암호화하고 확인
				user = login(id, encrypt(pw));
				if (user == null) {
					System.out.println("아이디 또는 비밀번호가 틀립니다.");
				} else {
					System.out.println("로그인에 성공하셨습니다.");
				}
				break;

			case 3:
				System.out.println("아이디 입력");
				id = sc.next();
				System.out.println("핸드폰 번호 입력");
				phoneNum = sc.next();
				
				user = findPassword(id, phoneNum);

				if (user == null) {
					System.out.println("이것도 기억 못해요?");
				} else {
					System.out.println("패스워드"+decrypt(user.getPw()));
				}
				break;

			}
		}

	}
}
