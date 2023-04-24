package Network;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class multi_server {
	//멀티채팅 서버
	public static void main(String[] args) {
		multi_server ms = new multi_server();
		ms.info();
	}
	public void info() {
		ServerSocket ss = null;	//서버 소켓 클래스 로드
		Socket sk = null;	//소켓 클래스 로드
		try {
			ss = new ServerSocket(10001);	//서버 포트 오픈
			while(true) {	//사용자가 추가 될 때 마다 멀티스레드가 작동 
				System.out.println("Chroom Start");
				sk = ss.accept();	//연결 유지 (반복문 필수)
				ch_server ch = new ch_server(sk);	//즉시실행 메소드 소켓 전달
				ch.start();	//멀티 스레드로 전달
			}
		} 
		catch (Exception e) {
			System.out.println("Server Socket Error");
		}
	}
}

class ch_server extends Thread{
	//사용자 정보를 저장하는 부분 (메모리에 무조건 등록) - 미등록시 초기화됨
	static ArrayList<PrintWriter> user = new ArrayList<>();
	
	Socket sk = null;
	BufferedReader br = null;
	PrintWriter pw = null;
	InputStreamReader isr = null;		
	OutputStream os = null;
	InputStream is = null;
	
	public ch_server(Socket s) {	//setter 기본 옵션을 모두 셋팅
		this.sk = s;	//소켓을 필드값으로 전달
		try {	//모든 필드값에 속성값을 전달
			this.os = this.sk.getOutputStream();	//쓰기
			this.pw = new PrintWriter(this.os);
			
			this.is = this.sk.getInputStream();	//읽기 (byte)
			this.isr = new InputStreamReader(this.is);	//byte -> String 변경
			this.br = new BufferedReader(this.isr);	//메모리로 저장
			
			user.add(this.pw);	//배열에 사용자를 추가
		} 
		catch (Exception e) {
			System.out.println("Socket Error");
		}
	}
	
	@Override
	public void run() {	//스레드 작동
		String name = "";
		try {
			name = this.br.readLine();
			//System.out.println("["+name+"]");	//접속자 사항
			info("["+name+"] Welcome");	//클라이언트 환영 메세지 출력 1회(최초만)
			
			while(this.br != null) {	//클라이언트가 입력한 메세지를 전달(배열에 있는 모든 사용자에게)
				String inmsg = this.br.readLine();
				
				if(inmsg.equals("exit")) {	//클라이언트 exit 입력시 
					user.remove(this.pw);	//사용자 삭제
					info(name+"[OUT]");	//사용자들에게 접속을 종료한 아이디를 출력
					break;	//반복문 종료
				}
				else {
				info(name + " : " + inmsg);
				}
			}
		} 
		catch (Exception e) {
			System.out.println("User id Error");
		}
	}
	public void info(String s) {	//전달 형태
		for(PrintWriter p : user) {	//접속한 사용자 전체 리스트 반복
			p.println(s);	//메세지 전달
			p.flush();	//메모리 메세지 초기화
		}
	}
}