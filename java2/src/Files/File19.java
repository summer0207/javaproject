package Files;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

public class File19 {
	//Buffered -> read, readLine 사용시 무조건 메모리 내용을 사용해버림
	//available() -> 적용하더라도 메모리 내용과는 관계가 없음 (메모리 용량을 확인)
	public static void main(String[] args) {
		try {
		String url = "E:\\gitjava\\javaproject\\java2\\src\\Files\\user.txt";
		InputStream fs = new FileInputStream(url);
		/* 이미지, 동영상 형태 */
		//BufferedInputStream bs = new BufferedInputStream(fs);
		//byte[] b = new byte[fs.available()];

		/* 문서파일 형태 */
		InputStreamReader ir = new InputStreamReader(fs);
		BufferedReader br = new BufferedReader(ir);
		//System.out.println(br.readLine());
		String result = "";
		while((result = br.readLine())!=null) {
			System.out.println(result);
		}
		} 
		catch (Exception e) {
			
		}

	}

}
