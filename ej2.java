package libroJava.tema1;

import java.util.Scanner;

// Al indicarle un número calcula
// cuanto le falta para llegar a un
// número múltiplo de 7

public class ej2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0, cont = 0;

        num = readNum(sc, num);
        cont = multiploCalc(num, cont);
        resultado(num, cont);
    }

    static int readNum(Scanner sc, int num) {
        System.out.print("Introduzca un número: ");
        num = sc.nextInt();
        return num;
    }

    static int multiploCalc(int num, int cont) {
        boolean sw = false;
        int altNum = num;

        do {
            if (altNum % 7 == 0)
                sw = true;
            else {
                cont++;
                altNum++;
            }
        } while (sw != true);

        return cont;
    }

    static void resultado(int num, int cont) {
        System.out.println("A " + num + " hay que sumarle " + cont + " para que sea múltiplo de 7.");
    }
}