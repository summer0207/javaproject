package java1;

import java.math.BigInteger;	//BigInteger 클래스 로드

public class index12 {
	//Big_loop 값 설정
	public static void main(String[] args) {
		/* 1~100까지의 모든 숫자를 곱하여 최종 결과값 출력 */
		int w = 1;
		BigInteger sum = new BigInteger("1");
		/*
		 BigInteger : java 유일하게 무한의 값을 가질 수 있는 자료형
		 단, 변수값에 최초값은 무조건 문자""로 설정
		*/
		while(w<=100) {
			/*
			 BigInteger에서 사용하는 
			 add : 사칙연산 더하기 담당
			 subtract : 사칙연산 빼기 담당
			 multiply : 사칙연산 곱하기 담당
			 divide : 사칙연산 나누기 담당 
			*/
			sum = sum.multiply(BigInteger.valueOf(w));
			//valuOf : 문자를 숫자로 변환
			w++;
		}
		System.out.println(sum);

	}

}
