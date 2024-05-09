package neobis.week1;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class BanknotesAndCoins {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        double money = scanner.nextDouble();
        int cents = (int) (money * 100);

        int[] notes = {10000, 5000, 2000, 1000, 500, 200};
        int[] coins = {100, 50, 25, 10, 5, 1};

        System.out.println("NOTAS:");
        for (int note : notes) {
            int count = cents / note;
            System.out.println(count + " nota(s) de R$ " + (note / 100) + ".00");
            cents %= note;
        }

        System.out.println("MOEDAS:");
        for (int coin : coins) {
            int count = cents / coin;
            System.out.printf("%d moeda(s) de R$ %.2f%n", count, coin / 100.0);

            cents %= coin;
        }

        scanner.close();


    }
}
