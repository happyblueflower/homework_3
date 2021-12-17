package homework_3;
import java.util.Scanner;

public class project3_21 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter year:");
		int year = input.nextInt();
		
		double j = year%100;
		
		System.out.println("Enter month:");
		int m = input.nextInt();
	
		System.out.println("Enter the day of the month:");
		int q = input.nextInt();
		
		int k = year%100;
		
		double h = (int)(q + 26*(m+1)/10 + k + k/4 + j/4 + 5*j)%7;
		
		if(h==0) 
			System.out.println("Day of the week is "+ "satoday" );
		else if(h==1)
			System.out.println("Day of the week is "+ "sunday" );
		else if(h==2)	
			System.out.println("Day of the week is "+ "Monday" );
		else if(h==3)
			System.out.println("Day of the week is "+ "Tuesday" );
		else if(h==4)
			System.out.println("Day of the week is "+ "Wednesday");
		else if(h==5)
			System.out.println("Day of the week is "+ "Tuesday");
		else if(h==6)
			System.out.println("Day of the week is "+ "Firday");
		
			
			
		
		
		
		

	}

}
