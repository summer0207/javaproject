package java3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class List2 {
	//kim이 사용자 외에 나머지 사용자를 출력
	public static void main(String[] args) {
		String user[] = {"hong","kim","park","jang"};
		ArrayList<String> al = new ArrayList<>(Arrays.asList(user));
		int ea = al.size();	//4
		int w = 0;
		while(w < al.size()) {
			if(al.get(w).equals("kim")) {
				al.remove(w); //remove시 실제 배열 번호가 변경 됩니다.(주의)
			}
			w++;
		}
		System.out.println(al);
		
		/*
		 응용문제
		 해당 배열을 확인 후 짝수의 숫자를 모두 삭제하여
		 최종 결과 배열을 출력하시오.
		 10 7 6 1 11 37 41 22
		 
		 결과 7 1 11 37 41
		 */
		Integer no[] = {10,7,6,1,11,37,41,22};
		ArrayList<Integer> all = new ArrayList<>(Arrays.asList(no));
		int ww = 0;
		while(ww < all.size()) {
			if(all.get(ww)%2==0) {
				all.remove(ww);
			}
			ww++;
		}
		//Collections.sort(all); //오름차순으로 설정
		Collections.sort(all,Collections.reverseOrder());  //내림차순으로 설정
		System.out.println(all);
	}

}
