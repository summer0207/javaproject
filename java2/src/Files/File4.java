package Files;

import java.io.FileWriter;

//배열 파일로 정리
public class File4 {

	//FileWriter : 문자 데이터를 파일에 쓰는 class
	
	public static void main(String[] args) throws Exception {
		String userdata[] = {"hong","kim","park","jang","kagn"};
		FileWriter fw = new FileWriter("E:\\gitjava\\javaproject\\java2\\src\\Files\\message2.txt");
		//FileWriter에 true를 붙이게 되면, 기존 입력된 사항을 유지하고 추가 데이터가 들어감("경로",true)
		int w = 0;
		do {
			fw.write("{userdb:"+userdata[w]+"},");	//write : 문자, 배열, 숫자등 다양한 데이터 값을 파일에 저장하는 명령어
			w++;
		}while(w < userdata.length);
		fw.close();	//파일 쓰기 종료

	}

}
