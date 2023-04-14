package java1;

import java.util.Arrays;

public class Random2 {
	//random으로 활용법
	public static void main(String[] args) {
		/*
		 응용문제 1.
		 pc가 1~46까지의 숫자 6개를 무작위로 생성합니다.
		 해당 6개의 숫자를 배열화 하여 출력하시오.(1차 배열생성)
		 */
		int a = 1;
		String lists = "";
		int number;
		
		while(a<=6) {
			number = (int)Math.ceil(Math.random()*46);
			lists += number + " ";
			a++;
			//System.out.println(number);
		}
		String no[] = lists.split(" ");
		System.out.println(Arrays.toString(no));
		
		//쌤풀이
		/*
		int number[] = new int[6];
		int f;
		for(f=1;f<=6;f++) {
			int pc = (int)Math.ceil(Math.random()*46);
			number[f-1] = pc;
		}
		System.out.println(Arrays.toString(number));
		 */
	}

}
