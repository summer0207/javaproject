package java3;
//abstract4
abstract class sum_total{
	public int sum;
	public abstract void datalist();
	public abstract void result();
}





//main class가 없어야 합니다.
public abstract class ab1 {
	public int aa1 = 30;
	
	public abstract String loginck();
	public abstract void idck(String id);
	public abstract void result();
	public void ad_1() {	//추상 클래스의 실제 메소드
		
	};
}

//외부 가상 class를 만들기 위해서는 public을 사용하지 않습니다.
abstract class aa {
	public abstract int password();	//가상 메소드 생성
}
abstract class aa2 extends aa{	//추상 클래스끼리 상속을 받음
	//단, 추상 클래스는 오버라이드 하지않음
	public abstract String user_info();
}

//일반 클래스 메소드
class aa3{
	public String aa3_method() {
		return null;
	}
}