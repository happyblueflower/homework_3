//打印金字塔形数字
package homework_3;
import java.util.Scanner;

public class project5_19 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input=new Scanner(System.in);
		System.out.print("Enter a number of lines：");
		int line= input.nextInt();
		for(int i=1; i<=line; i++) {
			for(int j=0; j<line-i;j++) {
				System.out.print("\t");
			}
			for(int j=1; j<Math.pow(2, i);j*=2) {
				System.out.print(j+"\t");
			}
			
			for(int j=(int)Math.pow(2, i-2);j>0;j/=2) {
				System.out.print(j+"\t");
			}
			System.out.println();
		}
   }
}
	



