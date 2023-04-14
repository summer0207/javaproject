package java1;

import java.util.Scanner;

public class Class7 {
	//응용편 : 회원가입시 약관 동의 및 간편회원가입 진행
	
	public static void main(String[] args) {
		//해당 코드는 단 한줄로만 사용(외부클래스 기준으로 코드 작성)

		Join u = new Join();
	}
}
class Join{
	Scanner a = new Scanner(System.in);
	public Join() {
		System.out.println("회원가입 약관에 동의 하시겠습니까?(y/n)");
		String aa = a.next().intern();
		if(aa == "n") {
			System.out.println("회원가입이 취소 되셨습니다.");
		}
		else if(aa == "y") {
			Join2();
		}
	}
	public void Join2() {
		System.out.println("아이디를 입력하세요");
		String bb = a.next().intern();
		if(bb == "admin") {
			System.out.println("중복된 아이디입니다.");
			System.exit(0);
		}
		else {
			System.out.println("패스워드를 입력하세요");
			String cc = a.next().intern();
			System.out.println("가입자명을 입력하세요");
			String dd = a.next().intern();
			if(cc != "" && dd != "") {
				System.out.println("정상적으로 회원가입이 완료 되었습니다");
			}
			
		}
		a.close();
	}

}