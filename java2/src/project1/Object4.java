package project1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

//배열 데이터 url : http://mekeyace.dothome.co.kr/product_db.txt
/*
 한국방송공사
 
 응용문제2
 해당 상품 리스트가 있습니다.
 첫번째 값은 상품코드 
 두번째 값은 상품명
 세번째 값은 상품가격 입니다.
 
 사용자가 상품을 선택합니다. 선택한 상품은 장바구니 배열로 추가되어야 
 하며 사용자가 선택한 상품 총 금액을 출력하시면 됩니다.
 단, 상품을 중복 입력할 수 있으며, 장바구니는 최대 6개까지 담을 수 있습니다.
 "종료" 라고 입력시 장바구니 입력은 더 이상 실행 되지 않습니다.
 출력예시)
 총 상품은 4개이며, 총 금액은 139,000원 입니다.
 */
public class Object4 {

	public static void main(String[] args) {
		ob2 o = new ob2();
		o.data2();

	}

}
class ob2{
	ArrayList<Object[]> al;
	Object data[][];
	public void data2() {
		this.data = new Object[][] {
				{1,"니베아 데오드란트",35000},
				{2,"파스퇴르 바른목장",17000},
				{3,"해남 꿀고구마",15300},
				{4,"프리미엄 생 칵테일 새우",22370},
				{5,"쉬슬러 고농축 액체세제",16620},
				{6,"믹시 삐비 미니캐리어",99500}
		};
		this.al = new ArrayList<>(Arrays.asList(this.data));
		//System.out.println(Arrays.toString(this.al.get(0)));
		
		Scanner sc = new Scanner(System.in);
		ArrayList<Object> al = new ArrayList<>();
		
		int w = 0;
		String pro = null;
		Integer sum = 0;	
		while(w < 6) {
			System.out.println("주문할 상품을 입력하세요");
			pro = sc.next();
			al.add(pro);
			//sum += Integer.valueOf(al.get(w)[3]);
			w++;
		}
		System.out.println(al);
		
		
	}
}
