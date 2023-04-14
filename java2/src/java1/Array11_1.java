package java1;

import java.util.Arrays;

public class Array11_1 {

	public static void main(String[] args) {
		int adata [][] = {
				{5,17,19,22,33},
				{1,2,3,4,5}
		};
		int ea = adata[0].length;	//배열 그룹에 있는 데이터 객체수(5)
		int w = 0;
		String result[] = new String[ea];
		while(w < ea) {
			int total = adata[0][w] + adata[1][w];
			if(total % 2 == 0) {
				result[w] = "짝수";
			}
			else {
				result[w] = "홀수";
			}
			w++;
		}
		System.out.println(Arrays.toString(result));
	}

}
