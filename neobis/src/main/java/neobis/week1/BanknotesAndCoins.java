package neobis.week1;

import java.io.IOException;
import java.util.Scanner;

public class BanknotesAndCoins {
    public static void main(String[] args) throws IOException {

        int[] notes = {100, 50, 20, 10, 5, 2};
        double[] coins = {1, 0.50, 0.25, 0.10, 0.05, 0.01};

        Scanner sc = new Scanner(System.in);
        int money = sc.nextInt();
        System.out.println(money);

        System.out.println("NOTAS");
        for (int note: notes) {
            int count = money / note;
            System.out.println(count + " nota(s) de R$ " + note + ".00");
            money = money % note;
        }


    }
}
