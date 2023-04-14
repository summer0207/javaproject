package java1;

import java.util.Scanner;

public class index14 {
	//할인율 구하는 공식 방법
	public static void main(String[] args) {
		int money = 10000;
		int coupon = 20;
		double a = coupon * 0.01;
		double b = money * a;
		double c = money - b;
		
		//(int)란 double 자료형 변환 시킬때 사용
		int total = (int)Math.round(c);
		
		//한줄 라인으로 표현
		//double sum = money-(money * (coupon * 0.01));
		System.out.println(total);
		
		/*
			응용문제4.
			총 상품금액이 50000원 입니다.
			사용자에게 "할인 쿠폰을 얼마를 적용할까요?"라는 질문과 함께
			숫자를 받습니다. 결과값으로 사용자가 적용한 할인율을 최종 상품금액으로
			출력하시오.
			예시)
			총 상품금액 50000 할인 쿠폰을 얼마를 적용할까요?
			20
			최종 상품금액은 40000원 입니다.
		*/
		
		Scanner mo = new Scanner(System.in);
		System.out.println("총 상품금액 50000 할인 쿠폰을 얼마 적용할까요?");
		int money2 = 50000;
		int coupon2 = mo.nextInt();
		double a1 = coupon2 * 0.01;
		double b1 = money2 * a1;
		double c1 = money2 - b1;
		
		int total2 = (int)Math.round(c1);
		//int total2 = money2-(int)(Math.round(money2*(coupon2*0.01)));
		System.out.printf("최종 상품 금액은 %d 원입니다.",total2);
		
		mo.close();

	}

}
