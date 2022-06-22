package day04;

import java.util.Scanner;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

public class ArTask {
	public static void main(String[] args) {
		//브론즈
		//1~10까지 배열에 담고 출력
		//10~1까지 중 짝수만 배열에 담고 출력
		//1~100까지 배열에 담은 후 홀수만 출력
		
		//실버
		//1~100까지 배열에 담은 후 짝의 합 출력
		//A~F까지 배열에 담고 출력
		//A~F까지 C제외하고 배열에 담은 후 출력
		
		//골드
		//5개의 정수를 입력받고 배열에 담은 후 최대값과 최소값 출력
	      
	    //다이아
	    //사용자가 입력할 정수의 개수만큼 배열을 만든 후 정수를 입력받고 평균 구하기
	
		//브론즈
		//1~10
//		int []arData = new int [10];
//		
//		for (int i = 0; i < arData.length; i++) {
//			arData[i] = i+1;
//		}
//		for (int i = 0; i < arData.length; i++) {
//			System.out.println(arData[i]);
//		}
		//10~1중 짝수만
//		int []arData = new int [6];
//		for (int i = 0; i < arData.length; i++) {
//			arData[i] = i*2;
//		}
//		
//		for (int i = 0; i < arData.length; i++) {
//			System.out.println(arData[i]);
//		}
		
		//1~100까지 배열에 담고 홀수만 출력
//		int []arData = new int [100];
//		for (int i = 0; i < arData.length; i++) {
//			arData[i] = i + 1 ;
//		}
//		for (int i = 0; i < arData.length/2; i++) {
//			System.out.println(arData[i]*2-1);
//		}
		
		//실버
		//1~100까지 배열에 담은 후 짝수의 합 출력
		
		//A~F까지 배열에 담고 출력
//		char[]arData = new char[6];
//		for (int i = 0; i < arData.length; i++) {
//			arData[i] = (char)(i+65);
//			System.out.println(arData[i]);
//		}
		
		
		//다시 해보기
		//5개 입력받고
		int []arData = new int [5];
		int win = 0;
		int lose = 0;
		Scanner sc = new Scanner(System.in);
		for (int j = 0; j < arData.length; j++) {
			System.out.println(j+1+"번째"+"정수를 입력해 주세요");
			arData[j] = sc.nextInt();
		}
		
		for (int i = 0; i < arData.length-1; i++) {
			if(arData[i]>arData[i+1]) {
				win = arData[i];
			}else {
				win = arData[i+1];
			}
		}
		
		for (int i = 0; i < arData.length-1; i++) {
			if(arData[i]<arData[i+1]) {
				lose = arData[i];
			}else {
				lose = arData[i+1];
			}
		}
		System.out.println("최대값 : "+win+"최소값 : "+lose);
		
//		int [] arData = new int[5];
//		int [] results = new int[2];
//		Scanner sc = new Scanner(System.in);
//		for (int i = 0; i < arData.length; i++) {
//			System.out.println(i + 1 + "번째 정수 : ");
//			arData[i] = sc.nextInt();
//		}
//		//최대값
//		results[0] = arData[0];
//		//최소값
//		results[1] = arData[0];
//		
//		for (int i = 1; i < results.length; i++) {
//			if(results[0]<arData[i]) {results[0] = arData[i];}
//			if(results[1]>arData[i]) {results[1] = arData[i];}
//		}
//		
//		System.out.println("최대값 : "+results[0]);
//		System.out.println("최소값 : "+results[1]);
		
//		다이아
//		int []arData = null;
//		int choice = 0;
//		int sum = 0;
//		double avg = 0.0;
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("정수를 입력해 주세요");
//		choice = sc.nextInt();
//		
//		arData = new int [choice];
//		for (int i = 0; i < arData.length; i++) {
//			arData[i] = i+1;
//		}
//		for (int i = 0; i < arData.length; i++) {
//			sum += arData[i];
//		}
////			System.out.println(sum);
////			System.out.println(arData.length);
//			avg = (double)sum/arData.length;
//			
//		System.out.println("평균값 : "+avg);
		
		
		
		//브론즈
	      //1~10까지 배열에 담고 출력
//	      int[] arData = new int[10];
//	      for (int i = 0; i < arData.length; i++) {
//	         arData[i] = i + 1;
//	         System.out.println(arData[i]); 
//	      }
	            
	      //10~1까지 중 짝수만 배열에 담고 출력
//	      int[] arData = new int[5];
//	      for (int i = 0; i < arData.length; i++) {
//	         arData[i] = (5 - i) * 2;
//	         System.out.println(arData[i]);
//	      }
	      
	      //1~100까지 배열에 담은 후 홀수만 출력
//	      int[] arData = new int[100];
//	      for (int i = 0; i < arData.length; i++) {
//	         arData[i] = i + 1;
//	         if(arData[i] % 2 == 1) {
//	            System.out.println(arData[i]);
//	         }
//	      }
	      
	      //실버
	      //1~100까지 배열에 담은 후 짝수의 합 출력
//	      int[] arData = new int[100];
//	      int total = 0;
//	      
//	      for (int i = 0; i < arData.length; i++) {
//	         arData[i] = i + 1;
//	         if(arData[i] % 2 == 0) {
//	            total += arData[i];
//	         }
//	      }
//	      
//	      System.out.println(total);
	      
	      //A~F까지 배열에 담고 출력
//	      char[] arData = new char[6];
//	      for (int i = 0; i < arData.length; i++) {
//	         arData[i] = (char)(i + 65);
//	         System.out.println(arData[i]);
//	      }
	      //A~F까지 중 C 제외하고 배열에 담은 후 출력
//	      char[] arData = new char[5];
//	      for (int i = 0; i < arData.length; i++) {
//	         arData[i] = (char)(i > 1 ? i + 66 : i + 65);
//	         System.out.println(arData[i]);
//	      }
	      
	      //골드
//	      //5개의 정수를 입력받고 배열에 담은 후 최대값과 최소값 출력
//	      int[] arData = new int[5];
//	      int[] results = new int[2];
//	      
//	      Scanner sc = new Scanner(System.in);
//	      
//	      for (int i = 0; i < arData.length; i++) {
//	         System.out.print(i + 1 + "번째 정수 : ");
//	         arData[i] = sc.nextInt();
//	      }
//	      //최대값
//	      results[0] = arData[0];
//	      //최소값
//	      results[1] = arData[0];
//	      
//	      for (int i = 1; i < arData.length; i++) {
//	         if(results[0] < arData[i]) { results[0] = arData[i]; }
//	         if(results[1] > arData[i]) { results[1] = arData[i]; }
//	      }
//	      
//	      System.out.println("최대값 : " + results[0]);
//	      System.out.println("최소값 : " + results[1]);
//	      
	      
	      //다이아
	      //사용자가 입력할 정수의 개수만큼 배열을 만든 후 정수를 입력받고 평균 구하기
//		 Scanner sc = new Scanner(System.in);
//	      int length = 0;
//	      int[] arData = null;
//	      int total = 0;
//	      double avg = 0.0;
//	      
//	      System.out.println("몇 개의 정수를 입력하실 건가요?");
//	      length = sc.nextInt();
//	      arData = new int[length];
//	      
//	      for (int i = 0; i < arData.length; i++) {
//	         System.out.print(i + 1 + "번째 정수 : ");
//	         arData[i] = sc.nextInt();
//	         total += arData[i];
//	      }
//	      
//	      avg = (double)total / arData.length;
//	      System.out.println("평균 : " + avg);
	   
		}
	}











