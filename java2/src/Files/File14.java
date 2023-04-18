package Files;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class File14 {
	/*
	 1. InputStream -> FileInputStream (파일경로) - 불러오기
	 2. byte[] 배열 크기 선언
	 3. read로 파일을 읽어옴
	 4. 출력
	 */
	
	/*
	 1. OutputStream -> FileOutputStream (파일저장) - 저장하기
	 2. byte[] 배열 변환(getBytes())
	 3. write
	 4. flush
	 */
	public static void main(String[] args) {
		try {
			loadfile ld = new loadfile();
			ld.code();
		} catch (Exception e) {

		}
	}

}
class loadfile {
	File f = null;
	InputStream is = null;	//(int)
	OutputStream os = null;
	public void code() throws Exception{
		//신규로 문자를 적용할 경우 new byte를 새로 계산하여 적용해야함
		this.f = new File("E:\\gitjava\\javaproject\\java2\\src\\Files\\abc.txt");
		this.is = System.in;	//사용자가 입력하는 문구
		byte[] word = new byte[100];	//저장기록 용량
		this.is.read(word);	//사용자가 입력한 내용을 배열로 저장
		//System.out.println(Arrays.toString(word));
		
		this.os = new FileOutputStream(f,true);	//입력된 사항 추가저장
		this.os.write(word);	//파일에 입력한 문자 저장
		this.os.flush();		//메모리초기화
		this.os.close();		//파일닫기
		this.is.close();
	}	
}