package homework_3;
import java.util.Scanner;

public class project3_27 {

	public static void main(String[] args) {
		@SuppressWarnings({ "resource", "unused" })
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a point's x-and y-coordinates:");
		
		@SuppressWarnings("resource")
		double x = new Scanner(System.in).nextDouble();
		@SuppressWarnings("resource")
		double y = new Scanner(System.in).nextDouble();
//		float x = input.nextFloat();
//		float y = input.nextFloat();  用double和float什么区别？
		
		if((x>=0 && y>=0) && (y <= -(1/2)*x+100))
			System.out.println("the point is in the triangle.");
		else 
			System.out.println("the point is not in the triangle.");
		

	}

}
