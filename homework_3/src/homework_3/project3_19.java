package homework_3;
import java.util.Scanner;

public class project3_19 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("输入三角形的三条边：");
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		if(a+b>c || a+c>b || b+c>a) {
			int Len = a+b+c;
			System.out.println("三角形的周长为 "+Len);
		}
		else
			System.out.println("三角形边长不合法。");

	}

}
