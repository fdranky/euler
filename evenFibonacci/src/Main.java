import java.math.BigInteger;

/**
 * Created by hoecakenux on 10.12.17.
 */
public class Main {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        long sum = 0;
        for(int c = 0; c < 4000000; c = a + b) {
            if(c % 2 == 0) {
                sum += c;
            }
            System.out.println(sum);
            a = b;
            b = c;
        }
    }
}
