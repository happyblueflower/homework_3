package homework_3;
import java.util.Scanner;

public class project3_23 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input =new Scanner(System.in);
		System.out.println("输入一个点（x,y）");
		int x = input.nextInt();
		int y = input.nextInt();
		
		if((x>=-5 && x<=5) ||(y>=-5/2 && y<=5/2))
			System.out.println("这个点在矩形内");
		else
			System.out.println("这个点不在矩形内");
		

	}

}
