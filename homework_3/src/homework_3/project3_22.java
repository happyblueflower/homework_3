package homework_3;
import java.util.Scanner;

public class project3_22 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input =new Scanner(System.in);
		System.out.println("����һ���㣨x,y��");
		int x = input.nextInt();
		int y = input.nextInt();
		
		int num = x*x + y*y;
		
		if(num<=100)
			System.out.println("�������Բ��");
		else
			System.out.println("����㲻��Բ��");
		
		
	}

}
