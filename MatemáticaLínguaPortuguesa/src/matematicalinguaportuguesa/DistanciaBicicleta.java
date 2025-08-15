
package matematicalinguaportuguesa;

import java.util.Scanner;
import java.lang.Math;

public class DistanciaBicicleta {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o número de voltas: ");
        int voltas = sc.nextInt();
        System.out.print("Digite o diâmetro da roda em metros: ");
        double diametro = sc.nextDouble();
        
        double comprimento = 3.1416 * diametro;
        double distancia = comprimento * voltas;
        int distanciaArredondada = (int)Math.ceil(distancia);
        System.out.println("Distância percorrida: " + distanciaArredondada);
    }
}
