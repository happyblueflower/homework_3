package homework_3;
import java.util.Scanner;

public class project5_21 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input=new Scanner(System.in);
		System.out.println("Loan Amount: ");
		int Loan=input.nextInt();
		System.out.println("Ennumber of years:");
		int years = input.nextInt();
		System.out.printf("%-5s%-5s%-5s%n", "Interest Rate","Monthly Payment",
				"Total Payment");
		for(double annuallnterestRate=5.0;annuallnterestRate<=8.0;
				annuallnterestRate+=annuallnterestRate+0.125) {
				double MonthlyPayment=Loan*(annuallnterestRate/1200)/(1-1/Math.pow(1+annuallnterestRate/1200, years*12));
				double TotalPayment=MonthlyPayment*years*12;
				System.out.printf("%-5.3f%s%s%5.2f%s%-5.2f%n", annuallnterestRate,"%"," ",MonthlyPayment," ",TotalPayment);
				
		}
	}
}
//为什么不能循环？