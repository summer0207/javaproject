package java1;

public class Array5 {

	public static void main(String[] args) {
		/*
		 응용문제 3. 배열데이터를 모두 합한 결과값을 출력하시오.
		 15 60 11 14 27 => 127
		 */
		int data[] = {15,60,11,14,27};
		//for in과 동일한 형태의 배열전용 반복문
		int sum = 0;
		for(int f : data) {
			sum += f;
			//System.out.println(f);
		}
		System.out.println(sum);
	
		String id[] = {"hong","kim","park","lee","jang","jung"};
		/*
		 응용문제 4.
		 아이디 데이터 중 4글자 이상인 아이디만 출력하시오.
		 */
		for(String j : id) {
			//System.out.println(j);
			int ea = j.length();
			//System.out.println(ea);
			if(ea>=4) {
				System.out.println(j);
			}
		}
	
	
	}
}
