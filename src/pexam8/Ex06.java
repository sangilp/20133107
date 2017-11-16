package pexam8;
// 20133107 박상일
class PrimeNumber03 implements Runnable{
	int n=0;
	// 마지막 숫자를 지정하기 위한 생성자
	public PrimeNumber03(int n){
		this.n = n;
	}
	// 스레드를 받아오는 생성자
	public PrimeNumber03(int n, String name){
		this.n = n;
		Thread.currentThread().setName(name);
	}
	// 실제 실행될 메소드
	public void run(){
		System.out.println(Thread.currentThread().getName()+": ");	// '소수 만드는 스레드: ' 출력
		int[] array = new int[n];	// 크기가n인 소수를 넣을 배열 생성
		int num=0;					// 소수가 들어갈 배열의 인덱스 번호
		for(int i=2; i<=array.length; i++){
			boolean sosu=true;		// 소수인지 아닌지 판별할 변수 지정
			for(int j=0; j<num; j++){
				if(i%array[j]==0)	// i가 소수가 아닐 경우 
					sosu=false;		// 변수sosu가 false 되어 num값이 증가하지 않고 i만 증가함
			}
			if(sosu == true){	// 소수가 맞다면 배열array의 num자리에 소수인 i값 추가 
				array[num]=i;
				num++;
			}
		}
		// 소수 출력
		for(int i=0; i<array.length-1; i++){	// 1은 소수로 취급 하지 않기때문에 i가 2부터 시작하여 length-1 해줘야함
			if(array[i] != 0)	
				System.out.print(array[i]+"  ");
		}
	}
	
}
public class Ex06 {
	public static void main(String[] args) {
		new Thread(new PrimeNumber03(25), "소수 만드는 스레드").start();
	}
}