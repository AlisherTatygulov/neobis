package neobis.week1;

import java.io.IOException;
import java.util.Scanner;

public class WeightedAverages {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        int count = scanner.nextInt();

        for (int i = 0; i < count; i++) {

            double num1 = scanner.nextDouble();
            double num2 = scanner.nextDouble();
            double num3 = scanner.nextDouble();

            double weightedAvg = (num1 * 2 + num2 * 3 + num3 * 5) / (2 + 3 + 5);

            System.out.printf("%.1f\n", weightedAvg);
        }

        scanner.close();

    }

}
