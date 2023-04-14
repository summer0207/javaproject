package java2;

import java.util.Scanner;

public class Method13 {

	public static void main(String[] args) {
		gugudan2 gu = new gugudan2();
		gu.gugu();
		
	}

}
/* 
 응용문제 1.
 사용자가 구구단 숫자를 하나 입력합니다.
 세컨 개발자가 입력된 사항을 1~9까지 결과가 출력되는 
 구구단을 개발 합니다. 단, 상속 받은 메소드에서 처리되도록
 코드를 작성완료 하시오.
 결과 ) 검색할 구구단을 입력하세요? 5
 5*1 =5
 ...
 5*9=45
 */
class gugudan{
	protected int number;
	Scanner sc = new Scanner(System.in);
	
	public void gugu() {
		System.out.println("검색할 구구단을 입력하세요?");
	}
	public void result() {
		
	}
}
class gugudan2 extends gugudan{
	@Override
	public void gugu() {
		super.gugu();
		this.number = sc.nextInt();	//setter
		sc.close();
		result();
	}
	@Override
	public void result() {
		super.result();
		int w = 1;
		while(w < 10) {
			System.out.println(this.number + "*" + w + "=" + this.number*w);
			w++;
		}
	}
	
}