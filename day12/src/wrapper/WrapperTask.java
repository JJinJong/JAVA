package wrapper;

public class WrapperTask {
	public static void main(String[] args) {
		// 1, 3.5, 12.5F, 'A', "ABC", true
		// 위 6개의 값을 6칸 배열에 담기
		
//		int data_i = 1;
//		double data_d = 3.5;
//		float data_f = 12.5F;
//		char data_c = 'A';
//		boolean data_b = true;
//		
//		Integer data_1 = data_i;
//		Double data_2 = data_d;
//		Float data_3 = data_f;
//		Character data_4 = data_c;
//		String data_5 = "ABC";
//		Boolean data_6 = data_b;
		
//		Object[] aryData = new Object[6];
//			aryData[0] = data_1;
//			aryData[1] = data_2;
//			aryData[2] = data_3;
//			aryData[3] = data_4;
//			aryData[4] = data_5;
//			aryData[5] = data_6;
		
		Object[] aryData = {1, 3.5, 12.5F, 'A', "ABC", true};
		for (int i = 0; i < aryData.length; i++) {
			System.out.println(aryData[i]);
		}
		
	}
}
