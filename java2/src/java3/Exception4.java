package java3;

import java.text.DecimalFormat;

//예외처리 응용편 2
/*
 "hong3000"
 "park1250"
 "kang852"
 "kim1819"
 "lee5117"
 
 전체 포인트 합계를 출력하는 프로세서를 구축하시오.
 */


public class Exception4 {

	public static void main(String[] args) {
		String data[] = {"hong3000","park1250","kang852","kim1819","lee5117"};
		ex e = new ex();
		try {
			e.total_point(data);
		} catch (Exception e2) {
			e2.getMessage();
		}
		finally {
			String data2[] = new String[data.length];
			
			int j = 0;
			while(j < data.length) {
				data2[j] = data[j].replaceAll("[a-zA-Z]", "");
				j++;
			}
			try {
				e.total_point(data2);
			} catch (Exception e3) {
				e3.getMessage();
			}
		}
	}
}

class ex{
	public void total_point(String db[]) throws Exception {
		int w = 0;
		int ea = db.length;
		int sum = 0;
		while(w < ea) {
			sum += Integer.valueOf(db[w]);
			w++;
		}
		DecimalFormat df = new DecimalFormat("###,###");
		System.out.println("포인트 총합계는 "+df.format(sum)+"원");
		Exception c = new Exception();
		throw c;
	}
}