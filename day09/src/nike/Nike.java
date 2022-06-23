package nike;

public class Nike {
	
	public String branchName;
	
	void reigster (int num, String order, Form form) {
		String[] menus = form.getMenu();
		System.out.println("====="+branchName+"의류 메뉴=====");
		for (int i = 0; i < menus.length; i++) {
			System.out.println(i+1+menus[i]);
		}
		if(num == 1) {
			System.out.println("무료나눔합니다.");
		}else {
			form.sell(order);
		}
	}
//	void reigster (int num, String order, Form form) {
//		String[] menus = form.getMenu();
//		System.out.println("====="+branchName+"의류 메뉴=====");
//		for (int i = 0; i < menus.length; i++) {
//			System.out.println(i+1+menus[i]);
//		}
//		if(num == 1) {
//			System.out.println("무료나눔합니다.");
//		}else {
//			form.sell(order);
//		}
//	}
	
}
