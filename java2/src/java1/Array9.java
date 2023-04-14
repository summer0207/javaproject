package java1;

import java.util.Arrays;

public class Array9 {

	//2차 배열 구조 및 출력
	/*
	 정적배열:
	 int a[] = new int[2];
	 a[0]=1;
	 a[1]=2; 
	
	 동적배열 : 
	 int []a = {1,2,3};
	 int a[] = {1,2,3};
	 int [] a = new int[]{1,2,3};
	 */
	public static void main(String[] args) {
		String member[][] = {
				{"홍길동","이순신","유관순"},
				{"25","31","22"}
		};
		
		//System.out.println(Arrays.toString(member[1]));
		//System.out.println(member[0][2]);
		
		int w = 0;
		while(w < member.length) {
			int ww = 0;
			while(ww < member[0].length) {
				System.out.println(member[w][ww]);
				ww++;
			}
			w++;
		}
	}

}
