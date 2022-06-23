package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;

public class StreamTask {
	public static void main(String[] args) {
		//1~10까지 ArrayList에 담고 출력
//		ArrayList<Integer> datas = new ArrayList<>();
//		IntStream.rangeClosed(1, 10).forEach(i -> datas.add(i));
//		System.out.println(datas);
		
		//1~100까지 중 짝수만 ArrayList에 담고 출력
//		ArrayList<Integer> datas = new ArrayList<>();
//		IntStream.range(1, 51).forEach(i -> datas.add(i*2));
//		IntStream.range(1, 51).map(i -> i*2).forEach(i -> datas.add(i));
//		IntStream.range(1, 101).filter(i -> i % 2 == 0).forEach(i -> datas.add(i));
//		System.out.println(datas);
		
		//A~F까지 ArrayLIST에 담고 출력
//		ArrayList<Character> datas = new ArrayList<>();
//		IntStream.range(65, 71).forEach(i -> datas.add((char)i));
//		IntStream.range(0, 6).forEach(i -> datas.add((char)(i+65)));
//		System.out.println(datas);
		
		//A~F까지 중 D 제외하고 ArrayList에 담은 후 출력
//		IntStream.range(0, 5).map(i -> (i > 2 ? i+1 : i)).forEach(i -> datas.add((char)(i+65)));
//		System.out.println(datas);
		
		//5개의 정수를 입력받은후 ArrayLis에 담고 최대값과 최소값 출력(구글링)
//		ArrayList<Integer> datas = new ArrayList<>(Arrays.asList(10, 20, 50, 30, 40));
//		System.out.println(datas.stream().mapToInt(i -> i).max().getAsInt());
//		System.out.println(datas.stream().mapToInt(i -> i).min().getAsInt());
		
		
		//문자열을 5개 입력받고 모두 소문자로 변경
		//Apple, banana, Melon중 첫번째 문자가 대문자인 문자열 출력
		//한글을 정수로 변경
		
		//정수를 한글로 변경
		String hangle ="공일이삼사오육칠팔구";
		String data ="1028";
		System.out.println(hangle.charAt(1));
		data.chars().map(c ->  c - 48).forEach(c -> System.out.print(hangle.charAt(c)));
		data.chars().map(c -> hangle.charAt(c - 48)).forEach(System.out::print);
//		getnum.chars().map(c -> hangle.charAt(c)).forEach(System.out::print);
	
	}
}
