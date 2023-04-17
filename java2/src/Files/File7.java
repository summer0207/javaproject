package Files;
/*
 member.txt에 있는 문자 데이터를 ArrayList, List, LinkedList, Map등 다양한 
 방식으로 배열화 하시길 바랍니다. 
 */

import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class File7 {

	public static void main(String[] args) {
		arrays a = new arrays();
		try {
			a.datalist();
		} catch (Exception e) {
			System.out.println("error");
		}

	}
}
class arrays{
	FileReader fr = null;
	Scanner sc = null;
	ArrayList<String> al;
	
	public void datalist() throws Exception {
		this.fr = new FileReader("E:\\gitjava\\javaproject\\java2\\src\\Files\\member.txt");
		this.sc = new Scanner(this.fr);
		while(this.sc.hasNext()) {

			String[] list = this.sc.nextLine().split(" , ");
			al = new ArrayList<>(Arrays.asList(list));

			System.out.println(al);
		}
		this.fr.close();
		this.sc.close();
	}
}