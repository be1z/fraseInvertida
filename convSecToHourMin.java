package libroJava.tema1;

import java.util.Scanner;

// Convierte segundos en: horas, minutos y segundos
// Convert seconds to: hours, minutes and seconds

public class ej6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int seg = 0;

        seg = segRead(sc, seg);
        convSeg(seg);
    }

    static int segRead(Scanner sc, int seg) {
        System.out.print("Introduzca los segundos: ");
        seg = sc.nextInt();
        return seg;
    }

    static void convSeg(int seg) {
        int min = 0, h = 0, segAlt = 0;

        segAlt = seg;
        if (seg / 60 <= 60) {
            min = seg / 60;
            seg = seg % 60;

        } else {
            seg = seg % 60;
            min = segAlt / 60;
            h = min / 60;
            min = min % 60;
        }
        System.out.println(segAlt + " segundos son " + h + " horas, " + min + " minutos, " + seg + " segundos.");
    }
}
