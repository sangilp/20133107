package pexam8;
// 20133107 �ڻ���
class PrimeNumber03 implements Runnable{
	int n=0;
	// ������ ���ڸ� �����ϱ� ���� ������
	public PrimeNumber03(int n){
		this.n = n;
	}
	// �����带 �޾ƿ��� ������
	public PrimeNumber03(int n, String name){
		this.n = n;
		Thread.currentThread().setName(name);
	}
	// ���� ����� �޼ҵ�
	public void run(){
		System.out.println(Thread.currentThread().getName()+": ");	// '�Ҽ� ����� ������: ' ���
		int[] array = new int[n];	// ũ�Ⱑn�� �Ҽ��� ���� �迭 ����
		int num=0;					// �Ҽ��� �� �迭�� �ε��� ��ȣ
		for(int i=2; i<=array.length; i++){
			boolean sosu=true;		// �Ҽ����� �ƴ��� �Ǻ��� ���� ����
			for(int j=0; j<num; j++){
				if(i%array[j]==0)	// i�� �Ҽ��� �ƴ� ��� 
					sosu=false;		// ����sosu�� false �Ǿ� num���� �������� �ʰ� i�� ������
			}
			if(sosu == true){	// �Ҽ��� �´ٸ� �迭array�� num�ڸ��� �Ҽ��� i�� �߰� 
				array[num]=i;
				num++;
			}
		}
		// �Ҽ� ���
		for(int i=0; i<array.length-1; i++){	// 1�� �Ҽ��� ��� ���� �ʱ⶧���� i�� 2���� �����Ͽ� length-1 �������
			if(array[i] != 0)	
				System.out.print(array[i]+"  ");
		}
	}
	
}
public class Ex06 {
	public static void main(String[] args) {
		new Thread(new PrimeNumber03(25), "�Ҽ� ����� ������").start();
	}
}