
package matematicalinguaportuguesa;

import java.util.Scanner;

public class EfeitoPalavra {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite uma palavra: ");
        String palavra = sc.nextLine();
        
        for(int i = 1; i <= palavra.length(); i++){
            System.out.println(palavra.substring(0, i));
        }
        
        for(int i = palavra.length() - 1; i >= 1; i--){
            System.out.println(palavra.substring(0, i));
        }
    }
}
