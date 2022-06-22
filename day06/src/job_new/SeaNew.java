package job_new;

import java.util.Scanner;

public class SeaNew {

	public static void main(String[] args) throws Exception {
		
		User[] users = new User[3];
		users[0] = new User("진세종", 10*10000);
		users[1] = new User("박종혁", 100 * 10000);
		users[2] = new User("한재구", 1000 * 10000);
		
		String helloMsg ="어서오세요 약탈의 숲";
		String menuMsg ="1.진세종\n2.박종혁\n3.한재구\n4.나가기";
		String actionMsg ="1.일하기 2.약탈하기 3.나가기";
		int charNum = 0;
		int choice =0;
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println(helloMsg);
			System.out.println(menuMsg);
			charNum = sc.nextInt();
			
			if(charNum == 4) {break;}
			
			while(true) {
				System.out.println(actionMsg);
				choice = sc.nextInt();
				if(choice == 3) {break;}
				
				User user = users[charNum-1];
				
				switch(choice){
				 	case 1:
				 		user.curJob.income();
				 		System.out.println("열심히 일을 하는 중입니다.");
				 		Thread.sleep(500);
				 		System.out.println(user.curJob.reward + "을 벌었습니다.");
				 		System.out.println(user.money+"원을 보유 중입니다");
				 		if(user.changeJob()) {
				 			System.out.println(user.preJob.type + "에서 " + user.curJob.type + "으로 바뀌었습니다.");
				 		}
				 		break;
				 	case 2:
				 		System.out.println("약탈을 하는 중입니다.");
				 		Thread.sleep(500);
				 		if(user.curJob.plunder()) {
				 			System.out.println("약탈에 성공하였습니다.");
				 			System.out.println((user.curJob.reward * 10) + "만큼 약탈하였습니다.");
				 		}else {
				 			System.out.println("약탈에 실패하였습니다.");
				 			System.out.println("가진돈을 모두 잃었습니다.");
				 		}
				 		System.out.println(user.money+"원을 보유 중입니다.");
				 		
				 		if(user.changeJob()) {
				 			System.out.println(user.preJob.type + "에서 " + user.curJob.type + "으로 바뀌었습니다.");
				 		}
				 		
				 		break;
				 	case 3:
				 		
				 		break;
				
				}
			}
			
		}
	}	
	
}
