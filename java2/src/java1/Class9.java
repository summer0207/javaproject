package java1;

import java.util.Scanner;

public class Class9 {

	public static void main(String[] args) {
		
		Room r = new Room();

	}

}
class Room{
	Scanner no = new Scanner(System.in);
	public Room() {
		System.out.println("방번호를 입력하세요? \n 1.무지개룸 2.패밀리룸 3.달빛아래룸");
		int a = no.nextInt();
		String b;
		if(a == 1) {
			a = 60000;
			System.out.println("1.무지개룸 선택시 가격은 60000원 \n 30% 할인 쿠폰을 적용하시겠습니까?(y/n)");
			b = no.next().intern();
			if(b == "y") {
				Sale();
				int coupon = 30;
				double a1 = coupon * 0.01;
				double b1 = a * a1;
				double c1 = a - b1;
				
				int total = (int)Math.round(c1);
				System.out.println("30% 할인된 최종가격:"+total);
			}
			else {
				System.out.println("최종금액:"+a);
			}
		}
		else if(a == 2) {
			a = 125000;
			System.out.println("2.패밀리룸 선택시 125000원 \n 30% 할인 쿠폰을 적용하시겠습니가?(y/n)");
			b = no.next().intern();
			if(b == "y") {
				Sale();
				int coupon = 30;
				double a1 = coupon * 0.01;
				double b1 = a * a1;
				double c1 = a - b1;
				
				int total = (int)Math.round(c1);
				System.out.println("30% 할인된 최종가격:"+total);
			}
			else {
				System.out.println("최종금액:"+a);
			}
		}
		else if(a == 3) {
			a = 10000;
			System.out.println("3.달빛아래룸 선택시 10000원 \n 30% 할인 쿠폰을 적용하시겠습니가?(y/n)");
			b = no.next().intern();
			if(b == "y") {
				Sale();
				int coupon = 30;
				double a1 = coupon * 0.01;
				double b1 = a * a1;
				double c1 = a - b1;
				
				int total = (int)Math.round(c1);
				System.out.println("30% 할인된 최종가격:"+total);
			}
			else {
				System.out.println("최종금액:"+a);
			}
		}
	}
	public void Sale() {
		
	}
}