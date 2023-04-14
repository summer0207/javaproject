package example;

import java.util.Arrays;
import java.util.Scanner;

public class Example7 {
	/*
	 응용문제3.
	 사용자가 총 7개의 숫자를 입력합니다.
	 7개의 숫자 중 짝수 값이 몇개 입력 되었는지
	 출력하시오. 또한 최종 배열 값도 출력합니다.
	 Interger로 배열 셋팅
	 */
	Integer data[] = new Integer[7];
	Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		Example7 ex = new Example7();
		ex.abc();

	}
	public void abc() {
		System.out.println("7개의 숫자를 입력하세요");
		int w = 0;
		int count = 0;
		while(w < 7) {
			this.data[w] = sc.nextInt();
			if(this.data[w]%2==0) { //사용자가 입력한 숫자가 짝수일 경우
				count++;	//+1씩 증가(카운팅)
			};
			w++;
		};
		System.out.printf("짝수값은 총 %d개 입니다.\n",count);
		System.out.println(Arrays.toString(this.data));
		System.out.printf("배열 정보는 :%s 총 짝수 입력 갯수 : %d",Arrays.toString(this.data),count);
		this.sc.close();
	}

}
