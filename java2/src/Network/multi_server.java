package Network;

import java.io.BufferedReader;
import java.io.InputStreamReader;
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
		ServerSocket ss = null;
		Socket sk = null;
		try {
			ss = new ServerSocket(10001);
			while(true) {
				System.out.println("Chroom Start");
				sk = ss.accept();
				ch_server ch = new ch_server(sk);
				ch.start();
			}
		} 
		catch (Exception e) {
			System.out.println("Server Socket Error");
		}
	}
}

class ch_server extends Thread{
	static ArrayList<PrintWriter> user = new ArrayList<>();
	Socket sk = null;
	BufferedReader br = null;
	PrintWriter pw = null;
	InputStreamReader isr = null;		
	
	public ch_server(Socket s) {
		this.sk = s;
		try {
			this.pw = new PrintWriter(this.sk.getOutputStream());
			this.br = new BufferedReader(new InputStreamReader(this.sk.getInputStream()));
			user.add(this.pw);
		} 
		catch (Exception e) {
			System.out.println("Soceket Error");
		}
	}
	
	@Override
	public void run() {
		String name = "";
		try {
			name = this.br.readLine();
			System.out.println("["+name+"]");
			info("["+name+"] Welcome");
			
			while(this.br != null) {
				String inmsg = this.br.readLine();
				info(name + " : " + inmsg);
			}
		} 
		catch (Exception e) {
			System.out.println("User id Error");
		}
	}
	public void info(String s) {
		for(PrintWriter p : user) {
			p.println(s);
			p.flush();
		}
	}
}