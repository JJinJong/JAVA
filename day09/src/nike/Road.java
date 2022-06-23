package nike;

import java.util.Scanner;

public class Road {
	public static void main(String[] args) {
		Nike jamsil = new Nike();
		jamsil.branchName = "잠실점";

		Scanner sc = new Scanner(System.in);
		String order ="";
		
//		jamsil.reigster(1, order, new Form() {
//
//			@Override
//			public void sell(String order) {
//				String[] menus = getMenu();
//				for (int j = 0; j < menus.length; j++) {
//					if (menus[j].equals(order)) {
//						System.out.println(order + "주문 완료");
//					}
//				}
//			}
//
//			@Override
//			public String[] getMenu() {
//				String[] menus = { "셔츠", "바지", "모자", "티셔츠", "코트" };
//				return menus;
//			}
//		});

		Nike mokdong = new Nike();
		mokdong.branchName = "목동";
		mokdong.reigster(2, order, new Form() {
			
			@Override
			public void sell(String order) {
				String[] menus = getMenu();
				order = sc.next();
				for (int j = 0; j < menus.length; j++) {
					if (menus[j].equals(order)) {
						System.out.println(order + "주문 완료");
					}
				}
			}
			
			@Override
			public String[] getMenu() {
				String[] menus = { "셔츠", "바지", "모자", "티셔츠", "코트" };
				return menus;
			}
		});
		
	}

}
