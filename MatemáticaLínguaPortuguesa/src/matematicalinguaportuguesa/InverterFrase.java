package matematicalinguaportuguesa;

import java.util.Scanner;

public class InverterFrase {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite uma frase: ");
        String frase = sc.nextLine();
        
        String fraseInvertida = new StringBuilder(frase).reverse().toString();
        System.out.println("Frase invertida: " + fraseInvertida);
    }
}
