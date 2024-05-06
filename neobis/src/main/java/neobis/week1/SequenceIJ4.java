package neobis.week1;
import java.text.DecimalFormat;

public class SequenceIJ4 {
    public static void main(String[] args) {
        for (double i = 0; i <= 2; i += 0.2) {
            for (int j = 1; j <= 3; j++) {
                DecimalFormat df = new DecimalFormat("#.#");
                System.out.println("I=" + df.format(i) + " J=" + df.format(i+j));
            }
        }
    }
}
