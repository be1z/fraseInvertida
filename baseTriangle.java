package libroJava.tema1;

import java.util.Scanner;

// Calculadora del área de un triángulo
// Triangle base calculator

public class ej4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b = 0, h = 0;

        b = bRead(sc, b);
        h = hRead(sc, h);
        baseCalc(b, h);

    }

    static int bRead(Scanner sc, int b) {
        System.out.print("Introduzca la base del triángulo: ");
        b = sc.nextInt();
        return b;
    }

    static int hRead(Scanner sc, int h) {
        System.out.print("Introduzca la altura del triángulo: ");
        h = sc.nextInt();
        return h;
    }

    static void baseCalc(int b, int h) {
        System.out.println("El área del triángulo es de " + (b * h) / 2);
    }

}
