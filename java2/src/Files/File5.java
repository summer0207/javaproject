package Files;

import java.io.FileWriter;
import java.util.Scanner;

//user.txt라는 파일에 다음과 같이 저장 되도록 코드를 작성하시오.
/*
 사용자 아이디를 입력하세요?
 총 5번의 질문을 물어보며, 사용자가 직접 입력합니다.
 사용자가 입력한 내용은 user.txt에 남아 있어ㅑ 합니다.
 */
public class File5 {

	public static void main(String[] args) throws Exception{
		
		Scanner sc = new Scanner(System.in);
		//true를 안쓰는 이유는 반복문 안에 적용시에만 true필요 반복문
		FileWriter fw = new FileWriter("E:\\gitjava\\javaproject\\java2\\src\\Files\\user.txt");
		int w = 0;
		
		while(w < 5) {
			System.out.println("사용자 아이디를 입력하세요?");
			String mid = sc.next();
			fw.write(mid+"\n");
			w++;
		}
		fw.close();
		sc.close();
	}

}
