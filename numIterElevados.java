// Iteración de números elevados

import java.util.Scanner;

public class numIterElevados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numOper, a, b, c, j;
        String result = "";

        System.out.print("Número de operaciones a realizar: ");
        numOper = sc.nextInt();

        for (int i = 0; i < numOper; i++) {
            System.out.print("Número del que parte la operación: ");
            a = sc.nextInt();

            System.out.print("Número multiplicador: ");
            b = sc.nextInt();

            System.out.print("Número de veces que se va a multiplicar: ");
            c = sc.nextInt();

            for (j = 0; j < c; j++) {
                result += (a + ((int) Math.pow(2, j + 1) - 1) * b + " ");
            }
            System.out.println(result.trim());
            result = "";
        }
        sc.close();
    }
}
