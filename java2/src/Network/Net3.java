package Network;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

//crawling 사용법
public class Net3 {
	public static void main(String[] args) {
		try {
			crawling cr = new crawling();
			cr.creak();
		} catch (Exception e) {
			
		}
	}
}
class crawling{
	Scanner sc = null;
	String url = "";
	URL urls = null;
	InputStream is = null;
	InputStreamReader ir = null;
	
	public void creak() throws Exception{
		this.sc = new Scanner(System.in);
		System.out.println("크롤링 할 URL 주소를 입력하세요(파일명 포함):");
		this.url = this.sc.nextLine();
		this.urls = new URL(this.url);
		URLConnection con = this.urls.openConnection();
		//통신에는 openStream만 사용 그외에 Stream은 사용안함
		this.is = this.urls.openStream();
		
		this.ir = new InputStreamReader(this.is);	//url 소스파일 읽기
		BufferedReader br = new BufferedReader(this.ir);	//읽은 소스파일 메모리에 탑재
		FileOutputStream fs = new FileOutputStream("E:\\memo\\test.html",true);	//파일만 생성		

		PrintWriter pw = new PrintWriter(fs);	//출력을 문자화 하여 사용
		String code = "";
		while((code=br.readLine())!=null) {
			pw.write(code); //write에 String으로 사용
		}

		fs.flush();
		fs.close();
		this.sc.close();
		pw.close();
		System.out.println("크롤링이 모두 완료 되었습니다.");
	}
}