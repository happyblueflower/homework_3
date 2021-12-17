package homework_3;
import java.util.Scanner;
public class project5_26 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number");
		int n = input.nextInt();
		double e=1.0;
		double item=1.0;
		for(int i=1;i<=n;i++) {
			item=item/i;
			e+=item;
		}
		System.out.println("this e is "+e+"for i= "+n);

	}
}
