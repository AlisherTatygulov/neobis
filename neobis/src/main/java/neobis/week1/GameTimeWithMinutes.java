package neobis.week1;

import java.io.IOException;
import java.util.Scanner;

public class GameTimeWithMinutes {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        int initialHour = scanner.nextInt();
        int initialMinute = scanner.nextInt();

        int finalHour = scanner.nextInt();
        int finalMinute = scanner.nextInt();

        int startTimeInMinutes = initialHour * 60 + initialMinute;
        int endTimeInMinutes = finalHour * 60 + finalMinute;

        int durationInMinutes;
        if (endTimeInMinutes > startTimeInMinutes) {
            durationInMinutes = endTimeInMinutes - startTimeInMinutes;
        } else {
            durationInMinutes = 24 * 60 - startTimeInMinutes + endTimeInMinutes;
        }

        int durationHours = durationInMinutes / 60;
        int durationMinutes = durationInMinutes % 60;

        System.out.println("O JOGO DUROU " + durationHours + " HORA(S) E MINUTO(S) " + durationMinutes);

        scanner.close();
    }
}
