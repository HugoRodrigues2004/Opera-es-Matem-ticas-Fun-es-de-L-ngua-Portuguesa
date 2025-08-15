package matematicalinguaportuguesa;

import java.util.Random;

public class Dado {
    public static void main(String[] args) {
        Random random = new Random();
        int resultado = random.nextInt(6) + 1;
        System.out.println("Jogada: " + resultado);
    }
    
}
