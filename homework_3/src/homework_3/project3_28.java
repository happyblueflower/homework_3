package homework_3;
import java.util.Scanner;

//|x1-x2|>(L1+L2)/2&&|y1 - y2|>(H1+H2)/2;相离。
//|x1-x2| <|L1-L2|/2 && |y1 - y2|< |H1-H2|/2 包含
//其余情况相交
//overlap 重叠  inside 包含

public class project3_28 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("Enter r1's center x-, y-coordinates, width,and height:");
		float x1 = input.nextFloat();
		float y1 = input.nextFloat();
		float w1 = input.nextFloat();
		float h1 = input.nextFloat();
		
		System.out.println("Enter r2's center x-, y-coordinates, width,and height:");
		float x2 = input.nextFloat();
		float y2 = input.nextFloat();
		float w2 = input.nextFloat();
		float h2 = input.nextFloat();
		
		if(Math.abs(x1-x2)>(w1+w2)/2 && Math.abs(y1-y2)>(h1+h2)/2)
			System.out.println("r2 not overlaps r1");
		else if(Math.abs(x1-x2)<Math.abs(w1-w2)/2 && Math.abs(y1-y2)<Math.abs(h1-h2)/2)
			System.out.println("r2 inside r1");
		else
			System.out.println("r2 does is overlaps r1");
	
	}
}