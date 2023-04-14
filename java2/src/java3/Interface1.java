package java3;

public class Interface1 {
	//interface 사용법 (inter1.java, inter2.java)
	//Interface의 특징 : class가 없음 (추상 메소드)
	public static void main(String[] args) {
		key k = new key();
		k.z1();
		k.z2();
		k.z3();
		k.z1_1(1, 5);
	}
}
 /*
	Interface 상속을 받기 위해서는 implements을 이용함 (extends X)
	
	Interface는 부품이며, 해당 부품을 조립하여 프로그램을 완성하는 형태
	또한 여러개의 Interface를 한번에 모두 로드할 수 있음
	
	Interface의 단점 : 일반 메소드를 생성하지 못함
	단, 강제로 메소드를 생성할 수 있음(default 이용시)
	
	동일한 변수를 사용시 this를 사용하지 못하며, 해당 interface
	메소드 이름을 입력후 해당 변수명을 적용해야 합니다.
	예시) 인터페이스이름.변수명
 */
class key implements inter1, inter2{
	@Override
	public void z1() {
		System.out.println(inter1.names);
		//System.out.println(this.names);
	}
	@Override
	public void z2() {
		System.out.println(inter1.names);
		//System.out.println(this.names);
	}
	@Override
	public String z3() {
		System.out.println(inter2.names);
		return null;
	}
	@Override
	public void z1_1(int a, int b) {	//일반메소드 사용 유/무
		inter1.super.z1_1(a, b);
	}
}
