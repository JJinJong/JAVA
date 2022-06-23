package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamTask {
	public static void main(String[] args) {
		//1~10까지 ArrayList에 담고 출력
//		List<Integer> datas = new ArrayList<>();
//		IntStream.range(0, 10).forEach(c->datas.add(c+1));
//		System.out.println(datas);
		
		//1~100까지 중 짝수만 ArrayList에 담고 출력
//		IntStream.range(0, 100).filter(c -> c % 2 == 0).forEach(c -> datas.add(c+2));
//		System.out.println(datas);
		
		//A~F까지 ArrayLIST에 담고 출력
////		String std ="ABCDEF";
//		List<Character> datas = new ArrayList<>();
//		IntStream.range(65, 70).forEach(c->datas.add((char)c));
////		std.chars().forEach(c->datas.add((char)c));
//		System.out.println(datas);
		
		//A~F까지 중 D 제외하고 ArrayList에 담은 후 출력
//		std.chars().filter(c-> c != 68).forEach(c->datas.add((char)c));
//		System.out.println(datas);
		
		//5개의 정수를 입력받은후 ArrayLis에 담고 최대값과 최소값 출력(구글링)
//		Scanner sc = new Scanner(System.in);
//		List<Integer> datas = new ArrayList<>();
//		for (int i = 0; i < 5; i++) {
//			System.out.println(i+1+"번째 문자 입력");
//			datas.add(sc.nextInt());
//		}
//		
//		System.out.println(datas.stream().max(Integer::compare));
//		System.out.println(datas.stream().min(Integer::compare));
		
		
		//문자열을 5개 입력받고 모두 소문자로 변경
//		String msg ="문자를 5번 입력 해주세요";
//		String msg1 ="";
//		System.out.println(msg);
//		List<String> datas = new ArrayList<>();
//		for (int i = 0; i < 5; i++) {
//			msg1 = i+1+"번 째 문자" ;
//			System.out.println(msg1);
//			datas.add(sc.next());
//		}
//		datas.stream().map(String::toLowerCase).forEach(System.out::println);
		
		//Apple, banana, Melon중 첫번째 문자가 대문자인 문자열 출력
//		List<String> datas = new ArrayList<>(Arrays.asList("Apple", "banana", "Melon"));
//		datas.stream().filter(c -> c.charAt(0) >= 65 && c.charAt(0) <= 90).forEach(System.out::println);
		
		//한글을 정수로 변경
		List<Integer> hangle = new ArrayList<>();
		String hangleList ="공일이삼사오육칠팔구";
		String gethangle ="일공이팔";
		String result = "";
		//List에 담아서
//		IntStream.range(0, 4)
//		.forEach(c -> hangle.add(hangleList.indexOf(gethangle.charAt(c))));
//		System.out.println(hangle);
		
		//바로 출력
		IntStream.range(0, 4)
		.map(c -> c=hangleList.indexOf(gethangle.charAt(c)))
		.forEach(System.out::print);
	}
	
}
