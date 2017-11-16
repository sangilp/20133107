package pexam8;
//20133107 �ڻ���
import java.util.Calendar;	// ��¥�� �˱����� CalendarŬ���� ���

class PrimeTime implements Runnable {
	int n=0;
	// Ƚ���� �����ϴ� ������
	public PrimeTime(int n){
		this.n = n;
	}
	// �����带 �޾ƿ��� ������
	public PrimeTime(int n, String s){
		this.n = n;
		Thread.currentThread().setName(s);	// �̸� ����
	}
	public void run() {
		Calendar now = Calendar.getInstance();	// ���� ��¥ ����
		for(int i=0; i<n; i++){
			System.out.println("����: "+Thread.currentThread().getPriority() + " "+
								now.getTime() + " "+Thread.currentThread().getName());
		}
	}
}
public class Ex07 {
	public static void main(String[] args) {
		PrimeTime p1 = new PrimeTime(3);
		Thread th1 = new Thread(p1, "�ȳ��ϼ���!");
		th1.setPriority(Thread.MAX_PRIORITY-1);
		th1.start();
		
		PrimeTime p2 = new PrimeTime(6);
		Thread th2 = new Thread(p2, "�ݰ����ϴ�.");
		th2.setPriority(Thread.NORM_PRIORITY-1);
		th2.start();
	}
}