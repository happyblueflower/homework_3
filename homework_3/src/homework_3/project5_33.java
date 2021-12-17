package homework_3;

public class project5_33 {

	public static void main(String[] args) {
		int count=0;
		for(int i=1; i<=10000;i++) {
			for(int j =1; j<i; j++) {
				if(i%j==0) {
					count+=j;
				}
			}
			if(count==i) {
				System.out.println(i);
			}
		}
		System.out.println();
	}

}
