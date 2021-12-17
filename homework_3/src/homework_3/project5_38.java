package homework_3;
import java.util.*;
public class project5_38 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		int aint=0;
		System.out.println("输入一个整数：");
		aint = input.nextInt();
		System.out.println(aint+"的二进制表示为："+ Integer.toBinaryString(aint));
	}

}
