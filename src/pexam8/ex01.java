package pexam8;
// 20133107 박상일
import java.util.Scanner;
public class ex01 {

	public static void main(String[] args) {
		int x = 0, y = 0, z = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("정수 두 개 입력: ");
		try{		
			// 예외가 발생 될 수 있는 문장 
			x = input.nextInt();
			y = input.nextInt();
			z = x * y;
			System.out.printf("%d * %d = %d %n", x, y, z);
		} catch(Exception e){	// 정수가 아닌 값을 입력하면 예외처리 발생
			System.out.println("정수가 아닌 값을 입력하였음.");
		}
	}
}