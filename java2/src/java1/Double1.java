package java1;

public class Double1 {

	public static void main(String[] args) {
		/*
		 응용문제5. (do~while문)
		 다음과 같이 함계를 출력하는 loop문을 작성하시오.
		 예시) 
		 5+5=10
		 5+4=9
		 5+3=8
		 ....
		 2+1=3
		*/
		int a = 5;
		int c;
		do {
			int b = 5;
			do {
				c = a + b;
				System.out.printf("\n%d+%d=%d",a,b,c);
				b--;
			}while(b>=1);
			a--;
		}while(a>=2);

	}

}
