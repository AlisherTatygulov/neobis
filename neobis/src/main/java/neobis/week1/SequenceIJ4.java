package neobis.week1;

public class SequenceIJ4 {
    public static void main(String[] args) {
        for (double i = 0; i <= 2; i += 0.2) {
            for (int j = 1; j <= 3; j++) {
                System.out.printf("I=%.1f J=%.1f\n", i, i + j);
            }
        }
    }
}
