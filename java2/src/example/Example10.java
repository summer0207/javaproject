package example;

import java2.mssql;	//외부 클래스 로드

public class Example10 {

	public static void main(String[] args) {
		mssql ms = new mssql();
		ms.abc();	//외부 메소드 로드
		//ms.main(args);	//로드 가능하지만 권장하지않음	
		//외부 메소드 메인 로드(외부 java파일 가져올시 main은 로드하지않음)
		String result = ms.bbb();
		System.out.println(result);
	}

}
