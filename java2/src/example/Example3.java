package example;

import java.util.Scanner;
/*
 응용문제 1.
 질문 "7000원 결제 하시겠습니까?" 라고 출력되며,
 숫자 1을 입력하면, "결제가 진행 됩니다."라고 출력 후 프로세서는
 종료 됩니다. 숫자 2를 입력하면 "결제가 취소되었습니다"라고 출력 후 
 동일하게 프로세서가 종료됩니다.
 */
public class Example3 {
	
	final int money = 7000;
	Scanner se = new Scanner(System.in);	//가상으로 입력받는 클래스
	
	public static void main(String[] args) {
		Example3 ex = new Example3();
		ex.aaa();
	}
	
	public void aaa() {
		System.out.println(this.money+"원 결제 하시겠습니까?");
		int a = se.nextInt();
		//String일 경우 intern 또는 equals 해야만 조건을 확인할 수 있습니다.
		if(a == 1) {
			System.out.println("결제가 진행됩니다.");
			System.exit(0);
		}
		else if(a == 2) {
			System.out.println("결제가 취소되었습니다");
			System.exit(0);
		}
		se.close();
	}


}
