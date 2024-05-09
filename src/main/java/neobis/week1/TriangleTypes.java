package neobis.week1;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class TriangleTypes {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        double [] inputs = {sc.nextDouble(), sc.nextDouble(), sc.nextDouble()};
        Arrays.sort(inputs);

        double a = inputs[2];
        double b = inputs[1];
        double c = inputs[0];

        double ap = Math.pow(a,2);
        double bp = Math.pow(b,2);
        double cp = Math.pow(c,2);

        if (a >= b + c)
            System.out.println("NAO FORMA TRIANGULO");
        else if (ap > bp + cp)
            System.out.println("TRIANGULO OBTUSANGULO");
        else if  (ap == bp + cp )
            System.out.println("TRIANGULO RETANGULO");
        else if (ap < bp + cp)
            System.out.println("TRIANGULO ACUTANGULO");

        if (a == b && b == c)
            System.out.println("TRIANGULO EQUILATERO");
        else if (a == b || a == c || b == c)
            System.out.println("TRIANGULO ISOSCELES");

    }



}
