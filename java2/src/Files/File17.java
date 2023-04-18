package Files;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

//이미지 용량제한 체크 프로세서 만들기
/*
 이미지 업로드 할 수 잇는 최대 용량은 1MB 이하 입니다.
 1MB 이상 파일을 업로드시 "이미지 제한 용량은 1MB 이하 까지 입니다."라는
 메세지를 출력 단 정상적인 1MB 이하면 e:memo에 이미지 복사되도록 함
 */
public class File17 {

	public static void main(String[] args) {
		try {
		String file = "E:\\memo\\kk.jpg";	//1MB이하
		//String file = "E:\\memo\\kkk.jpg";	//사용자가 업로드할 이미지 파일 경로
		InputStream is = new FileInputStream(file);
		if(is.available() < 1048576) {
			BufferedInputStream bs = new BufferedInputStream(is);
			byte img[] = new byte[bs.available()]; 
			OutputStream os = new FileOutputStream("e:\\memo\\copy.jpg");
			os.write(img,0,bs.available());
			System.out.println("이미지가 등록되었습니다.");
				/*
				int imgs = 0;
				while(true) {
					imgs = is.read(img);
					if(imgs == -1) {
						break;
					}
					else {
						os.write(img,0,imgs);
					}
				}*/
				os.close();
				is.close();
		}
		else {
			System.out.println("이미지 제한 용량은 1MB 이하 까지 입니다!");
		}
		}
		catch (Exception e) {
			System.out.println(e);
		}
		

	}

}
