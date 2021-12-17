package homework_3;
import java.util.Scanner;
public class project5_25 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number");
		int n = input.nextInt();
		double sum=0;
		for(int i=1;i<=n;i++) {
			sum+=(double)(Math.pow((-1),(i+1)/(2*i-1)));
		}
		System.out.println((double)(4*sum));

	}

}
