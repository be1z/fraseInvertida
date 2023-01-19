import java.util.Scanner;

public class palindromo {

    static String tecleaFrase (Scanner e){
        System.out.print("TECLEA FRASE: ");
        String fr = e.nextLine();
        return fr;
    }

    static void compPalindromo (String frase){
        boolean sw = true;
        String frase1 = frase.trim();
        int i = 0, i2 = frase1.length()-1;

        for(i=0;i<frase1.length()-1;i++){
                if(frase1.charAt(i) != frase1.charAt(i2)){
                    sw = false;
                    i = frase1.length()-1;
                }
            i2--;
        }
        	
        if(sw == true)
            System.out.println(frase+" es palíndromo.");
            else
                System.out.println(frase+" no es palíndromo.");
    }

    public static void main (String [] args){
        Scanner e = new Scanner(System.in);
        String frase = "";

        frase = tecleaFrase(e);
        compPalindromo(frase);
        e.close();
    }  
}
