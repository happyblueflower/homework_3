package homework_3;
import java.util.Scanner;

public class project3_19 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("���������ε������ߣ�");
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		if(a+b>c || a+c>b || b+c>a) {
			int Len = a+b+c;
			System.out.println("�����ε��ܳ�Ϊ "+Len);
		}
		else
			System.out.println("�����α߳����Ϸ���");

	}

}
