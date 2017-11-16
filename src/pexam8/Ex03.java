package pexam8;
// 20133107 �ڻ���
// ����� ���� ���� Ŭ���� ����
class InvalidWithdraw extends Exception{
	private static final long serialVersionUID = 1L;
	public InvalidWithdraw(String msg){
		super(msg);
	}
}
class BankAccount{
	int balance = 0;	// ���� �ܱ� �ʵ� ����
	int money = 0;		// �ܾ� �ʵ� ����
	// ���� �ܱ��� ������ �� �ִ� �ʵ带 �����ϴ� ������
	public BankAccount(int balance){
		this.balance = balance;
	}
	// �Ա� �޼ҵ�
	public void deposit(int money){
		this.money += money;
		System.out.printf("���� �Ա� ó��: �Աݱݾ�=%d, �ܱ�=%d\n", money, this.money);
	}
	// ��� �޼ҵ�
	public void withdraw(int money) throws InvalidWithdraw {
		if(money<0)		// ���� ��û �ݾ��� ������ ���
			throw new InvalidWithdraw("�Է� �ݾ� ����");
		else if(this.money-money<balance) // ���� �ܱ� ���Ϸ� ������ ��û �� ���
			throw new InvalidWithdraw("�ʰ� ��� �䱸 ����");
		else{
			this.money -= money;
			System.out.printf("���� ��� ó��: �αݾ�=%d, �ܱ�=%d\n", money, this.money);
		}
	}
}
public class Ex03 extends BankAccount{
	// ������ �������̵�
	public Ex03(int money){
		super(money);
	}
	public static void main(String[] args) throws InvalidWithdraw {
		BankAccount ba = new BankAccount(-100000);
		ba.deposit(100000);
		ba.withdraw(100000);
		ba.withdraw(200000);
	}
}