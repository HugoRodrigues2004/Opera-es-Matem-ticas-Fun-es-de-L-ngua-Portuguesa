
package matematicalinguaportuguesa;

import java.util.Scanner;

public class SemVogais {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite uma frase: ");
        String frase = sc.nextLine();
        
        String fraseSemVogais = frase.replaceAll("[AEIOUaeiou]", "");
        System.out.println("Frase sem vogais: " + fraseSemVogais);
    }    
}
