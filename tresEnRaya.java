import java.util.Scanner;

public class tresEnRaya {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vec[][] = new int[3][3];
        int i1 = 0, i2 = 0;
        boolean swFila = false, swCol = false, swDiag = false;

        introducirNum(vec, sc, i1, i2);
        viewVec(vec, i1, i2);
        swFila = checkFila(vec, i1, i2);
        swCol = checkCol(vec, i1, i2);
        swDiag = checkDiag(vec, i1, i2);
        resultado(swCol, swDiag, swFila);
    }

    static void introducirNum(int vec[][], Scanner sc, int i1, int i2) {
        for (i1 = 0; i1 < 3; i1++) {
            for (i2 = 0; i2 < 3; i2++) {
                System.out.print("Introduzca un número [" + i1 + "][" + i2 + "]: ");
                vec[i1][i2] = sc.nextInt();
            }
        }
    }

    static void viewVec(int vec[][], int i1, int i2) {
        for (i1 = 0; i1 < 3; i1++) {
            for (i2 = 0; i2 < 3; i2++) {
                System.out.print(vec[i1][i2] + "  ");
            }
            System.out.print("\n");
        }
    }

    static boolean checkFila(int vec[][], int i1, int i2) {
        boolean swFila = false;

        for (i1 = 0; i1 < 3; i1++) {
            if (vec[i1][0] == 0 && vec[i1][1] == 0 && vec[i1][2] == 0
                    || vec[i1][0] == 1 && vec[i1][1] == 1 && vec[i1][2] == 1) {
                swFila = true;
            }
        }
        return swFila;
    }

    static boolean checkCol(int vec[][], int i1, int i2) {
        boolean swCol = false;
        for (i2 = 0; i2 < 3; i2++) {
            if (vec[0][i2] == 0 && vec[1][i2] == 0 && vec[2][i2] == 0
                    || vec[0][i2] == 1 && vec[1][i2] == 1 && vec[2][i2] == 1) {
                swCol = true;
            }
        }
        return swCol;
    }

    static boolean checkDiag(int vec[][], int i1, int i2) {
        boolean swDiag = false;
        for (i2 = 0; i2 < 3; i2++) {
            if (vec[0][0] == 0 && vec[1][1] == 0 && vec[2][2] == 0
                    || vec[0][0] == 1 && vec[1][1] == 1 && vec[2][2] == 1) {
                swDiag = true;
            }
            if (vec[0][2] == 0 && vec[1][1] == 0 && vec[2][0] == 0
                    || vec[0][2] == 1 && vec[1][1] == 1 && vec[2][0] == 1) {
                swDiag = true;
            }
        }
        return swDiag;
    }

    static void resultado(boolean swCol, boolean swDiag, boolean swFila) {
        if (swCol == true)
            System.out.println("Hay al menos 1 columna con tres en raya.");
        if (swFila == true)
            System.out.println("Hay al menos 1 fila con tres en raya.");
        if (swDiag == true)
            System.out.println("Hay al menos 1 diagonal con tres en raya.");
        System.out.println("\n[ FIN ]");
    }
}