package java2;
//Method18 연계작업
public class Method17 {

	public static void main(String[] args) {
		pt ds = new pt();
		ds.display();
	}

}

class pt{	//Method18번 사용이 가능할까?(오버라이드 사용가능)
	public void display() { 
		System.out.println("메인 데이터 호출");
	}
}