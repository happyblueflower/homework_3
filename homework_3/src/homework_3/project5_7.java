package homework_3;

public class project5_7 {

	public static void main(String[] args) {
		int i = 10;
		int n = 4;
		int fare = 10000;
		double createRate = 0.05;
		while(i!=0) {
			fare *= (1+ createRate);
			i--;
		}
		System.out.println("the fare after ten years is "+ fare);
		int sumfare=fare;
		while(n!=0) {
			fare *= (1+0.05);
			sumfare += fare;
			n--;
		}
		System.out.println("the fare of the four year is "+sumfare);
	}

}
