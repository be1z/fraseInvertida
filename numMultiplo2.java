package libroJava.tema1;

import java.util.Scanner;

// Escribes dos numeros y te dice cuanto
// le falta al primer numero para llegar a
// un número multiplo del segundo número
// que le introducimos.

public class ej3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0, numMultiplo = 0, cont = 0;

        num = readNum(sc, num);
        numMultiplo = readNumMult(sc, numMultiplo);
        cont = multiploCalc(num, numMultiplo, cont);
        resultado(num, numMultiplo, cont);
    }

    static int readNum(Scanner sc, int num) {
        System.out.print("Introduzca un número: ");
        num = sc.nextInt();
        return num;
    }

    static int readNumMult(Scanner sc, int numMultiplo) {
        System.out.print("Introduzca otro número: ");
        numMultiplo = sc.nextInt();
        return numMultiplo;
    }

    static int multiploCalc(int num, int numMultiplo, int cont) {
        boolean sw = false;
        int altNum = num;

        do {
            if (altNum % numMultiplo == 0)
                sw = true;
            else {
                cont++;
                altNum++;
            }
        } while (sw != true);

        return cont;
    }

    static void resultado(int num, int numMultiplo, int cont) {
        System.out.println("A " + num + " hay que sumarle " + cont + " para que sea múltiplo de " + numMultiplo + ".");
    }
}
