package java1;

import java.util.Scanner;

public class Class10 {

	public static void main(String[] args) {
		
		Login l = new Login();
		
	}

}
class Login{
	Scanner sc = new Scanner(System.in);
	int count = 0;
	public Login() {
		System.out.println("아이디를 입력하세요");
		String name = sc.next().intern();
		if(name !="hong") {
			System.out.println("가입되지 않은 사용자입니다.");
		}
		else {
			Login2();
		}
}
	public void Login2() {
		System.out.println("패스워드를 입력하세요");
		String pw = sc.next().intern();
		if(pw != "a123456") {
			count++;
			if(count == 3) {
				System.out.println("해당 아이디는 10분 후에 다시 로그인 하실 수 있습니다.");
				System.exit(0);
			}
			else {
				Login2();
			}
		}
		else {
			System.out.println("로그인 되었습니다");
		}
	sc.close();
	}
	
}
