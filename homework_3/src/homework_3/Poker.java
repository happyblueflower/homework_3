package homework_3;
import java.util.Arrays;
import java.util.Scanner;
public class Poker {
    private static final int NUM = 1;
    @SuppressWarnings("unused")
	private static int SUM = 52;
    private static final String P = "A,2,3,4,5,6,7,8,9,10,J,Q,K";
    private static String[][] POKER = {
        P.replaceAll("([^,]+)", "黑桃$1").split(","),
        P.replaceAll("([^,]+)", "红桃$1").split(","),
        P.replaceAll("([^,]+)", "梅花$1").split(","),
        P.replaceAll("([^,]+)", "方片$1").split(",")
    };
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System. in );
        int count = NUM;
        String[] hand = new String[0];
        System.out.println("随机发 " + count + " 张牌");
        SUM -= count;
        for (int i = 0; i < count; i++) {
            int row = (int)(Math.random() * POKER.length);
            int col = (int)(Math.random() * POKER[row].length);
            String[] css = new String[hand.length + 1];
            System.arraycopy(hand, 0, css, 0, hand.length);
            css[css.length - 1] = POKER[row][col];
            hand = css;
        }
        System.out.println("然后看手里的牌:");
        System.out.println(Arrays.toString(hand));
        scanner.close();
    }
}