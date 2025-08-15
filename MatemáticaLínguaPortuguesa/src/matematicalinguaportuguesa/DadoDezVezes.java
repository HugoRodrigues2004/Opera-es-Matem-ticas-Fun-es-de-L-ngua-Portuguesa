
package matematicalinguaportuguesa;

import java.util.Random;

public class DadoDezVezes {
    public static void main(String args[]){
        Random random = new Random();
        System.out.println("Jogadas:");
        for(int i = 0; i < 10; i++){
            int resultado = random.nextInt(6) + 1;
            System.out.println("Jogada " + (i+1) + ": " + resultado);
        }
    }
}
