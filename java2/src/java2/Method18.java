package java2;

public class Method18 extends data {
	//main은 오버라이드를 사용할 수 없습니다.
	public static void main(String[] args) {
		//Method17 m = new Method17();
		//m.main(args);
		md m = new md();
		m.display();
		Method18 mh = new Method18();
		mh.name();
	}
	@Override	//원본 메소드를 그대로 상속 받는것(오버라이딩)
	public void name() {
		int aa = 10;	//오버로딩	: 기존 메소드 코드 외에 추가된 코드
		System.out.println(this.abc);	//오버로딩
		super.name();
		System.out.println("추가 코드 작성");	//오버로딩
	}

}
class md extends pt{	//pt : Method17 있는 메소드
	@Override
	public void display() {	//오버라이드 실행
		super.display();
	}
}

class data{
	String abc = "홍길동";
	
	public void name() {
		System.out.println("외부 클래스 data 로드");
	}
}
