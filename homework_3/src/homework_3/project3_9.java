package homework_3;
import java.util.Scanner;

public class project3_9 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		int count = 9;
		int result = 0;
		System.out.println("Enter 9 byte number:");
		int printnum = input.nextInt();
		int num_1 = printnum;
		while(printnum>0) {
			int railSum = printnum % 10;
			printnum /=10;
			result = result + count*railSum;
			count--;
		}
		int result_number = result % 11;
		
		if(result_number==10)
			System.out.println(num_1+"X");
		else
			System.out.println(num_1*10+result_number);
		}

	}

//又什么办法在数字最前面输出一个0