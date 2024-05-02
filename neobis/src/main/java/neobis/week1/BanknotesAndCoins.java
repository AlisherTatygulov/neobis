package neobis.week1;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class BanknotesAndCoins {
    public static void main(String[] args) throws IOException {

        int[] banknotes = {100, 50, 20, 10, 5, 2};
        double[] bankcoins = {1.00, 0.50, 0.25, 0.10, 0.05, 0.01};

        Scanner sc = new Scanner(System.in);
        double money = sc.nextDouble();
        int notes = (int) money;
        double coins = money - notes;

        System.out.println("NOTAS:");
        for (int banknote: banknotes) {
            int count = notes / banknote;
            System.out.println(count + " nota(s) de R$ " + banknote + ".00");
            notes = notes % banknote;
        }

         DecimalFormat df = new DecimalFormat("0.00");


        coins = notes + coins;

        System.out.println("MOEDAS:");
        for (double bankcoin: bankcoins) {
            int count = (int) (coins / bankcoin);

            String formattedNumber = df.format(bankcoin);
            System.out.println(count + " moeda(s) de R$ " + formattedNumber);
            coins = coins % bankcoin;
        }


    }
}
