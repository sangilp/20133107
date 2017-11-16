package pexam8;
//20133107 박상일
import java.util.Calendar;	// 날짜를 알기위한 Calendar클래스 사용

class PrimeTime implements Runnable {
	int n=0;
	// 횟수를 지정하는 생성자
	public PrimeTime(int n){
		this.n = n;
	}
	// 스레드를 받아오는 생성자
	public PrimeTime(int n, String s){
		this.n = n;
		Thread.currentThread().setName(s);	// 이름 지정
	}
	public void run() {
		Calendar now = Calendar.getInstance();	// 현재 날짜 지정
		for(int i=0; i<n; i++){
			System.out.println("순위: "+Thread.currentThread().getPriority() + " "+
								now.getTime() + " "+Thread.currentThread().getName());
		}
	}
}
public class Ex07 {
	public static void main(String[] args) {
		PrimeTime p1 = new PrimeTime(3);
		Thread th1 = new Thread(p1, "안녕하세요!");
		th1.setPriority(Thread.MAX_PRIORITY-1);
		th1.start();
		
		PrimeTime p2 = new PrimeTime(6);
		Thread th2 = new Thread(p2, "반갑습니다.");
		th2.setPriority(Thread.NORM_PRIORITY-1);
		th2.start();
	}
}