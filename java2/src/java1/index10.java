package java1;

import java.util.Scanner;

public class index10 {
	//for문 + scanner
	public static void main(String[] args) {
		/*
		 응용문제 2.
		 Q. 원하는 구구단 숫자를 입력하세요?
		 사용자가 원하는 숫자를 입력하면, 해당 숫자에 맞는
		 구구단이 출력되도록 하시오.
		 예시) 3을 입력할 경우 구구단 3*1=3부터 3*9=27까지 출력 
		*/
		Scanner a = new Scanner(System.in);
		System.out.println("Q.원하는 구구단 숫자를 입력하세요?");
		int n = a.nextInt();
		int j;
		int sum;
		
		a.close(); //반복문 위에다가 닫아줘야 닫힘
		
		for(j=1;j<=9;j++) {
			sum = n * j;
			//System.out.println(f+"*"+j+"="+sum);
			System.out.printf("\n%d*%d=%d",n,j,sum);
		}

	}

}
