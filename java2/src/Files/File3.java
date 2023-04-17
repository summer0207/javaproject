package Files;

import java.io.FileReader;

public class File3 {
	//java에서는 모든 파일을 가져올 수 있습니다.
	//.data, .dat, .json, .xml, .exe, .bat 모든 파일 가능)
	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("E:\\gitjava\\javaproject\\java2\\src\\Files\\data.dat");
			System.out.println(fr.read());
			while(true) {
				int a = fr.read();
				System.out.println((char)a);
				if(a==-1) {
					break;
				}
			}
			fr.close();	//오픈한 파일 닫기
		} 
		catch (Exception e) {
			System.out.println("파일 오류");
		}

	}

}
