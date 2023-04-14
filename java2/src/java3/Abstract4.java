package java3;

import java.util.Arrays;
import java.util.Comparator;

public class Abstract4 {
/*
 응용문제1. 1차배열 값이 있습니다. 해당 배열값 리스트를
 오름차순으로 정렬하며, 해당 모든 배열값을 더하는 최종 결과값을
 출력하는 코드를 작성하시오. (시간은 10분)
 배열데이터 : 1 10 15 19 8 4 7 0 2 3 9 12
 */
	public static void main(String[] args) {
		ab5 a = new ab5();
		a.datalist();
		a.result();
	}

}
class ab5 extends sum_total{
	//this.sum
	Integer data[] = null;
	@Override
	public void datalist() {
		this.data = new Integer[] {1,10,15,19,8,4,7,0,2,3,9,12};
		//Arrays.sort(this.data);	//오름차순 정렬
		//Comparator : JAVA8에 나온 내림차순 ,Collections.reverseOrder() : JAVA7이하 내림차순
		Arrays.sort(this.data,Comparator.reverseOrder());	//내림차순(Integer,String)
		System.out.println(Arrays.toString(this.data));
	}
	@Override
	public void result() {
		this.sum = 0;
		int ea = this.data.length;
		int w = 0;
		while(w < ea) {
			this.sum += this.data[w];
			w++;
		}
		System.out.println(this.sum);
	}
}