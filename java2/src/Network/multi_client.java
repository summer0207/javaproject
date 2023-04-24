package Network;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class multi_client {
	//멀티채팅 클라이언트
	public static void main(String[] args) {
		multi_client mc = new multi_client();
		mc.info();
	}
	public void info() {
		Socket sk = null;
		BufferedReader br = null;
		InputStream is = null;
		InputStreamReader isr = null;
		Scanner sc = null;
		try {
			sk = new Socket("192.168.10.142",10001);
			System.out.println("Connect Success");
			sc = new Scanner(System.in);
			System.out.println("user id: ");
			String name = sc.next();
			Thread tr = new ch_client(sk, name);
			tr.start();
			
			is = sk.getInputStream();
			isr = new InputStreamReader(is);
			br = new BufferedReader(isr);
			
			while(br != null) {
				String msg = br.readLine();
				System.out.println("MSG:"+ msg);
			}
		} 
		catch (Exception e) {
			System.out.println("Server Connect Error...");
		}
	}
}

class ch_client extends Thread{
	Socket sk = null;
	String name = null;
	Scanner sc = null;
	public ch_client(Socket s, String name) {	//setter
		this.sk = s;
		this.name = name;
	}
	
	@Override
	public void run() {
		try {
			PrintStream ps = new PrintStream(this.sk.getOutputStream());
			ps.println(this.name);
			ps.flush();
			
			while(true) {
				this.sc = new Scanner(System.in);
				String msg = this.sc.nextLine();
				ps.println(msg);
				ps.flush();
			}
		} 
		catch (Exception e) {
			System.out.println("Message Error");
		}
	}
}