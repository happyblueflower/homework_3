package homework_3;
import java.util.Arrays;
import java.util.Scanner;

public class project3_24 {
	private static final int NUM=1;
	@SuppressWarnings("unused")
	private static int Sum = 52;
	private static final String P = "Ace,2,3,4,5,6,7,8,9,10,Jack,Queen,King";
	private static String[][] POKER = {
	        P.replaceAll("([^,]+)", "����$1").split(","),
	        P.replaceAll("([^,]+)", "����$1").split(","),
	        P.replaceAll("([^,]+)", "��÷��$1").split(","),
	        P.replaceAll("([^,]+)", "����$1").split(",")
	};
//	������������ʾʲô��˼��

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int count = NUM;
		String[] hand = new String[0];
		System.out.println("����� "+count+" ����" );
		Sum-=count;
		for(int i=0; i < count; i++) {
			int row = (int)(Math.random()*POKER.length);//������ʲô��˼��
			int col = (int)(Math.random()*POKER[row].length);
			String[] css = new String[hand.length+1];
			System.arraycopy(hand, 0, css, 0, hand.length);
            css[css.length - 1] = POKER[row][col];
            hand = css;
			
		}
		
		System.out.println("Ȼ���������:");
        System.out.println(Arrays.toString(hand));
        scanner.close();
	}

}
