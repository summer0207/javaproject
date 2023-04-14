package project1;

import java.util.Arrays;
import java.util.LinkedList;

public class Example4 {
	//ArrayList, List, LinkedList에서 사용하는 옵션
	public static void main(String[] args) {
		String data[] = {"hong","kim","park"};
		LinkedList<String> nums = new LinkedList<>(Arrays.asList(data));
		System.out.println(nums);
		nums.clear();//배열값을 초기화 시켜버림
		System.out.println(nums);
		nums.add("a");
		nums.add("b");
		nums.add("c");
		System.out.println(nums);
		nums.set(2, "zzzzzz");	//기존 배열값을 변경할 때 사용
		System.out.println(nums);
		
	}

}
