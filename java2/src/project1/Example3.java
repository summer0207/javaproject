package project1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/*
 (주)CJ운송에서 테스트 코딩
 사용자가 8명 있습니다.
 각각의 사용자에게 포인트를 주어야 합니다. 다음 결과와 같이 나오도록 
 코드를 작성하시오.
 customer data : 서울 경기도 인천 대전 충북 충남 전북 전남
 
 "서울 님에게 포인트 추가 하시겠습니까?"
 ....
 
 "전남 님에게 포인트 추가 하시셌습니까?"
 
 무조건 숫자를 입력하며 숫자 외에 입력시 "포인트는 숫자만 입력합니다." 출력
 
 단 인천님 포인트 입력시 문자를 사용하여 오류 발생이 되면 다시
 "인천 님에게 포인트 추가 하시겠습니까?"라고 질문이 나와야합니다.
 
 최종결과 정보
 서울 : 500
 경기도 : 300
 인천 : 300
 ...
 */

public class Example3 {

	public static void main(String[] args) {
		bbox[] b = { new bbox(), new bbox()};
		b[0].pointload();
		b[1].pointload();
		

	}

}
abstract class point{
	public abstract void pointload();
}
class bbox extends point{
	Scanner sc = new Scanner(System.in);
	String data[] = {"서울","경기도","인천","대전","충북","충남","전북","전남"};
	ArrayList<String> aa = new ArrayList<>();
	@Override
	public void pointload() {
		//System.out.println(aa);
		int w = 0;
		int ea = data.length;
		//System.out.println(ea);
		try {
			while(w < ea) {
				System.out.println(Arrays.asList(data[w])+"님에게 포인트 추가 하시겠습니까?");
				int area = sc.nextInt();
				aa.add(data[w]+":"+area);
				w++;
			}
			
			int ww = 0;
			while(ww < ea) {
				System.out.println(aa.get(ww));
				ww++;
			}
			
		} catch (Exception e) {
			System.out.println("숫자만 입력하세여합니다.");
			
		}
		
		
	}
}
class bbox2 extends point{
	@Override
	public void pointload() {

		
	}
}