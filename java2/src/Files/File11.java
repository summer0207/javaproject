package Files;

import java.io.OutputStream;

//OutputStream	: 출력담당
// - FileOutputStream, ObjectOutputStream, AudioOutputStream
public class File11 {
	public static void main(String[] args) {
		try {
			load l = new load();
			l.output();
		} 
		catch (Exception e) {
			System.out.println("메소드 오류");
		}
	}
}
class load{
	OutputStream os = null;
	public void output() throws Exception{
		String data = "abcde";
		//byte[] : 문자열을 ASCII키 형태의 배열로 변경하는 것을 말합니다.
		byte[] b = data.getBytes();//getByres : 문자를 숫자형태로 변환
		//System.out.println(Arrays.toString(b));
		this.os = System.out;
		this.os.write(b,0,b.length); //write(배열변수,시작값,종료값)
		this.os.flush(); //byte 단위의 배열값을 역으로 해석해서 문자화 시킴
	}
}