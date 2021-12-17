package homework_3;
import java.util.Scanner;
public class project5_37 {

	public static void main(String[] args) {
		 @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
	        System.out.println("请输入一个二进制数: ");
	        String temp = sc.nextLine();
	        int two = Integer.parseInt(temp, 2);    // 2进制
	        int eight = Integer.parseInt(temp, 8);  // 8进制
	        System.out.println("二进制转为十进制: " + two);
	        System.out.println("八进制转为十进制: " + eight);

	}

}
