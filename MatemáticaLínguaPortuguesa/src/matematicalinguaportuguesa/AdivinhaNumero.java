
package matematicalinguaportuguesa;

import java.util.Scanner;

public class AdivinhaNumero {
    public static void main(String[] args){
        int numeroSorteado = (int)(Math.random() * 10);
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número de 0 a 9: ");
        int numeroUsuario = sc.nextInt();
        
        if(numeroSorteado == numeroSorteado){
            System.out.println("Parabéns! Você acertou.");
        }else{
            System.out.println("Errado! O número sorteado era: " + numeroSorteado);
        }
    }
}
