package java3;

import java.util.ArrayList;

public class Execption4_1 {
//쌤풀이
	public static void main(String[] args) {
		String data[] = {"hong3000","park1250","kang852","kim1819","lee5117"};
		ArrayList<String> al = new ArrayList<>();
		int w = 0;
		while(w < data.length) {
			al.add(data[w].replaceAll("[a-zA-Z]", ""));
			w++;
		}
		try {
			ex_1 e = new ex_1();
			e.datain(al);
		} 
		catch (Exception e) {
			if(e.getMessage() != null) {
				System.out.println(e);
			}
		}
	}

}
class ex_1{
	public void datain(ArrayList<String> point) throws Exception {
		int w = 0;
		int sum = 0;
		//System.out.println(point.get(0).getClass().getName());
		while(w < point.size()) {
			//ArrayList에서 숫자로 변환시 (String) 자료형을 적용 후 Integer.valueof (String)
			//또는 Interger.parseInt를 이용하여 자료형 없이 적용가능
			sum += Integer.parseInt((String)point.get(w));
			w++;
		}
		System.out.println(sum);
		Exception e = new Exception();
		throw e;
	}
}
