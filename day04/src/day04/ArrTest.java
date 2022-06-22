package day04;

public class ArrTest {
	public static void main(String[] args) {
		int [][] arrData = {{3, 4, 5, 6}, {8, 9, 0, 9},{1, 2, 3, 4}};
		int length = arrData.length*arrData[0].length;
		
		
//		for (int i = 0; i < arrData.length; i++) {
//			for (int j = 0; j < arrData[i].length; j++) {
//				System.out.print(arrData[i][j]);
//			}
//			//줄바꿈
//			System.out.println();
//		}
		//전체 길이 12로 넣고 돌릴때
		for (int i = 0; i < length; i++) {
		//0123까지 0 , 4567까지 1, 891011까지 2
		//0,1,2,3, 0,1,2,3, 0,1,2,3, 반복
			System.out.print(arrData[i/4][i%4]);
			//인덱스 하나가 바뀔때마다 줄바꿈
			if((i+1)%4 == 0) {System.out.println();}
		}
	}
}
