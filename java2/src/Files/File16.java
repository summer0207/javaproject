package Files;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class File16 {
	//이미지(Binary) 형태 byte단위로 설정(FileReader X)
	/*
	  1. InputStream으로 이용
	  2. OutputStream으로 파일명만 생성
	  3. byte 단위로 처리사항 생성 / 100 => 100%
	  4. 무한반복문으로 해당 원본파일을 지속적으로 읽어들이면서 write로 복사함
	  5. -1 더 이상 복제할 사항이 없을 경우 무한 바녹문을 빠져 나갑니다.(break)
	 */
	public static void main(String[] args) {
		try {
			//사용자가 업로드 하는 이미지
			InputStream is = new FileInputStream("e:\\memo\\kang.jpg");

			//사용자가 이미지 크기를 계산 후 파일을 읽어들이는 크기
			//byte img[] = new byte[is.available()];	//메모리 크기만큼 한번에 이미지 사이즈를 읽어들임
			byte img[] = new byte[is.available()/100];	//100을 나눠서 해당 크기만큼 읽어들림
			OutputStream os = new FileOutputStream("e:\\memo\\kang2.jpg");	//copy경로 및 파일명만 생성
			int imgs = 0;	//읽는 바이트수
			int check = 0;	// %로 사용자에게 생성율을 보여주기 위한 변수
			while(true) {
				imgs = is.read(img);	//해당 파일을 읽어서 바이트 변수로 넘김
				if(imgs == -1) {
					break;
				}
				else {
					//이미지를 copy함 (byte단위로 지속적으로 생성시킴)
					os.write(img,0,imgs);	
				}
				check++;
				if(check % 2 == 0) {
					//현재 생성 되고 있는 %를 표기 하기 위한 코드 (사용안해도 무방함)
					System.out.println(check + "%");
				}
			}
			os.close();
			is.close();
		} 
		catch (Exception e) {
			
		}

	}

}
