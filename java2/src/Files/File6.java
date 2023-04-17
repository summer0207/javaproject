package Files;

import java.io.FileReader;
import java.nio.charset.Charset;
import java.util.Scanner;

public class File6 {

	public static void main(String[] args) {
		notice n = new notice();
		try {
			n.view();
		}
		catch (Exception e) {
			System.out.println("메소드 함수 오류");
		}
	}
}
class notice{
	FileReader fr = null;
	Scanner sc = null;
	
	public void view() throws Exception{
		this.fr = new FileReader("E:\\gitjava\\javaproject\\java2\\src\\Files\\notice.txt",Charset.forName("UTF8"));
		this.sc = new Scanner(this.fr);
		System.out.println(this.sc.next());
	}
	
}