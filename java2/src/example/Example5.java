package example;

import java.util.Arrays;
import java.util.Collections;

//반복문(for, while, do~while)
//배열 관련 (for(:))
public class Example5 {
	Integer data[] = {10,8,5,3,1};	//1차 숫자배열
	String data2[] = {"b","c","z","a","e","d"};
	
	public static void main(String[] args) {
		Example5 ex = new Example5();
		ex.array();
	}
	public void array() {
		
		//Arrays.sort(data);	//오름차순 정렬 (int, String, Integer)
		
		//내림차순 정렬
		//Collections.reverseOrder() : int만 사용하지 못합니다.
		Arrays.sort(this.data2,Collections.reverseOrder());
		System.out.println(Arrays.toString(this.data2));
		
		/*
		 응용문제2.
		 해당 배열에 모든 값을 합한 결과를 출력하시오.
		 */
		int sum = 0;	//최종 결과 변수
		int ea = this.data.length;
		int f;
		for(f=0;f<ea;f++) {
			sum+=this.data[f];
		}
		System.out.println(sum);
		
		
	}

}
