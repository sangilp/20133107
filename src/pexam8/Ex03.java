package pexam8;
// 20133107 박상일
// 사용자 정의 예외 클래스 생성
class InvalidWithdraw extends Exception{
	private static final long serialVersionUID = 1L;
	public InvalidWithdraw(String msg){
		super(msg);
	}
}
class BankAccount{
	int balance = 0;	// 최저 잔금 필드 선언
	int money = 0;		// 잔액 필드 선언
	// 최저 잔금을 저장할 수 있는 필드를 지정하는 생성자
	public BankAccount(int balance){
		this.balance = balance;
	}
	// 입금 메소드
	public void deposit(int money){
		this.money += money;
		System.out.printf("정상 입금 처리: 입금금액=%d, 잔금=%d\n", money, this.money);
	}
	// 출금 메소드
	public void withdraw(int money) throws InvalidWithdraw {
		if(money<0)		// 인출 요청 금액이 음수일 경우
			throw new InvalidWithdraw("입력 금액 오류");
		else if(this.money-money<balance) // 최저 잔금 이하로 인출을 요청 할 경우
			throw new InvalidWithdraw("초과 출금 요구 예외");
		else{
			this.money -= money;
			System.out.printf("정상 출금 처리: 인금액=%d, 잔금=%d\n", money, this.money);
		}
	}
}
public class Ex03 extends BankAccount{
	// 생성자 오버라이딩
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