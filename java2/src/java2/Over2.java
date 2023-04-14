package java2;

import java.util.Arrays;
import java.util.Scanner;

public class Over2 {
	//메인 실행	//class : Over1 ,method : userlist (String), 변수명:list
	public static void main(String[] args) {
		myinfo m = new myinfo();
		Scanner sc = new Scanner(System.in);
		System.out.println("사용자 이름 검색:");
		String nm = sc.next();
		sc.close();
		m.userlist(nm);
	}
}

class myinfo extends Over1{
	int money2;	//추가변수 (오버로딩)
	int ea;
	@Override
	public void userlist(String username) {
		super.userlist(username);
		//System.out.println(Arrays.toString(this.list[0]));
		//this.money2 = 25000;	//추가코드
		this.ea = this.list.length;
		int w = 0;
		while(w < this.ea) {
			if(this.list[w][0].equals(username)) {
				System.out.println(Arrays.toString(this.list[w]));
				break;
			}
			w++;
		}
		
		
	}
}
