package homework_3;
import java.util.Scanner;
public class project5_37 {

	public static void main(String[] args) {
		 @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
	        System.out.println("������һ����������: ");
	        String temp = sc.nextLine();
	        int two = Integer.parseInt(temp, 2);    // 2����
	        int eight = Integer.parseInt(temp, 8);  // 8����
	        System.out.println("������תΪʮ����: " + two);
	        System.out.println("�˽���תΪʮ����: " + eight);

	}

}
