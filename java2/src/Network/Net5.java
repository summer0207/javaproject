package Network;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Net5 {
	//socket통신 : Server, Client : 양방향
		//HTTP통신 : Image, 동영상, 음악 사용자(요청)에 맞춰서 송수신 통신(단방향)
		
		//양방향 : 자동업데이트
		public static void main(String[] args) {
			System.out.println("Server Connect");
			int port =9001;	//포트번호 셋팅
			try {
				ServerSocket ss = new ServerSocket(port);	//오픈시킬 포트를 적용
			while(true) {
				System.out.println("연결 대기중...");	//accept : 클라이언트가 들어오는 것을 대기 하는 역할을 하게됨
				//accept : 클라이언트가 들어오는 것을 대기하는 역할을 하게됨
				Socket sc = ss.accept();//대기
				
				//client가 접속 했을 경우 해당 라인을 시작합니다.
				//접속완료
				System.out.println("호스트:통신 연결 성공");
				
				//Server에서 Client로 받는 통로
				InputStream is = sc.getInputStream();
				
				//Client로 보내는 통로
				OutputStream os = sc.getOutputStream();
				
				//client에서 받는 텍스트를 byte로 받음
				byte data[] = new byte[1024];	
				int n = is.read(data);	//해당 값을 읽어드림
				//문자 자료형 변환
				String msgclient = new String(data,0,n);
				//출력
				System.out.println(msgclient);
				
				//클라이언트로 메세지 전송
				String aws = "반갑습니다.";		//서버에서 보내는 메세지
				os.write(aws.getBytes());	//클라이언트로 보내기 위한 메모리 저장
				
				os.flush();
				os.close();
				is.close();
				sc.close();
			}
			} catch (Exception e) {
			System.out.println("Server Connect error!!");
			}

	}

}
