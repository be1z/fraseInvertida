import java.util.Scanner;

public class intercalarFraseMenu {

    static int menu (int o, Scanner e){
        System.out.println("\n\tMENU\n\t====\n");
        System.out.println("1.- Teclear frases.");
        System.out.println("2.- Intercalar frases.");
        System.out.println("3.- Visualizar frase intercalada.");
        System.out.println("4.- Exit.");
        do{
            System.out.println("\n\tTeclee opción (1-4)?");
            o = e.nextInt();
        }while(o<1 || o>4);
        e.nextLine();
        System.out.println("");
        return o;
    }

    static String teclearFrase (Scanner e){
        System.out.print("Teclea frase: ");
        String fr = e.nextLine();
        System.out.print("");
        return fr;
    }

    static String intercFrase (String frase1, String frase2){
        String fraseInterc = "";
        int i = 0, i2 = 0;
        boolean sw = false, sw2 = false;
        i2 = frase2.length()-1;

        do{
            if(i<frase1.length())
            fraseInterc += frase1.charAt(i);

            if(i2>-1)
            fraseInterc += frase2.charAt(i2);

            if(i>=frase1.length() && i2<0)
            sw2 = true;

            if(sw2 == true)
            sw = true;

            i++;
            i2--;
        }while(sw == false);

        System.out.println("\n[ Intercalando frase... ]");
        return fraseInterc;
    } 

    static void visualFrase (String fraseInter){
        System.out.println("\n[ Frase intercalada: "+fraseInter+" ]");
    }

    public static void main (String [] args){
        Scanner e = new Scanner(System.in);
        String frase1 = "", frase2 = "", fraseInter = "";
        int o = 0;

        do{
            o = menu(o, e);
            switch(o){
                case 1:
                    frase1 = teclearFrase(e);
                    frase2 = teclearFrase(e);
                    break;
                case 2:
                    fraseInter = intercFrase(frase1, frase2);
                    break;
                case 3:
                    visualFrase(fraseInter);
                    break;
                case 4:
                    System.out.println("\n[ FINALIZADO ] \n");
                    break;
            }
        }while(o!=4);
        e.close();
    }
    
}
