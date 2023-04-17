package Files;

import java.io.FileReader;
import java.nio.charset.Charset;

public class File2 {

	public static void main(String[] args) {
		try {
			
		/*
		 ANSI = EUCKR
		 Charset.forName("EUCKR") : 인코딩 언어엣을 변경할 때 사용합니다.
		 단, 출력하는 형태 언어셋만 바꾸는 명령어임. 파일자체는 아닙니다.
		 */
			
		FileReader fr = new FileReader("E:\\gitjava\\javaproject\\java2\\src\\Files\\agree.txt",Charset.forName("UTF-8"));
		System.out.println(fr.getEncoding()); //파일 인코딩 언어 확인
		System.out.println(fr.read());	//데이터 크기
		while(true) {
			int a = fr.read();
			System.out.println((char)a);
			if(a==-1) {
				break;
			}
		}
		
		fr.close();	//로드한 파일을 닫을 때 사용
		}
		catch (Exception e) {
			System.out.println("파일 경로 실패");
		}
		

	}

}
