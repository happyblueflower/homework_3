package homework_3;
import java.util.Scanner;

public class project3_22 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input =new Scanner(System.in);
		System.out.println("输入一个点（x,y）");
		int x = input.nextInt();
		int y = input.nextInt();
		
		int num = x*x + y*y;
		
		if(num<=100)
			System.out.println("这个点在圆内");
		else
			System.out.println("这个点不在圆内");
		
		
	}

}
