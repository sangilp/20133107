package pexam8;
// 20133107 �ڻ���
import java.util.Scanner;
public class ex01 {

	public static void main(String[] args) {
		int x = 0, y = 0, z = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("���� �� �� �Է�: ");
		try{		
			// ���ܰ� �߻� �� �� �ִ� ���� 
			x = input.nextInt();
			y = input.nextInt();
			z = x * y;
			System.out.printf("%d * %d = %d %n", x, y, z);
		} catch(Exception e){	// ������ �ƴ� ���� �Է��ϸ� ����ó�� �߻�
			System.out.println("������ �ƴ� ���� �Է��Ͽ���.");
		}
	}
}