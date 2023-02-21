package libroJava.tema1;

import java.util.Scanner;

public class ej1 {

    public static void main(String[] args) {
        double baseImponible;
        int iva;
        Scanner sc = new Scanner(System.in);

        baseImponible = readBaseImp(sc);
        iva = readIVA(sc);
        resultado(baseImponible, iva);
    }

    static double readBaseImp(Scanner sc) {
        System.out.println("\nCalculadora de IVA");
        System.out.println("==================\n");
        System.out.print("Introduzca base imponible: ");
        double baseImp = sc.nextDouble();
        return baseImp;
    }

    static int readIVA(Scanner sc) {
        System.out.print("Introduzca el IVA a aplicar: ");
        int iva = sc.nextInt();
        return iva;
    }

    static void resultado(double baseImponible, int iva) {
        double iva2 = iva / 100.0;
        System.out.println("Subtotal sin IVA: " + baseImponible);
        System.out.println("IVA " + iva + "% " + "de " + baseImponible + ": " + (baseImponible * iva2));
        System.out.println("TOTAL EUR: " + (baseImponible + (baseImponible * iva2)));
    }

}
