package Network;

public class Thread5 {
	//멀티 쓰레드 응용편
	/*
	 응용문제1. 멀티 스레드를 이용하여 각각의 구구단을 출력하는 프로세서를
	 제작하시오.
	 첫번째 쓰레드에는 구구단 5단, 두번째 쓰레드에는 구구단 9단
	 */
	static int no = 5;
	static int no2 = 9;
	public static void main(String[] args) {
		gugu g = new gugu();
		Thread th = new Thread(g);
		th.start();

		Thread th2 = new gugu2();
		th2.start();
	}

}
class gugu implements Runnable{
	@Override
	public void run() {
		int w = 1;
		int sum = 1;
		while(w <= 9) {
			sum = Thread5.no * w;
			System.out.println(Thread5.no +"*"+w+"="+sum);
			w++;
		}
	}
}
class gugu2 extends Thread{
	public void run() {
		int w = 1;
		int sum = 1;
		while(w <= 9) {
			sum = Thread5.no2 * w;
			System.out.println(Thread5.no2 +"*"+w+"="+sum);
			w++;
		}
	}
}