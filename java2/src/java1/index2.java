package java1;

public class index2 {	//클래스

	public static void main(String[] args) {	//메소드
		
		String user = "홍길동";
		byte level = 5;
		int point = 15000;
		
		//println = ln(line)을 뜻함 <br>형태(줄바꿈)
		//printf = f(일반출력) - 한줄에 모두 출력	(\n : 한줄내림)
		
		//System.out.println(user+"님 레벨은:"+level+" 포인트:"+point);
		System.out.printf("%s\n",user);
		System.out.printf("레벨 %d\n",level);
		System.out.printf("포인트 %d\n",point);
		//%d = 숫자는 %d로 표현  %s = String 앞자리
		
		boolean ck = true;	//true,false
		System.out.printf("동의함: %b", ck);
	}

}
