package job;

import java.util.Scanner;

public class Sea {
	public static void main(String[] args) {
		Job[] job = new Job[3]; 
		job[0] = new Job(24, 5000, "진세종", "private");
		job[1] = new Job(39, 5000, "세종", "private" );
		job[2] = new Job(17, 5000, "종", "private");
		
		String helloMsg ="어서오세요 약탈의 숲";
		String menuMsg ="1.진세종\n2.세종\n3.종\n4.나가기";
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
				
				Job jobs = job[charNum-1];
				
				switch(choice){
				 	case 1:
				 		jobs.income();
				 		System.out.println("열심히 일을 해 돈을 벌었습니다.");
				 		System.out.println(jobs.money+"원을 보유 중입니다");
				 		System.out.println("귀하의 직업은 " + jobs.grade + "입니다.");
				 		break;
				 	case 2: 
				 		if(jobs.plunder()) {
				 			System.out.println("약탈을 하였습니다.");
				 		}else {
				 			System.out.println("약탈에 실패하였습니다.");
				 		}
				 		System.out.println(jobs.money+"원을 보유 중입니다.");
				 		System.out.println("귀하의 직업은 " + jobs.grade + "입니다.");
				 		break;
				 	case 3:
				 		
				 		break;
					
				
				}
				
			}
			
			
		}
		
	}	
}