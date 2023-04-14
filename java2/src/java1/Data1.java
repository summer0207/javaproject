package java1;

//불필요한 코드는 ctrl+d로 정리 (필요한 코드는 삭제안됨) ctrl + shirt + o 한번에 정리(조심해야함)
//ctrl + shirt + f 코드 자동정렬



//해당 파일은 실행권한 없음 Class_array1.java에서 실행해야함
public class Data1 {
	// 전역 배열변수 작성

	// String user[];
	String user[] = { "hong", "kim", "park" };
	int number = 0;

	public void userlist() {
		// String[] user = {"hong","kim","park"};
		// System.out.println(Arrays.toString(user));

		this.number = 100; // this : 전역변수를 지칭함

		int w = 0;
		while (w < 3) {
			System.out.println(user[w]); // 반복문으로 배열값 출력
			w++;
		}
	}
}
