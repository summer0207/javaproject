package java3;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

//http://mekeyace.dothom.co.kr/userdb.txt
//user1.java, user2.java 응용편(interface)
public class Interface2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("사용자 아이디를 입력하세요:");
		String id = sc.next();
		sc.close();
		userinfo ui = new userinfo();
		ui.myinfo(id);

	}

}
//사용자 포인트 확인하는 페이지 구성
class userinfo implements user2,user1{
	private int total;	//필드에 있는 변수만 this 사용가능
	
	@Override	//사용안함
	public void mytel(String usertel) {}
	@Override
	public int dataea() {
		return user1.super.dataea();
	}
	@Override
	public void myinfo(String userid) {
		int count = 0;
		this.total = dataea();
		//System.out.println(this.total);
		int point = 0;
		int w = 0;
		/*데이터 로드 부화를 줄이기 위해서 사용하는 형태*/
		try {
			System.out.println("잠시만 기다려 주시길 바랍니다.(조회중...)");
			Thread.sleep(5000);
		}catch (Exception e) {}
		
		
		while(w < this.total) {
			//사용자가 검토하는 아이디와 배열값에 있는 아이디가 같을 경우
			if(userid.equals(user2.infodata[w][0])) {
				count++;
				//문자를 숫자로 변환
				point = Integer.valueOf(user2.infodata[w][4]);
			}
			//System.out.println(Arrays.toString(user2.infodata[w]));
			w++;
		}
		
		if(count==0) {	//검색 결과가 없을 경우
			System.out.println("등록된 회원이 아닙니다");
		}
		else {	//해당 아이디가 있을 경우
			//숫자 자료형에 자동 콤마기능 적용
			DecimalFormat df = new DecimalFormat("###,###");
			System.out.println("고객님의 포인트는:"+df.format(point)+" 원 입니다.");
		}
		
	}
	@Override
	public String pointck(String userid) {
		return null;
	}
}