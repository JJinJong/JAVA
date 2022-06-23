package collection;

import java.util.ArrayList;
import java.util.Scanner;

public class UserField2 {
	// 회원을 저장할 자료구조 선언, 이름 아이디 비밀번호 핸드폰번호
	public static ArrayList<User> users = new ArrayList<>();

	// 암호키
	private static final int KEY = 3;

	static Scanner sc = new Scanner(System.in);

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
	public static boolean join() {
		User user = new User();
		System.out.println("이름을 입력해주세요");
		user.setName(sc.next());

		System.out.println("아이디를 입력해주세요");
		String id = sc.next();
		if (checkId(id) != null) {
			System.out.println("아이디가 중복됩니다.");
			return false;
		}
		user.setId(id);

		System.out.println("패스워드를 입력해주세요");
		user.setPw(encrypt(sc.next()));

		System.out.println("핸드폰 번호를 입력해주세요");
		user.setPhoneNum(sc.next());

		users.add(user);
//		for (int j = 0; j < users.size(); j++) {
//			System.out.println(users.get(j).getId());
//		}
		return true;
	}

	public static boolean userLogin() {
		System.out.println("아이디");
		String id = sc.next();

		System.out.println("비밀번호");
		String pw = sc.next();

		User user = login(id, encrypt(pw));
		if (user == null) {
			return false;
		}
		return true;
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

	//
	public static String userFindPassword() {
		System.out.println("아이디 입력");
		String id = sc.next();
		System.out.println("핸드폰 번호 입력");
		String phoneNum = sc.next();

		User user = findPassword(id, phoneNum);
		if (user == null) {
			return null;
		}
		return decrypt(user.getPw());
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

	// 복호화
	public static String decrypt(String pw) {
		String en_pw = "";
		for (int i = 0; i < pw.length(); i++) {
			en_pw += (char) (pw.charAt(i) / KEY);
		}
		return en_pw;
	}

	public static void main(String[] args) {
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
				if (join()) {
					System.out.println("회원가입에 성공하였습니다.");
				}
				break;

			case 2:
				if (userLogin()) {
					System.out.println("로그인 성공");
				} else {
					System.out.println("아이디 또는 비밀번호를 잘못입력하셨습니다.");
				}
				break;

			case 3:

				String password = userFindPassword();
				if (password != null) {
					System.out.println("당신의 비밀번호는 " + password);
				} else {
					System.out.println("그것도 기억 못함?");
				}

			}
		}

	}
}
