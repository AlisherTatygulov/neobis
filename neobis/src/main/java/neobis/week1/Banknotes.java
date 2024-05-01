package neobis.week1;

import java.io.IOException;
import java.util.Scanner;

public class Banknotes {
    public static void main(String[] args) throws IOException {

        int[] banknotes = {100, 50, 20, 10, 5, 2, 1};

        Scanner sc = new Scanner(System.in);
        int money = sc.nextInt();
        System.out.println(money);

        for (int note: banknotes) {
            int count = money / note;

            System.out.println(count + " nota(s) de R$ " + note + ".00");
            money = money % note;
        }


    }
}
