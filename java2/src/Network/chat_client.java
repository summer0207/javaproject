package Network;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class chat_client {
	//채팅 클라이언트
	public static void main(String[] args) {
		chat_cl ch = new chat_cl();
		ch.client();
	}
}
class chat_cl{
	private String ip = "192.168.10.142";
	private int port = 10001;
	Socket so = null;
	Scanner sc = null;
	InputStream is = null;
	OutputStream os = null;
	private String mid = "";
	private String msg = "";	//메세지 출력
	
	public void client() {
		String cms = "";
		try {
			this.sc = new Scanner(System.in);
			System.out.println("login id : ");
			this.mid = this.sc.nextLine();
			int count = 0;
			
			while(true) {
				this.so = new Socket(this.ip,this.port);
				this.is = this.so.getInputStream();	//서버에서 받아오는 메세지
				this.os = this.so.getOutputStream(); //서버로 보내는 메세지
				if(count==0) {	//최초 서버에 접속했을 경우 (서버로 보내는 메세지)
					this.msg = "["+this.mid+"] Go in";
					/* 서버로 메세지 전송 코드 */
					this.os.write(this.msg.getBytes());
					this.os.flush();
					/* 서버로 메세지 전송 코드 */
				}
				else {
					this.sc = new Scanner(System.in);
					System.out.println("message : ");
					cms = this.sc.nextLine();
				}
					if(cms.equals("exit")) {
						this.msg = "chatroom out";
						/* 서버로 메세지 전송 코드 */
						this.os.write(this.msg.getBytes());
						this.os.flush();
						/* 서버로 메세지 전송 코드 */
						this.is.close();
						this.sc.close();
						this.os.close();
						this.so.close();
						break;
					}
					else {
						this.msg = "["+this.mid+"]:" + cms;	
						/* 서버로 메세지 전송 코드 */
						this.os.write(this.msg.getBytes());
						this.os.flush();
						/* 서버로 메세지 전송 코드 */
					}
				
							
				/* 서버에서 메세지를 받는 코드 */
				byte msg[] = new byte[1024];
				int n = this.is.read(msg);
				String servertext = new String(msg,0,n);
				System.out.println(servertext);
				/* 서버에서 메세지를 받는 코드 */
				count++;	
			}
		} 
		catch (Exception e) {
			System.out.println("Server Connect Error!!");
		}
	}
}