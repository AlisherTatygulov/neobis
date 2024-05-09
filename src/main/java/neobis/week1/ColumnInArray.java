package neobis.week1;

import java.util.Scanner;

public class ColumnInArray {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int column = scanner.nextInt();
        char operation = scanner.next().toLowerCase().charAt(0);

        double[][] matrix = new double[12][12];


        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                matrix[i][j] = scanner.nextDouble();
            }
        }


        double result = 0;
        if (operation == 's') {

            for (int i = 0; i < 12; i++) {
                result += matrix[i][column];
            }
        }
        if (operation == 'm') {
            for (int i = 0; i < 12; i++) {
                result += matrix[i][column];
            }
                result /= 12.0;

        }


        System.out.printf("%.1f\n", result);

        scanner.close();

    }
}
