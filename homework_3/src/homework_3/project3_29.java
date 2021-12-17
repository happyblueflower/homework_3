package homework_3;
import java.util.Scanner;

public class project3_29 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("Enter circle1's center x-,y-,radius:");
		float x1 = input.nextFloat();
		float y1 = input.nextFloat();
		float r1 = input.nextFloat();
		
		System.out.println("Enter circle2's center x-,y-,radius:");
		float x2 = input.nextFloat();
		float y2 = input.nextFloat();
		float r2 = input.nextFloat();
		
		if(Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2)) <= Math.abs(r1-r2))
			System.out.println("circle2 is inside circle1");
		else if(Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2)) <= Math.abs(r1+r2))
			System.out.println("circle2 is overlaps circle1");
		else
			System.out.println("circle2 not is overlaps circle1");
	}

}
