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
        
    // В общем у тебя возникает ошибка при делание действительного числа(doulble). Из-за того, что они в памяти представлены 
    // как числа с плавающей точкой, то там возникает ошибка округления, вот из-за этого и у тебя ошибка. У тебя в какой-то 
    // момент число становится равным как ты думаешь 0.01, а на самом деле там выходит 0.00999999999, и при последующем делении 
    // на 0.01 не выходит в результате 1, а выходит 0. Я тебе советую при подсчете количества монет, перевести из в целое число(int),  
    // просто домножив все на 100 и считать так)
        
        System.out.println("MOEDAS:");
        for (double bankcoin: bankcoins) {
            int count = (int) (coins / bankcoin);

            String formattedNumber = df.format(bankcoin);
            System.out.println(count + " moeda(s) de R$ " + formattedNumber);
            coins = coins % bankcoin;
        }


    }
}
