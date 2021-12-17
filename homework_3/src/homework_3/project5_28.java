package homework_3;
import java.util.Scanner;
public class project5_28 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input=new Scanner(System.in);
		System.out.print("Enter a year");
		int year = input.nextInt();
		System.out.print("Enter the first day of the year is a few weeks:");
		int week=input.nextInt();
		String M = null;
		int month;
		int w;
		boolean LeapYear=((year%4==0&&year%100!=0)||(year%400==0));
		for(month=1;month<=12;month++) {
			if(month==1) {
				M="january";
			}else if(month==3){
			if(LeapYear) {
				w=(29%7+week)%7;
				week=w;
				M="March";
				}
			}else if(month==4) {
				w=(31%7+week)%7;
				week=w;
				M="April";
			}else if(month==5) {
				w=(31%7+week)%7;
				week=w;
				M="May";
			}else if(month==6) {
				w=(31%7+week)%7;
				week=w;
				M="June";
			}else if(month==7) {
				w=(31%7+week)%7;
				week=w;
				M="July";
			}else if(month==8) {
				w=(31%7+week)%7;
				week=w;
				M="August";
			}else if(month==9) {
				w=(31%7+week)%7;
				week=w;
				M="September";
			}else if(month==10) {
				w=(31%7+week)%7;
				week=w;
				M="October";
			}else if(month==11) {
				w=(31%7+week)%7;
				week=w;
				M="Novermber";
			}else if(month==12) {
				w=(31%7+week)%7;
				week=w;
				M="December";
			}
			switch(week) {
			case 1:System.out.println(M+" "+month+" "+ year+" is Monday");break;
			case 2:System.out.println(M+" "+month+" "+ year+" is Tuesday");break;
			case 3:System.out.println(M+" "+month+" "+ year+" is Wednesday");break;
			case 4:System.out.println(M+" "+month+" "+ year+" is Thurday");break;
			case 5:System.out.println(M+" "+month+" "+ year+" is Friday");break;
			case 6:System.out.println(M+" "+month+" "+ year+" is Saturday");break;
			case 0:System.out.println(M+" "+month+" "+ year+" is Sunday");break;
			
			}
		}
	}
}
