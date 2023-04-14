package java1;

public class scoring {
	//배열값 및 사용자가 검색한 단어 인자값으로 받음 
	public void search(String data1[],String data2[],String data3) {
		int ea = data1.length;
		int count = 0;
		int w = 0;
		while(w < ea) {
			if(data1[w].equals(data3)) {	//검색단어와 배열값 비교
				System.out.printf("%s님의 점수는 %s 입니다.",data1[w],data2[w]);
				count++;
			}
			w++;
		}
		if(count==0) {	//검색단어에 배열값이 없을 경우
			System.out.println("미확인 되었습니다.");
		}
	}
	
}
