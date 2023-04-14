package project1;

import java.util.Scanner;

/*
 응용문제4.
 업, 다운 퀴즈를 하도록합니다.
 PC가 1~10까지 임의 숫자를 선택 합니다. 단, interface 사용
 
 "1~10까지 숫자를 입력하세요"
 라는 메세지와 함께 사용자가 숫자를 하나 선택합니다.
 결과는 PC가 4라는 숫자를 선택 하였고, 사용자가 8이라는 숫자를
 선택하였다면 Down을 만약 사용자가 1이라는 숫자를 선택하였다면
 Up 이라는 메세지를 출력합니다. 단, 횟수는 딱 4회만 할 수 있도록 합니다.
 PC가 뽑은 숫자와 사용자가 뽑은 숫자가 같을 경우 "정답"이라는 
 메세지 출력 4회 이상일때는 "정답을 맞추지 못했습니다"라는 결과값을 출력합니다.
 */
public class Example1 {

	public static void main(String[] args) {
		number r = new number();
		r.z1();
		
		

	}

}
class number implements radom{
	Scanner sc = new Scanner(System.in);

	@Override
	public void z1() {
		int w = 0;
		int count = 0;
		int g = (int)Math.ceil(Math.random()*10);
		while(w < 4) {
		System.out.println("1~10까지 숫자를 입력하세요?");
		int no = sc.nextInt();	
		sc.close();
		if(no > 10) {
			System.out.println("10이하 숫자만 입력하세요");
			continue;
		}
		else {
			count++;
			if(count == 4) {
				System.out.println("정답을 맞추지 못했습니다");
				break;
			}
			
			if(g == no) {
				System.out.println("정답");
				break;
			}
			else if(g < no) {
				System.out.println("Down");
			}
			else if(g > no) {
				System.out.println("Up");
			}	
		}
				
		
		w++;
		}

		
	}
	
}
