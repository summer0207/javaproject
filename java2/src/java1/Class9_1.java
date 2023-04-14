package java1;

import java.util.Scanner;

public class Class9_1 {

	public static void main(String[] args) {
		System.out.println("1.무지개룸 2.패밀리룸 3.달빛아래룸");
		Scanner sc = new Scanner(System.in);
		System.out.println("방번호를 입력하세요?");
		int number = sc.nextInt();
		if(number > 3) {
			System.exit(0);
		}
		int money = 0;
		switch(number) {
			case 1:
				money = 60000;
			break;
			case 2:
				money = 125000;
			break;
			case 3:
				money = 100000;
			break;
		}
		System.out.printf("%d 선택 가격은: %d원",number,money);
		System.out.println("30% 할인 쿠폰을 적용하시겠습니까?(y/n):");
		String result = sc.next().intern();
		if(result=="n") {
			System.out.println("결제하실 금액은"+money+"원");
		}
		else {
			/*
			double sales = money * 0.7;
			System.out.println(Math.round(sales));
			*/
			double n = 0.7;
			int sales = (int)Math.round(money * n);
			System.out.println(sales);
		}
	}

}
