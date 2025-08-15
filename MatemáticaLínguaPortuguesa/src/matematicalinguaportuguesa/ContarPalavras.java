
package matematicalinguaportuguesa;

import java.util.Scanner;

public class ContarPalavras {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a palavra: ");
        String palavra = sc.next();
        sc.nextLine();
        System.out.print("Digite a frase: ");
        String frase = sc.nextLine();
        
        String[] palavras = frase.split("\\s+");
        int count = 0;
        for(String p : palavras){
            if(p.equalsIgnoreCase(palavra)){
                count++;
            }
        }
        System.out.println("A palavra '" + palavra + "' aparece " + count + " vezes na frase.");
    }
}
