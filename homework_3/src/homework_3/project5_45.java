package homework_3;
import java.util.Scanner;
public class project5_45 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		int sum = 0 ; //�������ĺ�
		int []a = new int[10] ;
		System.out.print("Enter 10 numbers: ") ;
		//���벿��
		for(int i = 0 ; i < a.length ; i++){
		a[i] = s.nextInt();
		sum += a[i];
		}
		//�������ƽ��ֵ
		int avg = sum / a.length ;
		avg/=a.length;
		
		int diff = 0;
		for(int i = 1 ;i < a.length ; i++) {
		  int num=a[i]-avg;
		  diff+=num*num;
		}
		double number = Math.sqrt(diff);
		number/=a.length;//��׼��
		System.out.println("The mean is: "+ avg);
		System.out.println("The standard deviation is "+number);
		

	}

}
