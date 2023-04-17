package Files;

import java.io.FileReader;
import java.io.IOException;

public class File1 {
	// I/O : inputStream, OutputStream
	/*
	 입력 스트림 : 프로그램으로 들어오는 부분(키보드, 마우스, HDD-저장되는 파일)
	 출력 스트림 : 프로그램으로 나가는 부분(모니터, HDD, 프린터)
	 Stream : API 라이브러리를 사용하는 형태
	 JAVA.io (API)
	 
	 (일반 : File, FileReader) -> StreamAPI (FileinputStream)
	 (일반 : FileWriter) -> StreamAPI(FileoutputStream)
	 */

	/*
	 FileReader : 문자 데이터를 파일로 부터 내용을 가져오는 클래스 (파일읽기)
	 - 파일 이름을 (파라미터)로 사용해서 FileReader 객체를 생성합니다.
	 
	 I/O는 throws를 사용하던가, 또는 try~catch를 무조건 사용해야만 적용할 수 있음
	 */
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("E:\\gitjava\\javaproject\\java2\\src\\Files\\message.txt");
		while(true) {
			int m = fr.read();
			System.out.println((char)m);
			if(m==-1) {
				break;
			}
		}
		fr.close();
	}

}
