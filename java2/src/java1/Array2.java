package java1;

public class Array2 {

	//메소드로 배열값을 전달하는 방식	(1차배열)
	public static void main(String[] args) {
		String user[] = {"hong","kim","park"};
		Array2 ar = new Array2();
		ar.abc(user);	//abc 메소드로 배열값을 전달
	}
	
	public void abc(String[] user) {	//배열형태의 인자값으로 받음
		int ea = user.length;	//배열갯수
		System.out.println(ea);
		System.out.println(user[0]);	//배열출력
	}

}
