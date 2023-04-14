package java1;

public class index4 {

	public static void main(String[] args) {
		//반복문 사용
		int f;
		for(f=1;f<=10;f++) {
			//System.out.println(f);
		}
		//더블for문
		int a,b;
		for(a=2;a<10;a++) {
			for(b=1;b<10;b++) {
				System.out.printf("%d*%d=%d\n",a,b,(a*b));
			}
		}
		
		/*
		응용문제2.
		숫자 45~60까지 총 합산한 결과값을 출력하시오.
		*/
		int aa;
		int sum = 0;
		for(aa=45;aa<=60;aa++) {
			sum += aa;
		}
		System.out.println(sum);
		
		/*
		 응용문제3
		 1~200까지 숫자중 홀수 값만 모두 더한 결과값을 출력하시오.
		*/
		int a1;
		int sum1 = 0;
		for(a1=1;a1<=200;a1++) {
			if(a1 % 2 == 1) {
				sum1 += a1;
			}
		}
		System.out.println(sum1);
		
		/*
		 응용문제 4
		 20~60까지 숫자 중 3의 배수 값만 모두 더한 후
		 짝수인지 홀수 인지를 출력하시오. 
		*/
		int k;
		int sum2 = 0;
		for(k=20;k<=60;k++) {
			if(k % 3 == 0) {
				sum2 +=k; 
			}
		}
			if(sum2 % 2 == 0) {
				System.out.println("짝수입니다");
			}
			else {
				System.out.println("홀수입니다");
			}
		
			
		/*
		 응용문제5
		 구구단 7단 ~ 3단까지 역순으로 출력되도록 하시오.
		 단, 그 중 결과값이 홀수인 값만 출력됩니다. 
		*/
		int u,j;
		int sum3;
		for(u=7;u>=3;u--) {
			for(j=1;j<=9;j++) {
				sum3 = u * j;
				if(sum3 %2 == 1) {
					System.out.printf("%d*%d=%d\n",u,j,(u*j));
				}
			}
		}
		
		
		
		
	}	
}
