import java.util.Scanner;

public class palindromo {

    static String tecleaFrase (Scanner e){
        System.out.print("TECLEA FRASE: ");
        String fr = e.nextLine();
        return fr;
    }

    static void compPalindromo (String frase){
        int i = 0, i2 = frase.length()-1;
        boolean sw = true;

        for(i=0;i<frase.length()-1;i++){
            if(frase.charAt(i) != ' '){
                if(frase.charAt(i) != frase.charAt(i2)){
                    sw = false;
                    i = frase.length()-1;
                }
            i2--;
            }
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
