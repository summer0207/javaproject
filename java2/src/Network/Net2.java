package Network;

public class Net2 {
	//PORT 접속을 하고자하는 경로
	/* 
	 TCP 포트
	 80 : WEB (http://)
	 443 : WEB (https://)
	 21 : FTP
	 22 : SSH
	 23 : Telnet
	 25 : SMTP (메일보내기)
	 110 : POP3 (메일받기) - 서버와 비동기화
	 143 : IMAP (메일받기) - 서버와 동기화
	*/
	/*
	 UDP 포트
	 SNMP : 문자발송시스템
	 VPN : (가상 IP)
	*/
	public static void main(String[] args) {
		try {
			getimage gi = new getimage();
			gi.img();
		} 
		catch (Exception e) {
			System.out.println("통신오류 발생!!");
		}
	}
}
class getimage{
	public void img() throws Exception {
		
	}
}