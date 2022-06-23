package file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileTask {
	public static void main(String[] args) throws IOException {
		//족발, 보쌈, 짜장면, 탕수육
		//food.txt파일을 현재 경로에 생성하고
		//파일 내용은 족발, 보쌈, 짜장면, 탕수육 네 가지 음식으로 작석한다.
		
//		BufferedWriter bw = new BufferedWriter(new FileWriter(new File("food.txt"),true));
//		
//		bw.write("족발\n보쌈\n짜장면\n탕수육");
//		bw.write("족발\n");
//		bw.write("보쌈\n");
//		bw.write("짜장면\n");
//		bw.write("탕수육\n");
//		
//		bw.close();
		
//		String line = null;
//		BufferedReader br = null;
//		
//		try {
//			br = new BufferedReader(new FileReader("food.txt"));
//			while((line = br.readLine()) != null) {
//				System.out.println(line);
//			}
//		} catch (Exception e) {
//			System.out.println("파일이 없습니다.");
//		} finally {
//			if(br != null) {
//				br.close();
//			}
//		}
		
		File f = new File("food.txt");
		if(f.exists()) {
			f.delete();
			System.out.println("삭제 성공");
		}
		
		
	}
}
