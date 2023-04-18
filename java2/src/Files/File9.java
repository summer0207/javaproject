package Files;

import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.List;

public class File9 {
	//파일 데이터를 배열로 전송하기 io
	public static void main(String[] args) {
		try {
			filedata fd = new filedata();
			fd.addfile();
		} catch (Exception e) {
			System.out.println("메소드 호출오류");
		}
	}
}
class filedata{
	//라이브러리 : io(기본 input.out만 사용), nio(버퍼를 활용하는 id 성능이 좋음)
	//nio2 : nio를 개선하여 File 클래스를 보다 더 빠르게 사용
	
	//Files.readAllLines : 파일 전체 모든 텍스트 라인을 읽어들임
	//List(최상위), ArrayList(파생배열) (일반형식 배열)
	/*
	 단, LinkedList : 파일 전체 라인에 대한 배열값으로 적용하지 못함(배열번호)
	 객체를 인스턴스 메모리로 등록 시킨 후 강제로 파일 배열값을 적용할 수 있음
	 */
	
	FileReader fr = null;
	List<String> data = null;
	LinkedList<String> data2 = null;
	
	public void addfile() throws Exception {
		//Paths.get : 파일 경로
		this.data = Files.readAllLines(Paths.get("E:\\gitjava\\javaproject\\java2\\src\\Files\\notice.txt"));
		System.out.println(data);
		
		this.data2 = new LinkedList<String> (Files.readAllLines(Paths.get("E:\\gitjava\\javaproject\\java2\\src\\Files\\notice.txt")));
		System.out.println(data2);
		
		//원시배열로 처리 (byte단위) : 언어패킷을 사용하지 못함 1차배열로만 처리
		//단점 : byte는 메모리 할당이 많아짐
		byte data3[] = Files.readAllBytes(Paths.get("E:\\gitjava\\javaproject\\java2\\src\\Files\\notice.txt"));
		System.out.println(new String(data3));
		
	}
}