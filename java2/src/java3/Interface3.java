package java3;

import java.util.Arrays;
import java.util.Scanner;

public class Interface3 {
	//user1.java, user2.java 응용편
	/*
	 응용문제2.
	 가입된 모든 사용자의 정보를 출력 합니다.
	 출력형태는 다음과 같습니다.
	 아이디:hong 고객명:홍길동 이메일:hong@nate.com 지역:서울시 영등포구
	 */
	public static void main(String[] args) {
//		Scanner se = new Scanner(System.in);
//		System.out.println("사용자 아이디를 입력하세요:");
//		String id2 = se.next();
//		se.close();
		ab7 ui = new ab7();
		ui.myinfo("");

	}

}
class ab7 implements user1{	
	//user2인터페이스는 로드하지 않음 
	//단, user2에 있는 필드 변수명을 별도로 호출 할 수 있음
	private int total;
	@Override
	public void myinfo(String userid) {
		//System.out.println(Arrays.toString(user1.userdata[0]));
		int count = 0;
		int total = dataea();
		int w = 0;
		while(w < total){
			System.out.printf("\n아이디:%s 고객명:%s 이메일:%s 지역:%s",user1.userdata[w][0],user1.userdata[w][1],user1.userdata[w][3],user2.infodata[w][2]);
			//if(userid.equals(user1.userdata[w][0])) {
				//System.out.printf("아이디:%s 고객명:%s 이메일:%s 지역:%s",user1.userdata[w][0],user1.userdata[w][1],user1.userdata[w][3],user2.infodata[w][2]);
				//count++;
			//}
			w++;
		}
		//if(count==0) {
			//System.out.println("등록된 회원이 아닙니다.");
		//}

	}
	@Override
	public void mytel(String usertel) {//사용안함
	}

}