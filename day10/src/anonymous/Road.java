package anonymous;

import api.Calc;

public class Road {
	public static void main(String[] args) {
		Nike jamsil = new Nike();
		Nike gangnam = new Nike();
		jamsil.branchName = "잠실점";
		gangnam.branchName = "강남점";
							//주소값이니깐 폼타입 객체 들어가는거
		//익명클래스, 할당된 필드의 주소값으로 보자
		jamsil.register(new Form() {
			
			public void sell(String order) {
				String[] menus = getMenu();
				for (int i = 0; i < menus.length; i++) {
					if(menus[i].equals(order)) {
						System.out.println(order+"주문 완료");
					}
				}
			}
			
			public String[] getMenu() {
				String[] menus = {"티셔츠", "신발", "바지", "가방"};
				
				return menus;
			}
		});
		
		gangnam.register(new FormAdapter() {

			public String[] getMenu() {
				String[] menus = {"티셔츠", "신발", "바지", "가방"};
				return null;
			}
			
		});
	}
}
